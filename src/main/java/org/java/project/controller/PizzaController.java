package org.java.project.controller;

import java.util.List;

import org.java.project.pojo.Pizza;
import org.java.project.serv.ServicePizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PizzaController {
	@Autowired
	private ServicePizza servicePizza;
	
	@GetMapping("/")
	public String getHome(Model model) {
		
		List<Pizza> pizza = servicePizza.findAll();
		
		model.addAttribute("pizzas", pizza);
		
		return "index";
	}
}
