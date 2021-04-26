package com.lec206.ex02_kind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileMain {

	public static void main(String[] args) throws IOException {
		// 4. 파일로 부터 스트림얻기
		// 1) 파일의 위치확인
		Path path = Paths.get("src/com/lec206/ex02_kind/datafile.txt");
		System.out.println(path + "\n");
		
		Stream<String> stream;
		
		// 2) 파일읽기(1) - Files.lines()메서드
		stream = Files.lines(path);
		stream.forEach(System.out :: println);
		stream.close();
		System.out.println();
		
		// 3) 파일읽기(2) - BufferedReader.line()메서드
		File file = path.toFile();
		FileReader filereader = new FileReader(file);
		BufferedReader br = new BufferedReader(filereader);
		stream = br.lines();
		stream.forEach(System.out :: println);
		stream.close();
		filereader.close();
		br.close();
		System.out.println();
		
		// 5. directory로 부터 스트림 얻기
		path = Paths.get("d:/lec206/02.java/workspace");
		Stream<Path> stream1 = Files.list(path);
		stream1.forEach(p -> System.out.println(p.getFileName()));
		
	}

}
