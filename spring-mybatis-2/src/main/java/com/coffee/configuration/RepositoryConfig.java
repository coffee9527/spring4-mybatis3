package com.coffee.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coffee.configuration.bean.AccountRepository;
import com.coffee.configuration.bean.JdbcAccountRepository;
@Configuration
public class RepositoryConfig {
	 @Bean
    public AccountRepository accountRepository(DataSource dataSource) {
        return new JdbcAccountRepository(dataSource);
    }
}
