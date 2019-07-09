package com.example.nnform;

import java.beans.PropertyEditorSupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.example.nnform.dao.ContactFormDAO;
import com.example.nnform.dao.ContactFormDAOImpl;
import com.example.nnform.model.ContactForm;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.nnform"})
public class NnformApplication  extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NnformApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(NnformApplication.class, args);
	}
	
}
