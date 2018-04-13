package com.coffee.examples;

public class ClientService {
	private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {
        return clientService;
    }
    public void sayHello() {
    	System.out.println("hi,i am ClientService!");
    }
}
