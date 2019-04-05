package br.com.mtools.security.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public String teste() {
		return "Hello world!";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "Index Page";
	}
}
