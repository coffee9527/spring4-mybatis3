package com.coffee.examples;

public class DefaultServiceLocator {
	private static ClientServiceImpl2 clientService = new ClientServiceImpl2();
	private DefaultServiceLocator() {
		
	}
    public ClientService2 createClientServiceInstance() {
        return clientService;
    }
}
