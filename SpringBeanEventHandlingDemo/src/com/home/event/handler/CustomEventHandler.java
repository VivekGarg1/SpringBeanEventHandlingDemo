package com.home.event.handler;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent customEvent) {
		customEvent.toString();
	}

}
