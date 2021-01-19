package com.augustomteixeira.uploadimagem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.augustomteixeira.uploadimagem.model.Imagem;
import com.augustomteixeira.uploadimagem.repository.ImagemRepository;

@Service
public class ImagemService {

	@Autowired
	private ImagemRepository imagemRepository;

	public Imagem salvarImagem(Imagem imagem) {
		if (imagem != null) {
			return imagemRepository.save(imagem);
		}
		return null;
	}
	
	public List<Imagem> listaImagem() {
		return imagemRepository.findAll();
	}

}
