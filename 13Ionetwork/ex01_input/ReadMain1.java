package com.lec206.ex01_input;

import java.io.FileInputStream;
import java.io.InputStream;

/*
	InputStream
	
	InputStream은 바이트기반 입력스트림의 최상위 추상클래스이다. FileInputStream,
	BufferedInputStream, DataInputStream은 모두 InputStream을 상속하고 있다.
	
	InputStream의 주요메서드
	
	1. read() : 입력스트림으로 부터 1byte씩 읽어서 4byte int타입으로 리턴
	2. read(byte[] byte) : 입력스트림으로 부터 주어진 byte배열의 길이만큼 데이터를 읽고 읽은 
	   byte수만큼 리턴
	3. read(byte[] b, int off, int len) : 입력스트림으로 부터 len바이트수 만큼 읽어서 매개값으로
	   주어진 배열 b[off]부터 len까지 리턴
	4. close() : InputStream을 더 이상 사용하지 않을 경우 InputStream에서 사용자원을 해제
*/
public class ReadMain1 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("src/com/lec206/ex01_input/news.txt");
		int readByte;
		while(true) {
			readByte = is.read(); // 1byte씩 읽기
			if(readByte == -1) break;
			System.out.println((char)readByte);
		}
		is.close();
	}

}
