package com.augustomteixeira.uploadimagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.augustomteixeira.uploadimagem.model.Imagem;


@Repository
public interface ImagemRepository extends JpaRepository<Imagem, Integer> {

}
