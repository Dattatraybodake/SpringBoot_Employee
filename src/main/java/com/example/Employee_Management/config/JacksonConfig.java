package com.example.Employee_Management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class JacksonConfig {
	@Bean
	public ObjectMapper objectmapper()
	{
		ObjectMapper mapper= new ObjectMapper();
		mapper.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
		return mapper;	
	}
}