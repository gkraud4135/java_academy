package chapter1;

public class Java_array2 {

	public static void main(String[] args) {
		ex3();

	
	}
	
	public static void ex1(){  
		
		int[][] arr2 = new int[3][4];  ///  けけけけ   舛号狽
		arr2[2][0] = 1;					//	けけけけ
										// 	＝けけけ
		int[][] arr3 = {{1,2,3,4},{5,6,7,8},{9,0,1,2}};
		System.out.println(arr3[1][1]);   //6
		System.out.println(arr3[1]); //爽社葵 reference
		System.out.println(arr3[1].length); //4 1楳税 掩戚 姐呪
		System.out.println(arr3.length); //3 壕伸税 掩戚 伸

		for(int row = 0; row<arr3.length; row++){
			for(int col = 0; col<arr3[row].length; col++){
				System.out.print(arr3[row][col]+" ");
			}
			System.out.println(" "); 
		}
		
	}
	
	public static void ex2(){		//搾舛号狽
									//伸聖 限仲操醤 敗
		int[][] arr = new int[3][];   //置社 楳税 鯵呪澗 隔嬢操醤敗 
		arr[0] = new int[]{1};
		arr[1] = new int[]{2,3};
		arr[2] = new int[]{4,5,6};
		
		System.out.println(arr[0].length); 	//1
		System.out.println(arr[1].length);	//2
		System.out.println(arr[2].length);	//3
		
		
	}  
	
	public static void ex3(){//10寵 闇弘 1,2硲亜 唖寵拭 赤陥, 唖 亜舛税 紫澗 亜膳呪研 績税稽 企脊
								//唖寵税 亜膳呪杯域, 焼督闘 穿端税 亜膳呪税 杯域
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
