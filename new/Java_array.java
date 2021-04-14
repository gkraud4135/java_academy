package chapter1;
import java.util.Scanner;
public class Java_array {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		ex6();
		
		//ex5();

	}

	
	public static void ex1() {
		
		int[] arr1 = new int[5];		//arr선언
		arr1[0] = 1; 					//초기화
		arr1[1] = 2; 
		arr1[2] = 3; 
		arr1[3] = 4; 
		arr1[4] = 5; 
		
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+" ");
			
		}
		
		int arr2[] = {9,8,7,6,5,4,3,2,1};	//arr선언 + 초기화
		System.out.println(arr2.length);

		char cArr[] = new char[5];
		cArr[0] = 'A';
		cArr[1] = 'B';
		for(int i=0; i<cArr.length; i++){
			System.out.print(cArr[i]+"  ");
		}

	
	
	}
	
	public static void ex2() {
		
		//65=a								//char ch = 'A'로 초기화후 ch++; alph =ch; 해도 됨
		int alph[] = new int[26];
		for(int i=0; i<alph.length; i++){
			alph[i] = i+65;
			System.out.println((char)alph[i]);
		
			
		}		
		}
	
	public static void ex3() { // for문 단축 >> 기본형은 담지 못함 >> String, char, int 나중엔 객체를 담음
		//int = integer
		//float = Float
		
		String strArr[] = {"강아지","고양이","앵무새"};
		for(String s:strArr){  			//String s에 strArr값을 초기화 
			System.out.print(s + " ");
		}
	}
	
	public static void ex4(){	//최대값 최소값 찾기
		
		int iArr[] = {4,5,6,7,1,2};
		int max, min;                 //int max = iArr[0],min = iArr[0]
		max= iArr[0];
		min = iArr[0];
		for(int i=1; i<iArr.length; i++) {
		if(max<iArr[i]){
			max = iArr[i];
		}
		if(min>iArr[i]){
			min = iArr[i];
		}
	}
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void ex5(){	//스캐너로 점수 각각 받아서 평균구하기
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int[] arr = new int[5];
		System.out.println("평균을 구할 다섯개의 수를 입력하세요");
				for(int i=0; i<arr.length; i++)
				{arr[i]=scan.nextInt();
				total += arr[i];}
				System.out.println("평균 = "+total/arr.length);
				
		
		
	}
	public static void ex6(){
		
//		int array[][] = {{10,11,12},{20,21},{30,31,32},{40,41}};
		int array[][] = new int[4][];
		array[0] = new int[]{10,11,12};
		array[1] = new int[]{20,21};
		array[2] = new int[]{30,31,32};
		array[3] = new int[]{40,41};

		for(int i=0; i<array.length; i++){	
		for(int j=0; j<array[i].length; j++){
			System.out.print(array[i][j]+ " ");
		}System.out.println();
		}

	}
	
	
}
