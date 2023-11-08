package polymorphism;

import org.springframework.stereotype.Component;


public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("====> SonySpeaker ��ü ����");
	}

	@Override
	public void volumUp() {
		System.out.println("SonySpeaker -- �Ҹ��� ���δ�");
		
	}

	@Override
	public void volumDown() {
		System.out.println("SonySpeaker -- �Ҹ��� �����");
		
	}
	
}
