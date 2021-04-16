package com.prac;

public class Ex1 {

	public static void main(String[] args) {
		Tv t1 = new Tv("white",true,3);
		Tv t2 = new Tv();
		t1.ex1();
		t2.ex1();
		//t1.change(); 자손 메서드 사용불가
		
		SmartTv st = new SmartTv();
		st = (SmartTv)t2;   //오류 왜지
		st.ex1();
	}

}
class SmartTv extends Tv{
	SmartTv(){};
	void change(){System.out.println(color);}
	
}
class Tv {
	
	String color;       //인스턴스변수
	boolean power;
	int channer;
	
	static int width =10;   //static변수 클래스변수 
	static int height =20;
	
	void channerUp(){channer++;}
	void channerDown(){channer--;}
	void power(){power=!power;}
	void gugudan(int dan){
		
		if(!(2<=dan&&dan<=9)){
			return;
		}
		for(int i=2;i<10;i++){
			System.out.printf("%d*%d=%d%n",dan,i,dan*i);
		}return;//void메서드의 return값은 생략가능
	}
	int multi(int x, int y){
		int result = x*y;
		return result;
		}
	Tv(){ //초기화 받지 않을때 디폴드 값으로 써라
//		color = "black";
//		power = true;
//		channer = 5;
		this("black",true,4);
	}
	public Tv(String string, boolean b, int i) {
		color=string;
		power=b;
		channer=i;
	}
	void ex1(){System.out.println("color="+color+" power="+power+" channer"+channer);}
	
}