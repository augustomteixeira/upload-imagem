package com.augustomteixeira.uploadimagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.augustomteixeira.uploadimagem.model.dto.ImagemDto;
import com.augustomteixeira.uploadimagem.service.ImagemService;

@Controller
@RequestMapping(value = "/imagem")
public class ImagemController {
	
	@Autowired
	private ImagemService imagemService;
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public ModelAndView salvarImagem(ImagemDto imagemDto) {
		imagemService.salvarImagem(imagemDto);
		
		ModelAndView mv = new ModelAndView("redirect:/");
		return mv;
	}
	
}
