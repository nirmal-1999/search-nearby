package com.nearby.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig {
	
	@Bean
	private MongoTemplate mongoTemplate()
	{
		String url = "";
		String database = "";
		return new MongoTemplate(MongoClients.create(url), database);
	}
}
