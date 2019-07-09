package com.example.nnform.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.nnform.dao.ContactFormDAO;
import com.example.nnform.model.ContactForm;

@RestController
public class FormController {

	 @Autowired
	    private ContactFormDAO contactDAO;
	
	@GetMapping("/")
	public ModelAndView homePage() {
			 ModelAndView mav = new ModelAndView();
			    mav.setViewName("index");
			    mav.addObject("contact", new ContactForm());
			    return mav;
		}
	
	@PostMapping("/addContact")
	public ModelAndView save(@ModelAttribute("contact") @Valid ContactForm contact,BindingResult results, ModelAndView model) {
		if (results.hasErrors()) {
					model.setViewName("index");
			model.addObject("contact",
					  contact); 
			return model;}
		    contactDAO.saveOrUpdate(contact);
		    return new ModelAndView("index");
	}
	
}
