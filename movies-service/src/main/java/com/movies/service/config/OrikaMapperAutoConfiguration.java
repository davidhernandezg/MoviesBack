package com.movies.service.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ma.glasnost.orika.MapperFacade;

@Configuration
public class OrikaMapperAutoConfiguration {

	@Bean
	public FactoryBean<MapperFacade> orikaServiceMapper() {
		return new MapperFacadeFactory();
	}
}
