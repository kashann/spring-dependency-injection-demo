package com.kashannadeem.springframework.springdependencyinjectiondemo;

import com.kashannadeem.springframework.springdependencyinjectiondemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDependencyInjectionDemoApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");
		controller.hello();
	}

}
