package com.lec206.ex03_map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableMain {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<>();
		
		// 아이디와 비번 4개 입력 앞key뒤value
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scanner = new Scanner(System.in); //입력받을객체 생성
		
		while(true) {//무조건 반복 
			System.out.println("아이디와 비밀번호를 입력하세요!");
			System.out.println("아이디 => ");
			String id = scanner.nextLine();
			System.out.println("비밀번호 => ");
			String pw = scanner.nextLine();
			
			if(map.containsKey(id)) { //id가 key값에 포함되어있으면-pw 같으면 로그인성공
				if(map.get(id).equals(pw)) {  //id와pw가 같으면
					System.out.println("로그인 성공!!");
					break;
				} else {
					System.out.println("비밀번호가 틀립니다. 다시입력하세요!");
				}//id와 해당 value가 다르면
			} else {
				System.out.println("아이디가 없습니다. 다시입력하세요!");
			}//id가 없으면
		}
		
	}

}
