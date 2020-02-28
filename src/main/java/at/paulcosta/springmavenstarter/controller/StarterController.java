package at.paulcosta.springmavenstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import at.paulcosta.springmavenstarter.dao.service.OracleDbService;

@Controller
public class StarterController {
	// inject DAO
	@Autowired
	private OracleDbService oracleDbService;
		
	
	@GetMapping("/")
	public String home(Model theModel) {
		
		String allTextsFromDb = (String.join("", oracleDbService.GetAllTexts()));
		
		theModel.addAttribute("allTextsFromDb", allTextsFromDb);
		
		return "index";
	}
}
