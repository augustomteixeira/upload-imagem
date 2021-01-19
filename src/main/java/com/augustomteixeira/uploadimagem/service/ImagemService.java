package com.augustomteixeira.uploadimagem.service;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.augustomteixeira.uploadimagem.model.Imagem;
import com.augustomteixeira.uploadimagem.model.dto.ImagemDto;
import com.augustomteixeira.uploadimagem.repository.ImagemRepository;

@Service
public class ImagemService {

	@Autowired
	private ImagemRepository imagemRepository;

	public Imagem salvarImagem(ImagemDto imagemDto) {
		Imagem imagem = new Imagem();
		
		if (imagemDto != null) {
			if (imagemDto.getCodigoBase64() != null && !imagemDto.getCodigoBase64().isEmpty()) {
				String[] codigoSeparado = imagemDto.getCodigoBase64().split(",");
				String codigoImagem = codigoSeparado[1];
				imagem.setCodigoBase64(Base64.getDecoder().decode(codigoImagem));
				return imagemRepository.save(imagem);
			}
		}
		
		return null;
	}
	
	public List<Imagem> listaImagem() {
		return imagemRepository.findAll();
	}

}
