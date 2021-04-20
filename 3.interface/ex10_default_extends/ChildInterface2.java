package com.lec206.ex10_default_extends;

public interface ChildInterface2 extends ParentInterface {

	void method3();
	
	@Override
	default void method2() { /* ParentInterface.실행문 */}
	
}
