package com.kashannadeem.springframework.springdependencyinjectiondemo;

import ch.qos.logback.core.CoreConstants;
import com.kashannadeem.springframework.springdependencyinjectiondemo.controllers.ConstructorInjectedController;
import com.kashannadeem.springframework.springdependencyinjectiondemo.controllers.MyController;
import com.kashannadeem.springframework.springdependencyinjectiondemo.controllers.PropertyInjectedController;
import com.kashannadeem.springframework.springdependencyinjectiondemo.controllers.SetterInjectedController;
import com.kashannadeem.springframework.springdependencyinjectiondemo.examplebeans.FakeDataSource;
import com.kashannadeem.springframework.springdependencyinjectiondemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDependencyInjectionDemoApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());

		FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) context.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());
	}

}
