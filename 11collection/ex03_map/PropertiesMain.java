package com.lec206.ex03_map;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

/*
	Properties
	
	Properties는 Hashtable의 하위클래스이기 때문에 Hashtable의 모든 속성들을 그대로
	가지고 있는데 차이점은 Hashtable은 키와 값을 다양한 데이터타입으로 지정할 수 있
	는데 비해 Properties는 키와 값이 모두 String타입으로 제한된 컬렉션이다.
	
	Properties 애플리케이션의 옵션정보, 데이터베이연결정보, 그리고 국제화(다국어)정보가
	저장된 프로퍼티파일을 사용할 때 주로 이용한다.
	
	프로퍼티파일은 키와 값이 "="기호로 연결되어 있는 텍스트파일로 ISO8859-1문자셋으로 
	저장된다. 이 문자셋으로 직접 표현할 수 없는 한글은 유니코드로 변환되어 저장된다.
	
	이클립스에서 유니코드로 변환된 내용을 다시 한글로 보려면 마우스를 유니코드위에 올
	려 놓으면 된다.
	
	이클립스를 사용하지 않을 경우 한글이 포함된 프로퍼티파일을 다른 에딭에서 작성하고
	jdk의 설치 폴더에서 native2ascii.exe를 이용해서 ISO8859-12파일로 저장하면 된다.
*/
public class PropertiesMain {

	public static void main(String[] args) throws Exception {
		
		Properties properties = new Properties(); // Hashtable의 하위클래스
		
		// properties파일읽기 
		//입출력클래스 FileInputStream클래스로 database.propertise 파일읽어옴
		String path = PropertiesMain.class.getResource("database.properties").getPath();
		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8"); 
		System.out.println();
		
		properties.load(new FileReader(path)); //properties객체에 로드
		
		String driver = properties.getProperty("driver"); //map객체처럼 key,value값 조회가능
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		String hangul = properties.getProperty("hangul");
			
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		System.out.println(hangul);

	}

}


















