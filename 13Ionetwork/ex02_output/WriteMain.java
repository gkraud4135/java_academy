package com.lec206.ex02_output;

import java.io.FileOutputStream;
import java.io.OutputStream;

/*
	OutputStream
	
	OutputStream은 바이트기반 출력스트림의 최상위 추상클래스이다. 모든 바이트기반 출력
	스트림(FileOutputStream, PrintOutputStream, BufferedOutputStream, DataOutputStream)dms
	모두 OutputStream을 상속한다.
	
	OutputStream의 주요메서드
	
	1. write(int b) : 1바이트씩 출력
	2. write(byte[] b) : 매개값으로 주어진 바이트배열 바이트씩 출력
	3. write(bte[] b, int off, int len) : b[off]부터 len까지의 바이트를 출력
	4. flush() : 버퍼에 남아있는 바이트 전부를 출력
	   ... 출력스트림은 내부에 작은 buffer가 있어서 데이터가 출력되기 전에 번퍼에 저장
	       하고 있다가 순서대로 출력이 되는데 flush()메서드는 버퍼에 남아 있는 모든 데
	       이터를 출력시키고 버퍼를 비운다.
	5. close() : 사용된 자원을 반납하고 출력 스트림을 닫는다.
*/
public class WriteMain {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("src/com/lec206/ex02_output/sample.txt");
		
		// 1. write()
		byte[] data = "ABCDEF".getBytes();
		for(int i=0;i<data.length;i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
		
		// 2. write(byte[])
		os = new FileOutputStream("src/com/lec206/ex02_output/sample.txt");
		data = "1234567890".getBytes();
		os.write(data);
		os.flush();
		os.close();
		
		// 3. write(byte[], off, len)
		os = new FileOutputStream("src/com/lec206/ex02_output/sample.txt");
		data = "1234567890".getBytes();
		os.write(data, 0, 5);
		os.flush();
		os.close();
	}

}


















