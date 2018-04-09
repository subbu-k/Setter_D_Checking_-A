package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;
public class Client {

	public static void main(String[] args)throws Exception {
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("resource/Spring.xml"); 
		Test t=(Test)ap.getBean("t1");
		t.PrintCon();
	}
	
}

