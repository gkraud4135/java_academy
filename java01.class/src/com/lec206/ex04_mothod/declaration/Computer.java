package com.lec206.ex04_mothod.declaration;


//1부터 n까지의 합 결과를 리턴하는 메서드 생성
public class Computer {

	
	  int result = 0;
	  
	  void sum(int x){ for(int i=0; i<=x; i++) { result = result + i;}
	  System.out.println(result); } void sum(int a, int b, int c, int d){
	  System.out.println(a+b+c+d); }
	  
	  int sum(int[] a){ //두개가 같음 
	  for(int i=1; i<=10; i++) { result += i;} 
	  return
	  result;
	  }
		
	int sum1(int ... value){
		int result = 0;
		for(int i=0; i<value.length; i++){
			result += value[i];
		}
		return result;
	}
}
