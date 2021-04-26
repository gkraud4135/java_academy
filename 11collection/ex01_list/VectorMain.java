package com.lec206.ex01_list;

import java.util.List;
import java.util.Vector;
// Vector list= new Vector();  double num=1.2  
// int index=list.indexOf(num); 이미 있는 숫자를 넣는것이 위치를 찾는것
public class VectorMain {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1", "내용1", "작성자1"));
		list.add(new Board("제목2", "내용2", "작성자2"));
		list.add(new Board("제목3", "내용3", "작성자3"));
		list.add(new Board("제목4", "내용4", "작성자4"));
		list.add(new Board("제목5", "내용5", "작성자5"));
		
		list.remove(2);
		list.remove(2);

		for(Board board:list) {
			System.out.println(board.toString());
		}
	}

}

class Board {
	
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
}