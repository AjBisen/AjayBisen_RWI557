package com.Configrition;

import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {
	
	
		private Test test;
		
		public Test getTest() {
			return test;
		}

		public void setTest(Test test) {
			this.test = test;
		}


		public Student(Test test) {
			super();
			this.test = test;
		}

		public void study()

		{
			this.test.display();
			System.out.println("student is reading book");
			
		}
		
		
	}

