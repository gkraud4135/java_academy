package com.lec206.ex05_file;

import java.io.FileReader;

public class FileReaderMain {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("src/com/lec206/ex05_file/filemain.java");
		int readChar;
		char[] cbuf = new char[150];
		
		while((readChar = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readChar);
			System.out.println(data);
		}
		fr.close();
	}

}
