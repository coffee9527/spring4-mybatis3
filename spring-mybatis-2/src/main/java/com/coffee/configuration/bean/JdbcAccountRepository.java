package com.coffee.configuration.bean;

import javax.sql.DataSource;

public class JdbcAccountRepository implements AccountRepository {
	private DataSource dataSource;
	
	public JdbcAccountRepository(DataSource datasource) {
		this.dataSource = datasource;
	}
	
	
}
