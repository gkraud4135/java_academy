package chapter1;

public class Java_if {

	public static void main(String[] args) {
		
		ex4();
	
		
		

	}

	
	public static void ex1() { //if문 배수찾기
		
		int a = 5;
		if(a%5==0) {    //문장이 한개이면 {}생략가능
			System.out.println("a는 5의 배수입니다");}
			
		else {
			System.out.println("a는 5의 배수가 아님");}            	
	
		if(a%2==0) {
		System.out.println("2의 배수입니다");
		}
		else if (a%3==0) {
		System.out.println("3의 배수입니다");
		}
		else if (a%4==0) {
		System.out.println("4의 배수입니다");
		}
		else {
		System.out.println("5의 배수입니다");
		}   }
		
	public static void ex2() { //학점
		
		char grade;
		grade = 90;
		
		if(grade>90) {System.out.println("A학점입니다.");}
		else if(grade>80) {System.out.println("B학점입니다.");}
		else if(grade>70) {System.out.println("C학점입니다.");}
		else if(grade>60) {System.out.println("D학점입니다.");}
		else {System.out.println("F학점입니다.");}

		
	}
	public static void ex3() {
		//미취학0 , 초등학생 1, 중등생*2, 고등학생*3, 성인*4
		int age =13;
		int charge;
		charge = 3000;
		
		if(age<8) 
		{System.out.println("미취학 '0원' 입니다");}
		else if(age<14)
		{System.out.println("초등학생 '"+(charge*1)+"원' 입니다");}
		else if(age<17)
		{System.out.println("중학생"+(charge*2)+"원' 입니다");}
		else if(age<20)
		{System.out.println("고등학생"+(charge*3)+"원' 입니다");}
		else
		{System.out.println("성인 '"+(charge*4)+"원' 입니다");}
		
	}
	public static void ex4() {
		//삼항 연산자는 if로 대체 가능
		//삼항연산자는 조건문이 한개일때만 사용가능하다 
		int a = 5;
		int b = 8;
		
		int max = (a>b)? a:b;
		System.out.println(max);
		
		if(a>b) {System.out.println(a);}
		else {System.out.println(b);}
	
		
	}
	
}
