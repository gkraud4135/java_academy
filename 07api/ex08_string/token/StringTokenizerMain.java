package com.lec206.ex08_string.token;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		
		String text = "홍길동/홍길순/홍길자/홍길녀/홍길라";
		
		// 1. for : 전체토큰의 갯수
		StringTokenizer st = new StringTokenizer(text, "/");
		int count = st.countTokens();
		System.out.println(count);
		System.out.println(st.hasMoreTokens());
		for(int i=0;i<count;i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println(st.hasMoreTokens());
		System.out.println();
		
		// 2. while
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		// st.nextToken();
		System.out.println();
		
		text = "홍길동,홍길순&홍길자-홍길녀/홍길라";
		String[] names = text.split("&|,|-|/");
		for(String name:names) {
			System.out.println(name);
		}
		
	}

}
