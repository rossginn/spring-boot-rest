package com.rg.application;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.rg.resource.SampleResource;

@Component
public class JerseyConfiguration extends ResourceConfig{

	/**
	 * Jerysey setup
	 */
	public JerseyConfiguration(){
		register(SampleResource.class);
	}
	
}
