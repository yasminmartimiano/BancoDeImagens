package com.yasminmartimiano.BancoDeImagens.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasminmartimiano.BancoDeImagens.Model.ImagemModel;
import com.yasminmartimiano.BancoDeImagens.Repository.ImagemRepository;

@Service
public class ImagemService {

    @Autowired
    private ImagemRepository repository;

    public List<ImagemModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<ImagemModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public ImagemModel salvar(ImagemModel imagemModel){
        return repository.save(imagemModel);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
