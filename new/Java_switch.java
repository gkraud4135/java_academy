package chapter1;

import java.util.Scanner;

public class Java_switch {

	public static void main(String[] args) {
		ex3();

	}

	
	
	
	
	
	public static void ex1() {// if문 switch문 차이
		
		char grade;
		grade = 90;
		
		if(grade>90) {System.out.println("A학점입니다.");}
		else if(grade>80) {System.out.println("B학점입니다.");}
		else if(grade>70) {System.out.println("C학점입니다.");}
		else if(grade>60) {System.out.println("D학점입니다.");}
		else {System.out.println("F학점입니다.");}
		
		//switch문은 지정값만 가능
		//break를 하지 않으면 해당 아래 모두 출력됨 
		switch(grade) {
		case 90 : System.out.println("A학점입니다."); 
		break;
		case 80 : System.out.println("B학점입니다.");
		break;
		case 70 : System.out.println("C학점입니다.");
		break;
		case 60 : System.out.println("D학점입니다.");
		break;
		default : System.out.println("F학점입니다.");
		break;
		}
		
	}
	public static void ex2() {
		//1월 ~ 12월 30일 31 28일 달
		//스캐너 사용
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력하세요.>>");
		
		int month = scan.nextInt();
		int days;
				
		switch(month) {
		case 1,3,5,7,9,11 : days=31; 
		break;
		case 2 : days=28; 
		break;
		default : days=30; 
		break;
		}
		System.out.println(month+"월은 "+days+"일까지 있습니다.");
		
	}
	public static void ex3() {
		// 1. 120이상이면서 부모 동반이면 탑승가능
		// 2. 6세 이상 키 120이상 탑승 가능
		// 3. 심장질환 탑승 불가능
		
		int age = 5;
		int height = 130;
		
		boolean withParent = true;
		boolean heartdease = false;
		
		boolean result = false;
		
		if((age>=6)&&((height>120)&&(withParent==true))){System.out.println("A기구에 탑승가능합니다");}
		else {System.out.println("A기구에 탑승 불가능합니다");}
		if(height>=120){System.out.println("B기구에 탑승가능합니다");}
		if(heartdease){System.out.println("C기구에 탑승 불가능합니다");}
		else {System.out.println("C기구에 탑승 가능합니다");}
		
		//모두 해당돼야 탑승가능  
		result = ((heartdease==false)&&(((age>=6)&&(height>120))||((height>120)&&(withParent==true))));
		
		
		//-------------------------
		if (age>=6) {
			result = true;
		}else {
			if(withParent)
				result = true;}
		}
		
		
		
	public static void ex4() {}
	public static void ex5() {}
	public static void ex6() {}
	
	

}
