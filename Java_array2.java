package chapter1;

public class Java_array2 {

	public static void main(String[] args) {
		ex3();

	
	}
	
	public static void ex1(){  
		
		int[][] arr2 = new int[3][4];  ///  ��������   ������
		arr2[2][0] = 1;					//	��������
										// 	�ᤱ����
		int[][] arr3 = {{1,2,3,4},{5,6,7,8},{9,0,1,2}};
		System.out.println(arr3[1][1]);   //6
		System.out.println(arr3[1]); //�ּҰ� reference
		System.out.println(arr3[1].length); //4 1���� ���� ����
		System.out.println(arr3.length); //3 �迭�� ���� ��

		for(int row = 0; row<arr3.length; row++){
			for(int col = 0; col<arr3[row].length; col++){
				System.out.print(arr3[row][col]+" ");
			}
			System.out.println(" "); 
		}
		
	}
	
	public static void ex2(){		//��������
									//���� ������� ��
		int[][] arr = new int[3][];   //�ּ� ���� ������ �־������ 
		arr[0] = new int[]{1};
		arr[1] = new int[]{2,3};
		arr[2] = new int[]{4,5,6};
		
		System.out.println(arr[0].length); 	//1
		System.out.println(arr[1].length);	//2
		System.out.println(arr[2].length);	//3
		
		
	}  
	
	public static void ex3(){//10�� �ǹ� 1,2ȣ�� ������ �ִ�, �� ������ ��� �������� ���Ƿ� ����
								//������ �������հ�, ����Ʈ ��ü�� �������� �հ�
		int total = 0;
		int[][] apart = {{1,2},{3,4},{5,6},{7,8},{9,10},{1,2},{3,4},{5,6},{7,8},{9,10}};
		int[] floor = new int[apart.length];
		for(int i=0; i<apart.length; i++){
			for(int j=0; j<apart[i].length; j++){
				floor[i] += apart[i][j];
			}
			System.out.println((i+1)+"floor="+floor[i]);
			total += floor[i];
		}
			System.out.println("total="+total);
	}

}
