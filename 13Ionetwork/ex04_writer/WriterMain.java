package com.lec206.ex04_writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterMain {

	public static void main(String[] args) throws Exception {
		
		Writer writer = null;
		
		// 1. write(char[])
		writer = new FileWriter("src/com/lec206/ex04_writer/sample.txt");
		char[] data = "대한민국만세".toCharArray();
		for(int i=0;i<data.length;i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
		
		// 2. write(char[], off, len)
		writer = new FileWriter("src/com/lec206/ex04_writer/sample.txt");
		data = "우리나라만세".toCharArray();
		writer.write(data, 1, 4);
		writer.flush();
		writer.close();
	}

}
