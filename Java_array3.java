package chapter1;

public class Java_array3 {

	public static void main(String[] args) {
		ex2();

	}

	public static void ex1() {// 3�����迭
								// h����4,r��3,c��2
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
	
	
	public static void ex2(){//�ζǹ�ȣ ������  �����Ǽ�=���� ����� random
		//1~45������ ���� ������ �����
		//System.out.println((int)(Math.random()*45)+1);
		
		int randomNo = (int)(Math.random()*45)+1;
		int[] lotto = new int[6];
		lotto[0] = randomNo;
		boolean isDup = false;
		int idx; //�ζǹ�ȣ ���� ������
		
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

