package com.rg.application;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rg.bo.HackerBo;

@SpringBootApplication
public class Main {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}
	
	@Bean
	public IgniteCache<Integer, HackerBo> hackerCache(){
		Ignite ignite = Ignition.start();
		IgniteCache<Integer, HackerBo> hackerCache = ignite.getOrCreateCache("hackerCache!");
//		ignite.compute().broadcast(()->System.out.println(cache.get(1) + " " + cache.get(2)));
		return hackerCache;
	}
	
	
}
