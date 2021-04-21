package com.lec206.ex08_string.method;

public class StringGetBytesMain {

	public static void main(String[] args) {
		
		String str = "안녕하세요!"; // utf-8, 3bytes
		byte[] byte1 = str.getBytes();
		System.out.println(byte1.length + " bytes");
		
		String str1 = new String(byte1);
		System.out.println("bytes1 배열 -> String = " + str1);
		
		try {
			byte[] byte2 = str.getBytes("EUC-KR");
			System.out.println(byte2.length + " bytes");
			String str2 = new String(byte2);
			System.out.println("bytes2 배열 -> String = " + str2); // utf8 -> euc-kr로, 문자깨짐
			
			byte[] byte3 = str.getBytes("UTF-8");
			System.out.println(byte3.length + " bytes");
			String str3 = new String(byte3);
			System.out.println("bytes3 배열 -> String = " + str3); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
