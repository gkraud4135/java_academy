package com.lec206.ex06_system;

import java.util.Map;

/*
	System 클래스
	
	1. 프로그램종료(exit)
	
	   경우에 따라서 JVM을 강제로 종료시킬 필요가 있을 때 Syste.exit()메서드를 호출
	   해서 프로그램을 강제적으로 종료시킨다.
	   
	   exit()메서드는 int매개값을 지정하는데 이 값을 종료상태값이라고 한다. 정상종료
	   일 때는 0, 비정상종료일 때는 0이외의 값을 지정한다.
	
	2. 쓰레기 수집기(gc())
	
	   쓰레기수집기는 개발자가 직접코드를 실행 시킬 수 없고 JVM에게 가능한 빨리 실행
	   해주도롤 요청할 수는 있다. 이것이 Syste.gc()메서드이다. gc()메서드는 호출되면
	   바로 실행하는 것이 아니라 JVM이 빠른 시간내에 실행시키기 위해 노력한다.	
	
	3. 운영체제환경정보(getenv())
	
	   getenv()메서드는 시스템의 운영체제의 환경설정정보를 읽어 올 때 사용한다.
*/
public class GCMain {

	public static void main(String[] args) {

		if(args.length > 0) {
			System.out.println("프로그램 비정상종료!!!");
			System.exit(100);
		}
		
		Employee emp;
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.println("emp가 최종적으로 참조하는 사원번호는?");
		System.out.println(emp.eno);
		System.gc();
		System.out.println();
		
		String javahome = System.getenv("JAVA_HOME");
		System.out.println("[JAVA_HOME] " + javahome);
		System.out.println();
		
		// 환경정보를 전체읽기
		for(Map.Entry entry:System.getenv().entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}

class Employee {
	
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ")가 메모리에 생성되었습니다!");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee(" + eno + ")가 메모리에서 제거되었습니다!");
	}
}
















