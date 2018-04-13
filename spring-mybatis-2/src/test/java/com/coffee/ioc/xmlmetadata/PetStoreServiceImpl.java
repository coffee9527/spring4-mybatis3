package com.coffee.ioc.xmlmetadata;

import java.util.List;

public class PetStoreServiceImpl implements PetStoreService{
	
	private ItemDao itemDao;
	private AccountDao accountDao;
	
	
	
	public ItemDao getItemDao() {
		return itemDao;
	}



	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}



	public AccountDao getAccountDao() {
		return accountDao;
	}



	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}



	public List<String> getUsernameList() {
		return itemDao.getUsernameList();
	}
	
	
}
