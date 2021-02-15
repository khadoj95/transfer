package controller;

import Repository.ClientRepository;
import Entite.Client;  
import Service.ClientService;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
//import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping("/client")
public class Clientcontroller {
	
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
	public Optional<Client> getOne(Integer Id)
	{
		return clientservice.getOne(Id);
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
	
	//@Autowired
		//private ClientRepository compterepository;
		
		//@RequestMapping("/index")
		//public String index(Model model,@RequestParam(name="p",defaultValue="0")int p){
		//	Page<Client> lc = clientrepository.findAll(new QPageRequest(p, 5));
		//	int pC=lc.getTotalPages();
		//int[] pages = new int[pC];
		//	for(int i=0;i<pC;i++)pages[i]=i;
		//model.addAttribute("pages",pages);
		//model.addAttribute("clients",lc);	
		//model.addAttribute("pageCourante",p);
		//return "client";
		//}
		
		
	}
