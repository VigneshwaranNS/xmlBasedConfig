package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Employee;

@SpringBootApplication
public class XmlbasedConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlbasedConfigApplication.class, args);
		
		/// XML Based Config then only we go with ClassPathXmlApplicationContext
//		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext123.xml");
//		
//		Employee emp = (Employee) app.getBean("emp_id");

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext123.xml");

		Employee emp = (Employee) factory.getBean("emp_id");

		System.err.println(emp.getName());
		
	}

}
