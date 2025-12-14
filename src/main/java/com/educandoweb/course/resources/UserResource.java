package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController
@RequestMapping(value = "/users") //endpoint da url
public class UserResource {
	
	@Autowired //injecao automatica de dependencia do servico UserService
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		//User u = new User(1L, "Maria",  "maria@gmail.com", "1199999999", "12345");
		// endpoint para buscar todos
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);	
		
	}
	
	@GetMapping(value = "/{id}")  //endpoint da url, passando id para busca por id
	public ResponseEntity<User> findById(@PathVariable Long id){		
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
