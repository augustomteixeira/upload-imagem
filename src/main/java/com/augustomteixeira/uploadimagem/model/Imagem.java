package com.augustomteixeira.uploadimagem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idImagem;
	
	private String codigoBase64;

	public Integer getIdImagem() {
		return idImagem;
	}

	public void setIdImagem(Integer idImagem) {
		this.idImagem = idImagem;
	}

	public String getCodigoBase64() {
		return codigoBase64;
	}

	public void setCodigoBase64(String codigoBase64) {
		this.codigoBase64 = codigoBase64;
	}
	
	
	
}
