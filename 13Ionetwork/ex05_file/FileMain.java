package com.lec206.ex05_file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;

/*
	파일입출력
	
	File클래스
	
	IO패키지에서 제공하는 File클래스는 파일크기, 속성, 이름등의 정보를 읽는 기능과
	파일생성, 삭제관련기능등을 제공한다. 또한 디렉토리를 생성하고 디렉토리내에 있는
	파이의 리스트를 읽는 기능도 제공한다.
	
	하지만, 파일의 데이터를 읽고 쓰는 기능은 지원하지 않는다. 파일에 데이터를 입출력
	하려고 할 경우에는 입출력스트림을 사용해야 한다.
	
	디렉토리구분자능 윈도우에서는 '\' or '/', 리눅스는 '/'을 사용한다. 만약에 '\'를
	사용할 경우에는 이스케이프문자('\\')로 사용해야 한다.
	
	File관련 주요메서드
	
	1. createNewFile() : 새로운 파일을 생성
	2. mkdir() : directory를 생성
	3. mkdirs(): 경로상에 없는 모든 directory를 생성
	4. delete(): 파일 or directory를 삭제
	
	파일 또는 directory가 존재할 경우에 관련된 메서드
	
	1. canExecute() : 실행가능 파일여부인지
	2. canRead() : 읽을 수 있는 파일인지 여부
	3. canWrite(): 수정 및 저장할 수 있는 파일 여부
	4. getName() : 파일이름을 리턴
	5. getParent() : 부모디렉토리를 리턴
	6. getParentFile() : 부모디렉토리를 File객체로 생성후 리턴
	7. getPath() : 전체경로를 리턴
	8. isDirectory() : 디렉토리여부를 리턴
	9. isFile() : 파일여부를 리턴
   10. isHidden() : 숨김파일인지를 리턴
   11. lastModified() : 마지막 수정일시를 리턴
   12. length() : 파일크기를 리턴
   13. list() : 디렉토리에 포함된 파일 및 서브디렉토리 목록전부를 String배열로 리턴
   14. list(FilenameFilter filter) : list()와 동일, 차이점은 filter조건에 맞는 것만 리턴
   15. listFiles() : 디렉토리에 포함된 파일 및 서브디렉토리 목록전부를 File배열로 리턴
   16. listFiles(FilenameFilter filter) : listFiles()과 동일, 차이점은 filter조건에 맞는 것만 리턴
	
*/
public class FileMain {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("d:/temp/dir");
		File file1 = new File("d:/temp/dir/file1.txt");
		File file2 = new File("d:/temp/dir/file2.txt");
		File file3 = new File(new URI("file:///d:/temp/dir/file3.txt"));
		
		if(dir.exists() == false) dir.mkdirs();
		if(file1.exists() == false) file1.createNewFile();
		if(file2.exists() == false) file2.createNewFile();
		if(file3.exists() == false) file3.createNewFile();
		
		File temp = new File("d:/lec206/02.java/workspace/java01.class");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd              a              HH:mm");
		File[] files = temp.listFiles();
		System.out.println("-----------------------------------------------------------");
		for(File file:files) {
			if(file.isDirectory()) {
				System.out.println("\t<dir>\t" + file.getName());
			} else {
				System.out.println("\t" + file.getName() + "\t" + file.length());
			}
		}

	}

}
