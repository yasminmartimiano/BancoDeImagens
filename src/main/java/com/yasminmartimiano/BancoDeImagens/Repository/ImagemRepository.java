package com.yasminmartimiano.BancoDeImagens.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yasminmartimiano.BancoDeImagens.Model.ImagemModel;

@Repository
public interface ImagemRepository extends JpaRepository<ImagemModel, Long> {
}
