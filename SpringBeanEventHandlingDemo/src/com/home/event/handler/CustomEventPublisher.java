package com.home.event.handler;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.event.ApplicationEventMulticaster;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher=applicationEventPublisher;
	}
	
	public void publishEvent() {
		CustomEvent customEvent=new CustomEvent(this);
		applicationEventPublisher.publishEvent(customEvent);
	}

}
