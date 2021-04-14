package chapter1;

public class Hello1 {

	public static void main(String[] args) {
		
		
	}



public static void ex1(){		
	
byte bNum = 10;
int iNum = bNum;

double dNum = 1.2;
float fNum = 0.9F;
//강제 형변환 == 명시적 형변환
int iNum1 = (int)dNum + (int)fNum;                //1
System.out.println(iNum1);
double iNum2 = dNum + fNum;						//2
System.out.println((int)iNum2);
int iNum3 = (int)(dNum+fNum);					//2
System.out.println(iNum3);

	
}
public static void ex2() {
	int i = 10;
	System.out.println(++i);    //11 바로 증가
	i = 10;
	System.out.println(i++); 	//10 값이 변하지 않음 다음번 사용시 +1
	System.out.println(i); 		//11 그 후 변동됨
	System.out.println(i--); 	//11
	System.out.println(i); 		//10

}
public static void ex3() {
int a,b,c ; 
a= 4;
b= 7;
c= 9;

//abc의 값이 2의 배수인가?		
boolean result = (a%2==0) && (b%2==0) && (c%2==0);
System.out.println(result);					//false
//abc중 값이 2의 배수가 있는가?
boolean result1 = (a%2==0) || (b%2==0) || (c%2==0);
System.out.println(result1);                 //true
}
public static void ex4() {
	// 비트연산자 왼쪽으로 두칸 이동
	int num1 = 2;
	System.out.println(num1 <<=2);         //8     2*2*2
	
	int num2 = (5>3)?10:20;        //삼항연산자 맞으면 10 아니면 20
	System.out.println(num2);
	int age1 = 45;
	int age2 = 52;
	char ch = (age1>age2)?  'T':'F';
	System.out.println(ch);           //F
	String str = (age1>age2)? "나이가 많습니다":"나이가 적습니다";
	System.out.println(str);
	System.out.println((age1>age2)?(age1-age2):(age2-age1));
}

}
