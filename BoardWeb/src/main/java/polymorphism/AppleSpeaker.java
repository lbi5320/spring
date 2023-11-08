package polymorphism;

import org.springframework.stereotype.Component;


public class AppleSpeaker implements Speaker{
	
	public AppleSpeaker() {
		System.out.println("====> AppleSpeaker ��ü ����");
	}
	
	@Override
	public void volumUp() {
		System.out.println("AppleSpeaker --- �Ҹ��� �ø���");
	}
	
	@Override
	public void volumDown() {
		System.out.println("AppleSpeaker --- �Ҹ��� �����");
	}

}
