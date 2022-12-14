package com.devsuperior.hrworker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.services.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	@Autowired
	public WorkerService workerService;
	
	
	@GetMapping
	 public ResponseEntity<List<Worker>> findAll(){
		 List<Worker> list = workerService.findAll();
		 return ResponseEntity.ok(list);
	 }
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id){
		Worker worker = workerService.findById(id);
		return ResponseEntity.ok(worker);
	}

}
