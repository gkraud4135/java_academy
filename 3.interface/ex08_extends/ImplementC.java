package com.lec206.ex08_extends;

public class ImplementC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("InterfaceA.methodA() 호출");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceB.methodB() 호출");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceC.methodC() 호출");
	}

}
