package chapter1;

import java.util.Arrays;

public class Java_array_copy {

	public static void main(String[] args) {

		ex2();

	}
	
	
	public static void ex1(){//�迭�� ���� ���1,2,3
		
		
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = new int[arr1.length];
		int[] arr3 = new int[arr1.length];
		
		//1.�ݺ��� ���
		for(int i=0; i<arr1.length; i++){
			
			arr2[i] = arr1[i];	
		}
		for(int i : arr2) {
			System.out.print(i+" ");
			System.out.println("");
		}
		//2.copy�� ���
		System.arraycopy(arr1,1,arr3,0,2);    //arr1�� �ִ� 1������ arr3 0���� 4�� ����
		for(int i : arr3){
			System.out.print(i +" ");
			System.out.println("");
			
		//3.Arrays.copyOf(null,0)
		int[] arr4 = null;
		arr4 = Arrays.copyOf(arr1, 5);
		for(int j : arr4){
			System.out.print(j+" ");
		}
	}
	

		
		
	}
	
	public static void ex2(){
		
	int[][] apart = {{1,2},{3,4},{5,6},{7,8},{9,10},{1,2},{3,4},{5,6},{7,8},{9,10}};
	//row�� ����
	//column ����
	
	//���ǰ��� ����apart[]
	for(int[] row : apart){
		for(int col : row) {
			System.out.print(col+"\t");
		}
		System.out.println();
	}
	
	
	}

}
