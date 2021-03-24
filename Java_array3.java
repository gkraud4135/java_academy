package chapter1;

public class Java_array3 {

	public static void main(String[] args) {
		ex2();

	}

	public static void ex1() {// 3차원배열
								// h높이4,r행3,c열2
		int[][][] tMArray = new int[4][3][2];
		int value = 0;

		for (int h = 0; h < tMArray.length; h++) {  //4
			for (int r = 0; r < tMArray[h].length; r++) {
				for (int c = 0; c < tMArray[h][r].length; c++) {
					tMArray[h][r][c] = ++value;

				}
			}

		}

		for (int h = 0; h < tMArray.length; h++) {
			for (int r = 0; r < tMArray[h].length; r++) {
				for (int c = 0; c < tMArray[h][r].length; c++) {
					System.out.println(tMArray[h][r][c] + "\t");

				}
				System.out.println();
			}

		}

	}
	
	
	public static void ex2(){//로또번호 생성기  임의의수=난수 만들기 random
		//1~45까지의 수중 랜덤수 만들기
		//System.out.println((int)(Math.random()*45)+1);
		
		int randomNo = (int)(Math.random()*45)+1;
		int[] lotto = new int[6];
		lotto[0] = randomNo;
		boolean isDup = false;
		int idx; //로또번호 생성 시퀀스
		
		for(idx=1; idx<6;){
			randomNo = (int)(Math.random()*45)+1;
			
			for(int j=0; j<lotto.length; j++){
				if(lotto[j]==randomNo){
					isDup = true;
					break;
				}
			}
			if(isDup==false){
				lotto[idx] = randomNo;
				idx++;
			}
				
			}
			for(int no : lotto){
				System.out.print(no + " ");
			}
		}
	
	}

