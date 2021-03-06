package controller;

import Entite.Client;
import Entite.Compte;
import Service.ClientService;
import Repository.ClientRepository;
import Repository.ComteRepository;
import Service.CopmtService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
//import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping("/client")
public class Clientcontroller {
	@Autowired
	   private ClientRepository clientRepository;
	@Autowired
	private ClientService clientservice;
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Client> client = clientservice.getall();
		model.addAttribute("client", client);
		return "index";
	}
	@RequestMapping("/getOne") 
	@ResponseBody
	public Optional<Client> getOne(Integer id)
	{
		return clientservice.getOne(id);
	}
	
	@PostMapping("/ajoute")
	public String ajoute(Client c) {
		clientservice.ajoute(c);
		return "redirect:/client/getAll";
	}
	
	@RequestMapping(value="/delete",  method ={RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		clientservice.sup(id);
		return "redirect:/client/getAll";
	}
	
	 @RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	 public String updatet (Client client) {
		 clientservice.update(client);
	 	return "redirect:/client/getAll";
	 }
	 
	
	
}