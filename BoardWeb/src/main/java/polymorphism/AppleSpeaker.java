package polymorphism;

import org.springframework.stereotype.Component;


public class AppleSpeaker implements Speaker{
	
	public AppleSpeaker() {
		System.out.println("====> AppleSpeaker 按眉 积己");
	}
	
	@Override
	public void volumUp() {
		System.out.println("AppleSpeaker --- 家府甫 棵赴促");
	}
	
	@Override
	public void volumDown() {
		System.out.println("AppleSpeaker --- 家府甫 撤冕促");
	}

}
