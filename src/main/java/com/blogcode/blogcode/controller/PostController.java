package com.blogcode.blogcode.controller;

import com.blogcode.blogcode.model.Mensagem;
import com.blogcode.blogcode.model.Post;
import com.blogcode.blogcode.repository.MensagemRepository;
import com.blogcode.blogcode.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PostController {
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	MensagemRepository mensagemRepository;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/sobre")
	public String sobre() {
		return "blog/sobre";
	}

	@GetMapping("/curso")
	public String curso() {
		return "blog/curso";
	}
	
	@GetMapping("/mensagem")
	public String cadastroMensagem() {
		return "mensagem/cadastrarMensagem";
	}
	
	@PostMapping("/mensagem")
	public String cadastroMensagem(Mensagem mensagem) {
		mensagemRepository.save(mensagem);
		return "mensagem/cadastrarMensagem";
	}
	
	@GetMapping("/cadastro-post-xyz")
	public String cadastro() {
		return "blog/cadastroPost";
	}
	
	@PostMapping("/cadastro-post-xyz")
	public String cadastro(Post post) {
		postRepository.save(post);
		return "blog/cadastroPost";
	}
	
	@GetMapping("/post")
	public ModelAndView post() {
		ModelAndView model = new ModelAndView("blog/post");
		Iterable<Post> post = postRepository.findAll();
		model.addObject("post", post);
		return model;
	}
	
	@GetMapping("/detalhe-post/{id}")
	public ModelAndView detalhePost(@PathVariable("id") Long id) {
		ModelAndView model = new ModelAndView("blog/detalhePost");
		Post post = postRepository.getById(id);
        model.addObject("post",  post);
		return model;
	}
}
