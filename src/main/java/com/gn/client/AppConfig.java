package com.gn.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gn.repository.EmpRepository;
import com.gn.repository.EmpRepositoryImp;
import com.gn.service.EmpService;
import com.gn.service.EmpServiceImp;

@Configuration // application-context.xml file is replaced by configuration
public class AppConfig {
	
	@Bean(name = "empService")
	public EmpService getEmpService() {
		// using constructor injection
//		return new EmpServiceImp(getEmpRepository());
		
		// using setter injection
//		EmpServiceImp empService = new EmpServiceImp();
//		empService.setEmpRepository(getEmpRepository());
//		return empService;
		
		//autowired
		EmpServiceImp empService = new EmpServiceImp();
		return empService;
	}
	
	@Bean(name = "empRepository")
	public EmpRepository getEmpRepository() {
		return new EmpRepositoryImp();
	}

}
