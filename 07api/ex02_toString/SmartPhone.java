package com.lec206.ex02_toString;

/*
	객체문자정보(toString())
	
	Object클래스의 toString()메서드는 객체의 문자정보를 리턴한다. 객체의 문자정보란
	객체를 문자열로 표현한 값을 말한다. 기본적으로 이 메서드는 "클래스명@16진수"의 
	코드로 구성된 문자정보를 리턴한다.
	
	이 메서드의 리턴값은 실제적으로는 별 사용할 가치가 없는 정보이기 때문에 하위 클
	래스에서는 toString()메서드를 재정의해서 간결하고 유용한 정보를 리턴하도록 한다.
	
	예를 들어 재정의된 java.util.Date.toString()메서드를 보면 현재의 시스템날짜와 시간
	정보를 리턴한다. 그리고 String클래스는 toString()메서드를 재정의해서 객체가 가지고
	있는 문자열을 리턴한다.
	
*/
public class SmartPhone {
	
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + " = " + os;
	}
}
