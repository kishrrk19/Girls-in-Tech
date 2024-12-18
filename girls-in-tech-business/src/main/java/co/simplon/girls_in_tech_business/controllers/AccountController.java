package co.simplon.girls_in_tech_business.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.girls_in_tech_business.dtos.AccountCreate;
import co.simplon.girls_in_tech_business.services.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	private final AccountService service;

	public AccountController(AccountService service) {
		this.service = service;
	}
	
	@PostMapping("/creer-compte")
	@ResponseStatus(HttpStatus.CREATED)
	void create(@RequestBody AccountCreate inputs) {
		service.create(inputs);
	}
	
}
