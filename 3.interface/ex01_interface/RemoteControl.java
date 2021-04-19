package com.lec206.ex01_interface;

/*
	인터페이스(Interface)
	
	자바에서 인터페이스는 객체의 사용방법을 정의한 참조타입이다. 인터페이스는
	객체의 교환성을 높여주기 때문에 다형성을 구현하는 매우 중요한 역할을 한다.
	특히, java8버전에서부터 인터페이스의 중요성은 더욱 커졌다. java8의 람다식
	(Lambda)은 함수적 인터페이스의 구현객체를 생성하기 때문이다.
	
	인터페이스는 개발코드와 객체가 서로 통신하는 접점역할을 한다. 개발코드가
	인터페이스의 메서드를 호출하면 인터페이스는 객체의 메서드를 호출한다.
	그렇기 때문에 개발코드는 객체의 내부구조를 알 필요가 없고 인터페이스의 
	메서드만 알고 있으면 된다.
	
	개발코드가 직접 메서드를 호출하면 간단한데 왜 중간에 인터페이스를 두는 이유는
	개발코드를 직접 수정하지 않고 사용하는 객체를 변경할 수 있도록 하기 위해서 이다.
	
	인터페이스는 하나의 객체가 아니라 여러 객체들과 사용이 가능하기 때문에 어떤 객체
	를 사용하느냐에 따라 실행내용과 결과값이 다를 수 있어서 개발코드 측면에서 보면 
	코드의 변경없이 실행내용과 리턴값을 다양화 할 수 있다는 장점이 있다.
	
*/
public interface RemoteControl {

	// 1. 상수필드(final static, constant field)
	// 인터페이스는 객체의 사용설명서이므로 런타임시에 데이터를 저장할 수 있는 필드를
	// 선언할 수 없다. 하지만 상수필드는 선언할 수 있다. 상수는 인터페이스에 고정된 
	// 값으로 런터임시에 값을 변경할 수 없다. 따라서 상수를 선언할 때는 반드시 초기값을
	// 대입해야 한다. 인터페이스에서 상수는 별도로 명시하지 않아도 자동으로 컴파일 과정
	// 에서 public static final이 추가가 된다.
	int MIN_VOLUMN = 0;
	public static final int MAX_VOLUMN = 10;
	
	// 2. 추상메서드(Abstract Method)
	// 추상메서드는 객체가 가지고 있는 메서드를 설명한 것으로 호출할 때 어떤 매개값이
	// 필요하고, 어떤 리턴타입이 무엇인지를 알려준다.
	// 실제 실행부는 구현객체(실제객체, 하위객체)가 가지고 있다. 인터페이스의 메서드는
	// 무조건 추상메서드이기 때문에 public abstract을 생략하더래도 컴파일과정에서 자동
	// 으로 추가된다.
	void turnOn();
	public abstract void turnOff();
	void setVolumn(int volumn);	
	
	// 3. default 메서드
	// default메서드는 인터페이스에 선언되지만 사실은 구현객체가 가지고 있는 
	// 인터페이스 메서드라고 생각하면 된다. java8에서 default메서드를 허용한
	// 이유는 기존 인터페이스를 확장해서 새로운 기능을 추가하기 위해서 이다.
	// default메서드는 실행블럭을 가지고 있는 메서드로서 default키워드를 반드시
	// 붙여야 하며 기본적으로 public 접급한자를 생략하더래도 자동으로 컴파일과
	// 정헤서 추가된다.
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		} else {
			System.out.println("무음해제");
		}
	}
	
	// 4. static 메서드
	// 정적메서드로 java8부터 작성할 수 있는데 default메서드와는 달리 객체가 생성
	// 되지 않아도 인터페이스만으로 호출이 가능하다.
	static void changeBattery() {
		System.out.println("건전지를 교환합니다!");
	}
	
}
















