package edu.com.ies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.com.ies.dao.PersonaDao;
import edu.com.ies.domain.Persona;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private PersonaDao personaDao;
	
	@GetMapping("")
	public String inicio(Model model) {
		List<Persona> personas = personaDao.findAll();
		model.addAttribute("personas", personas);
		return "index";
	}
}
