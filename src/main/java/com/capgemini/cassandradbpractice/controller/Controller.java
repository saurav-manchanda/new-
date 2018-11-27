package com.capgemini.cassandradbpractice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@GetMapping("/")
	public ResponseEntity<String> getFromTable(){
//	utility.creatingKeySpace();
		return new ResponseEntity<>("hello Saurav",HttpStatus.OK);
	}
}
