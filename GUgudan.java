package chapter1;

public class GUgudan {

	public static void main(String[] args) {
	//3*9 2���� �迭
	//1�� : 2��
	//2�� : 3��
	//3�� : 4��
		gugudan();
	}

	
	public static void gugudan(){
		
	int[][] gugu = new int[3][9];
	for(int i=0; i<gugu.length; i++){
		for(int j=0; j<gugu[i].length; j++){
			gugu[i][j] = (i+2)*(j+1);
			System.out.print(gugu[i][j]+" ");
		}
		System.out.println("");

	}


	
		
	}
	
}
