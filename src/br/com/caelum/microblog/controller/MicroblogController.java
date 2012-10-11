package br.com.caelum.microblog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.microblog.dao.MensagemDao;
import br.com.caelum.microblog.model.Mensagem;

@Controller
public class MicroblogController {
	
	@RequestMapping("timeline")
	public String form(Model model) {
		List<Mensagem> lista = new MensagemDao().lista();
		model.addAttribute("mensagens", lista);
		
		return "lista";
	}
	
	@RequestMapping(value="novaMensagem")
	public String adiciona(Mensagem mensagem) {
		new MensagemDao().adiciona(mensagem);
		
		return "redirect:timeline";
	}
}
