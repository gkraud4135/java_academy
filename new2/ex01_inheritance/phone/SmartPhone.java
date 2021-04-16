package com.lec206.ex01_inheritance.phone;

/*
	상속(Inheritance)
	
	객체지향 프로그래밍에서는 부모클래스이 멤버(필드, 메서드)를 자식 클래스에
	물려 줄 수 있는데 부모 클래스를 상위클래스라 하고 자식클래스를 하위클래스
	라 한다.
	
	상속은 이미 잘 개발된 클래스를 재사용하여 새로운 클래스를 만들기 때문에
	코드의 중복을 줄여준다. 상속을 통해 부모클래스의 필드와 메서드를 재사용
	하고 자식 클래스에서 사용할 필드와 메서드만 정으하면 보다 효울적이고 개
	발시간의 단축과 유지보수가 용이하게 된다.
	
	상속을 한다해도 private로 정의 필드와 메서드는 상속을 받을 수가 없으며
	자바에서는 다중상속을 허용하지 않는다.
*/
public class SmartPhone extends CellPhone {

	int channel;
	
	// 생성자
	// 상속을 받을 경우에 개발자가 추가한 생성자가 없을 경우에 기본생성자를
	// 정의하지 않아도 되기 때문에 자식생성자에 부모의 기본생성자 super()가
	// 자동으로 추가된다.
	// 자식이 생성되기 전에 부모객체가 존재해야 하기 때문이다. 부모생성자를
	// 호출한 후에 부모객체가 생성된 후에 자식객체가 생성되기 때문이다.
	// 여기서 super()는 부모생성자를 호출하는 명령이다. 주의할 점은 부모생
	// 성자를 호출할 경우에는 자식생성자의 맨 처음에 정의가 되어야 한다.
	
	public SmartPhone() {
		super("스마트폰", "분홍");
	}

	public SmartPhone(String model, String color, int channel) {
		super(model, color);
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void internetSearch() {
		System.out.println("인터넷검색을 합니다!");
	}
}
