package com.gn.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gn.model.Employee;
import com.gn.service.EmpService;

public class EmpClient {
	public static void main(String[] args) {

		// without using spring 
//		EmpService empSvc = new EmpServiceImp();
		
		// spring with xml configuration 
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		// spring with java config
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmpService empSvc = appContext.getBean("empService", EmpService.class);
		List<Employee> empList = empSvc.getAll();

		System.out.println(empList);
		
		
	}

}
