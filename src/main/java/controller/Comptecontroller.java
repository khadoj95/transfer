package controller;


import Entite.Client;
import Entite.Compte;  

import Repository.ComteRepository;
import Service.CopmtService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import javax.validation.Valid;
@Controller
@RequestMapping("/compte")
public class Comptecontroller {
	@Autowired
	public ComteRepository ComteRepository;
	@Autowired
	public CopmtService compservice;
	
	@RequestMapping("/getal")
	public String getAl(Model model) {
		List<Compte> Compte = compservice.getal();
		model.addAttribute("compte", Compte);
		return "indeex";
	}
	
	@RequestMapping("/getOn/{id}") 
	@ResponseBody
	public Optional<Compte> getOne(Integer Id)
	{
		return compservice.getOn(Id);
	}
	
	@RequestMapping(value="/delete",  method ={RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		compservice.supp(id);
		return "redirect:/compte/getal";
	}
	
	@RequestMapping(value="/retirer" , method= RequestMethod.GET)
	public String retirer(Integer compte1,long solde){
		ComteRepository.retirer(compte1, solde);
	return "redirect:/compte/getal";
   }
   @RequestMapping(value="/versser" , method= RequestMethod.GET)
 		public String versser(Integer compte1,long solde){
	   ComteRepository.versser(compte1, solde);
 		return "redirect:/compte/getal";
 		
 	   }
   @RequestMapping(value="/virement" , method= RequestMethod.GET)
	public String virement(Integer compte1,Integer compte2,long solde){
	   ComteRepository.retirer(compte1, solde);
	   ComteRepository.versser(compte2, solde);
	return "redirect:/compte/getal";
	
   }
   
   @PostMapping("/ajoute")
	public String ajoute(Compte c) {
	   compservice.ajoute(c);
		return "redirect:/compte/getal";
	}
   
}

