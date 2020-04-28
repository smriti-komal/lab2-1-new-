package com.cg.lab2.trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lab2.trainee.entity.Trainee1;
import com.cg.lab2.trainee.interfaces.TraineeServiceInterface;

@RestController
public class TraineeController {
	
	@Autowired
	private TraineeServiceInterface ts;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/listalltrainee")
	public String viewHomePage(Model model) {
	    List<Trainee1> listtrainee = ts.retrieve();
	    model.addAttribute("list of trainee", listtrainee);
	     
	    return "home";
	}
	
	@RequestMapping(value = "/addtrainee", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("Add Trainee") Trainee1 trainee) {
		ts.addtrainee(trainee);
		
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "traineeid") int traineeid) {
		ts.delete(traineeid);
		return "redirect:/";		
	}



}