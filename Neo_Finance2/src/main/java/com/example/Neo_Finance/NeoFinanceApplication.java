package com.example.Neo_Finance;

import com.example.Neo_Finance.domain.User;
import com.example.Neo_Finance.service.UserService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.Neo_Finance"})
public class NeoFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeoFinanceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserService userService){
		return args -> {
			HttpURLConnection connection;
			String line, responseBody="";
			StringBuffer responsecontent = new StringBuffer();

			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
			URL inputStream = new URL("https://arkneofinance.com/api/sample_credit_report");


			try {
				List<User> users = mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true).readValue(inputStream,typeReference);

				userService.saveAll(users);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}

}
