package chapter1;

public class GUgudan {

	public static void main(String[] args) {
	//3*9 2Â÷¿ø ¹è¿­
	//1Çà : 2´Ü
	//2Çà : 3´Ü
	//3Çà : 4´Ü
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
