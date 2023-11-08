package polymorphism;

import org.springframework.stereotype.Component;


public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("====> SonySpeaker 按眉 积己");
	}

	@Override
	public void volumUp() {
		System.out.println("SonySpeaker -- 家府甫 臭牢促");
		
	}

	@Override
	public void volumDown() {
		System.out.println("SonySpeaker -- 家府甫 撤冕促");
		
	}
	
}
