package com.lec206.ex08_extends;

public class ImplementMain {

	public static void main(String[] args) {
		
		ImplementC impl = new ImplementC();
		impl.methodA();
		impl.methodB();
		impl.methodC();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB(); (x)
//		ia.methodC(); (x)
		
		InterfaceB ib = impl;
//		ib.methodA(); (x)
		ib.methodB(); 
//		ib.methodC(); (x)	
		
		InterfaceC ic = impl;	
		ic.methodA();
		ic.methodB();
		ic.methodC();		
	}

}
