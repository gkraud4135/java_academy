package com.lec206.ex10_default_extends;

public interface ParentInterface {

	void method1();
	default void method2() { /* ParentInterface.실행문 */ }
}
