package chapter1;

public class GUgudan {

	public static void main(String[] args) {
	//3*9 2차원 배열
	//1행 : 2단
	//2행 : 3단
	//3행 : 4단
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
