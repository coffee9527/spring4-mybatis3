package com.coffee.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coffee.configuration.bean.AccountRepository;
import com.coffee.configuration.bean.TransferService;
import com.coffee.configuration.bean.TransferServiceImpl;

@Configuration
public class ServiceConfig {
	@Bean
    public TransferService transferService(AccountRepository accountRepository) {
        return new TransferServiceImpl(accountRepository);
    }
}
