package chapter1;
import java.util.Scanner;
public class Java_array {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		
		//ex5();

	}

	
	public static void ex1() {
		
		int[] arr1 = new int[5];		//arr����
		arr1[0] = 1; 					//�ʱ�ȭ
		arr1[1] = 2; 
		arr1[2] = 3; 
		arr1[3] = 4; 
		arr1[4] = 5; 
		
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+" ");
			
		}
		
		int arr2[] = {9,8,7,6,5,4,3,2,1};	//arr���� + �ʱ�ȭ
		System.out.println(arr2.length);

		char cArr[] = new char[5];
		cArr[0] = 'A';
		cArr[1] = 'B';
		for(int i=0; i<cArr.length; i++){
			System.out.print(cArr[i]+"  ");
		}

	
	
	}
	
	public static void ex2() {
		
		//65=a								//char ch = 'A'�� �ʱ�ȭ�� ch++; alph =ch; �ص� ��
		int alph[] = new int[26];
		for(int i=0; i<alph.length; i++){
			alph[i] = i+65;
			System.out.println((char)alph[i]);
		
			
		}		
		}
	
	public static void ex3() { // for�� ���� >> �⺻���� ���� ���� >> String, char, int ���߿� ��ü�� ����
		//int = integer
		//float = Float
		
		String strArr[] = {"������","�����","�޹���"};
		for(String s:strArr){  			//String s�� strArr���� �ʱ�ȭ 
			System.out.print(s + " ");
		}
	}
	
	public static void ex4(){	//�ִ밪 �ּҰ� ã��
		
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
	
	public static void ex5(){	//��ĳ�ʷ� ���� ���� �޾Ƽ� ��ձ��ϱ�
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int[] arr = new int[5];
		System.out.println("����� ���� �ټ����� ���� �Է��ϼ���");
				for(int i=0; i<arr.length; i++)
				{arr[i]=scan.nextInt();
				total += arr[i];}
				System.out.println("��� = "+total/arr.length);
				
		
		
	}

	
	
}
