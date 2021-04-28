package com.lec206.ex05_file;

import java.io.FileInputStream;

/*
	FileInputStream
	
	이 클래스는 파일로 부터 바이트단위로 읽어 올 때 사용하는 바이트기반 입력스트림이다.
	바이트단위로 읽기 때문에 그림, 오디오, 비디오, 텍스트파일등 모든 종류의 파일을 읽
	을 수 있다. 
	
	FileInputStream을 생성하는 2가지 방법
	
	1. 문자열로 된 파일경로를 가지고 생성
	   
	   FileInputStream fis = new FileInputStream("c:/temp/img.gif")
	
	2. File객체로 이미 생성이 되어 있을 경우
	
	   File file = new File("c:/temp/img.gif");
	   FileInputStream fis = new File(file);
*/
public class FileInputStreamMain {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("src/com/lec206/ex05_file/FileMain.java");
		int data;
		while((data = fis.read()) != -1) {
			System.out.println((char)data);
		}
		fis.close();
	}

}
