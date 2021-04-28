package com.lec206.ex05_file;

import java.io.File;
import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		
		File file = new File("d:/temp/야생화.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("하얗게 피어난 얼음꽃 하나가\n");
		fw.write("달가운 바람에 얼굴을 내밀어\n");
		fw.write("아무 말 못했던 이름도 몰랐던\n");
		fw.write("지나간 날들에 눈물이 흘러\n");
		fw.write("\n");
		fw.write("차가운 바람에 숨어있다\n");
		fw.write("한줄기 햇살에 몸 녹이다.\n");
		fw.write("그렇게 너는 또 한번 내게 온다.\n");
		fw.write("\n");
		fw.write("좋았던 기억만\n");
		fw.write("그리운 마음만\n");
		fw.write("니가 떠나간 그 길 위에\n");
		fw.write("이렇게 남아 서 있다\n");
		fw.close();
		System.out.println("파일일 정상적으로 저장이 되었습니다!");
	}

}
