package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Home {

	@Autowired
	NetworkConnection modem;
	
	public void connect() {
	modem.connect();
	}
	
}

@Component
class BSNL implements NetworkConnection{
	public void connect() {
		System.out.println("Connected to BSNL Network");
	}
}

class Hathway  implements NetworkConnection{
	public void connect() {
		System.out.println("Connected to Hathway Network");
	}
}

