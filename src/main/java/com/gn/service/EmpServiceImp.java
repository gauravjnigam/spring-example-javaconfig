package com.gn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gn.model.Employee;
import com.gn.repository.EmpRepository;

@Service("empService")
public class EmpServiceImp implements EmpService {

	private EmpRepository empRepository;
	
	@Autowired
	public void setEmpRepository(EmpRepository empRepository) {
		System.out.println("Using setter injection...");
		this.empRepository = empRepository;
	}
	
	public EmpServiceImp() {
		
	}
	
	public EmpServiceImp(EmpRepository empRepository) {
		System.out.println("using constructor injection...");
		this.empRepository = empRepository;
	}
	
	public List<Employee> getAll() {
		return empRepository.getAll();
	}
}
