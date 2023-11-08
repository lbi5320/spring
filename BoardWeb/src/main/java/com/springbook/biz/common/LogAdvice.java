/*
package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect  //  Aspect = Pointcut + Advice
public class LogAdvice {
	@Pointcut("exectution(* com.springbook.biz..*Impl.*(..))")   // ����Ʈ��
	public void allPointcut() {}
	
	@Before("allPoincut()")
	public void printLog() {
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");      // �����̽�
	}
	

}
*/