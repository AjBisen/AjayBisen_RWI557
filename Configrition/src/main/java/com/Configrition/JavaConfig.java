package com.Configrition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.Configrition")
public class JavaConfig {
	
		@Bean
		public Test getTest()
		{
			return new Test();
		}
		@Bean(name= {"student","temp","con"})
		public Student getStudent()
		{ 
			//creating a new student object
			Student student=new Student(getTest());
			return student;
		}
		

	}


