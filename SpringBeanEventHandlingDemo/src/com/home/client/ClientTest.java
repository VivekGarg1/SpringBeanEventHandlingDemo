package com.home.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.event.handler.CustomEventPublisher;
import com.home.model.Message;

public class ClientTest {
	
	public static void main(String[] args) {
		
		/*
		 * ConfigurableApplicationContext context=new
		 * ClassPathXmlApplicationContext("Beans.xml");
		 * 
		 * context.start(); Message message = context.getBean(Message.class, "message");
		 * if(message!=null)
		 * System.out.println(message.getMessageId()+"\t"+message.getMessage());
		 * System.out.println("---------------------------");
		 */
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		 
		CustomEventPublisher customEventPublisher=context.getBean("customEventPublisher", CustomEventPublisher.class);
		customEventPublisher.publishEvent();
		//context.stop();
		((AbstractApplicationContext) context).close();
	}

}
