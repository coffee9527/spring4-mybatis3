package com.coffee.ioc.xmlmetadata;

import java.util.ArrayList;
import java.util.List;

public class JpaItemDao implements ItemDao {
	private static List<String> usernameList;
	
	static {
		usernameList = new ArrayList<String>();
		usernameList.add("a");
		usernameList.add("b");
		usernameList.add("c");
	}
	
	public List<String> getUsernameList() {
		return usernameList;
	}
}
