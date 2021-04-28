package com.lec206.ex05_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception {
		
		String orgFileName = "d:/temp/bts.jpg";
		String newFileName = "d:/temp/bts_copy.jpg";
		
		FileInputStream fis = new FileInputStream(orgFileName);
		FileOutputStream fos = new FileOutputStream(newFileName);

		int readByte;
		byte[] readBytes = new byte[100];
		while((readByte = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByte);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("파일복사가 완료되었습니다!");
	}

}
