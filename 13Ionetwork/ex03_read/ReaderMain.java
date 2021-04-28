package com.lec206.ex03_read;

import java.io.FileReader;
import java.io.Reader;

/*
	Reader
	
	Reader는 문자기반 입력스트림의 최상위 추상클래스이다. 모든 문자기반 입력스트림(
	FileReader, BufferedReader, InputStreamReader)은 모두 Reader클래스를 상속한다.
	
	Reader클래스의 주요메서드
	
	1. read() : 입력스트림으로 부터 한개의 문자를 읽고 리턴
	2. read(char[] cbuf) : 읽은 문자를 문자배열 cbuf에 저장하고 실제로 읽은 문자를 리턴
	3. read(char[] buf, int off, int len): len개의 문자를 읽고 cbuf[off]부터 len개까지의
	   문자를 저장하고 실제 읽은 문자수 len개를 리턴
	4. close()

*/
public class ReaderMain {

	public static void main(String[] args) throws Exception {
		
		Reader reader = null;
		
		// 1. read()
		reader = new FileReader("src/com/lec206/ex03_read/news.txt");
		int readData;
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.println((char)readData);
		}
		reader.close();
		System.out.println();
		
		// 2. read(char[])
		reader = new FileReader("src/com/lec206/ex03_read/news.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		reader.close();
		System.out.println();
			
		// 3. read(char[], off, len)
		reader = new FileReader("src/com/lec206/ex03_read/news.txt");
		int readNo;
		char[] cbuff = new char[8];
		readNo = reader.read(cbuff, 1, 4);
		for(int i=0;i<cbuff.length;i++) {
			System.out.println(cbuff[i]);
		}
		reader.close();
	}

}














