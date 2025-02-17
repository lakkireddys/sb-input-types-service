package com.edu.sb.input.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sb.input.config.ApplicationConfig;
import com.edu.sb.input.model.Address;
import com.edu.sb.input.model.Person;
import com.edu.sb.input.model.User;


@RestController
public class SbInputTypesController {
	
	final Logger logger = LoggerFactory.getLogger(SbInputTypesController.class);
	
	private final ApplicationConfig config;
	
	
	public SbInputTypesController(ApplicationConfig config) {
		super();
		this.config = config;
	}
	@GetMapping("/get-request-params")
	public String processRequestParams(@RequestParam String id, @RequestParam String name) {
		logger.info("received input id is {} and name is {}", id, name);
		return id.concat(" - "+name);
	}
	@GetMapping("/get-path-params/{id}")
	public String processQueryParams(@PathVariable String id) {
		logger.info("received input id is {} ", id );
		return id.concat(" - ");
	}
	
	@PostMapping("/post-body")
	public User processPostBody(@RequestBody Person person) {
		logger.info("this is post call {}",person.getName() );
		return new User(person.getName(), person.getAge(), new Address(config.getPlace(), config.getState()));
	}

}
