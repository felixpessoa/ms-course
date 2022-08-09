package com.devsuperior.hrworker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repository.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	
	public List<Worker> findAll(){
		return workerRepository.findAll();
	}


	public Worker findById(Long id) {
		Optional<Worker> optObj = workerRepository.findById(id);
		return optObj.orElseThrow();
	}

}
