package com.coffee.configuration.bean;

public class TransferServiceImpl implements TransferService {
	private AccountRepository accountRepository;
	
	public TransferServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	public void transfer(Double f, String name, String desc) {
		System.out.println("f:" + f + " name:" + name + " desc:" +desc);
		
	}

}
