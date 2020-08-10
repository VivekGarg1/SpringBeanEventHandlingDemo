package com.home.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartEventHandler implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent cse) {
		System.out.println("ContextStartedEvent Recieved: ");
		System.out.println(cse.getSource());
		System.out.println("---------------------");
	}

}
