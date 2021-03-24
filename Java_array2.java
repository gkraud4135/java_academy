package chapter1;

public class Java_array2 {

	public static void main(String[] args) {
		ex3();

	
	}
	
	public static void ex1(){  
		
		int[][] arr2 = new int[3][4];  ///  ㅁㅁㅁㅁ   정방향
		arr2[2][0] = 1;					//	ㅁㅁㅁㅁ
										// 	■ㅁㅁㅁ
		int[][] arr3 = {{1,2,3,4},{5,6,7,8},{9,0,1,2}};
		System.out.println(arr3[1][1]);   //6
		System.out.println(arr3[1]); //주소값 reference
		System.out.println(arr3[1].length); //4 1행의 길이 갯수
		System.out.println(arr3.length); //3 배열의 길이 열

		for(int row = 0; row<arr3.length; row++){
			for(int col = 0; col<arr3[row].length; col++){
				System.out.print(arr3[row][col]+" ");
			}
			System.out.println(" "); 
		}
		
	}
	
	public static void ex2(){		//비정방향
									//열을 맞춰줘야 함
		int[][] arr = new int[3][];   //최소 행의 개수는 넣어줘야함 
		arr[0] = new int[]{1};
		arr[1] = new int[]{2,3};
		arr[2] = new int[]{4,5,6};
		
		System.out.println(arr[0].length); 	//1
		System.out.println(arr[1].length);	//2
		System.out.println(arr[2].length);	//3
		
		
	}  
	
	public static void ex3(){//10층 건물 1,2호가 각층에 있다, 각 가정의 사는 가족수를 임의로 대입
								//각층의 가족수합계, 아파트 전체의 가족수의 합계
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
