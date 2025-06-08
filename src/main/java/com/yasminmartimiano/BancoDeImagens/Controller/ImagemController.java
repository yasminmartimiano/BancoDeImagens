package com.yasminmartimiano.BancoDeImagens.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yasminmartimiano.BancoDeImagens.Model.ImagemModel;
import com.yasminmartimiano.BancoDeImagens.Service.ImagemService;

@RestController
@RequestMapping("/imagem")
public class ImagemController {

    private final ImagemService imagemService;

    public ImagemController(ImagemService imagemService){
        this.imagemService = imagemService;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
    try {
        
        byte[] imageData = file.getBytes();

        return ResponseEntity.ok("Imagem recebida com sucesso!");
        
    } catch (IOException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao processar imagem.");
    }
    }


    @GetMapping
    public List<ImagemModel> listarImagens(){
        return imagemService.listarTodos();
    }

    @PostMapping
    public ImagemModel salvar(@RequestBody ImagemModel imagemModel) {
        return imagemService.salvar(imagemModel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ImagemModel> atualizar(@PathVariable Long id, @RequestBody ImagemModel imagemModel) {
        if (!imagemService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        imagemModel.setId(id);
        return ResponseEntity.ok(imagemService.salvar(imagemModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!imagemService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        imagemService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
