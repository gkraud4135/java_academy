package com.lec206.ex01_input;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadMain2 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("src/com/lec206/ex01_input/news.txt");		
		int readByte;
		String data = "";
		
		byte[] readBytes = new byte[3];
		while(true) {
			readByte = is.read(readBytes); // 3bytes씩 읽기
			if(readByte == -1) break;
			data += new String(readBytes, 0, readByte);
		}
		System.out.println(data);
		is.close();
	}

}
