package com.lec206.ex06_lifo_fifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		Queue<Message> msg = new LinkedList<>();
		
		msg.offer(new Message("sendMail", "홍길동"));
		msg.offer(new Message("sendTwitter", "홍길순"));
		msg.offer(new Message("sendFaceBook", "홍길자"));

		while(!msg.isEmpty()) {
			Message m = msg.poll();
			switch (m.message) {
			case "sendMail":
				System.out.println(m.to + "에게 메일을 보냈습니다!");				
				break;
			case "sendTwitter":
				System.out.println(m.to + "에게 트윗을 보냈습니다!");				
				break;
			default:
				System.out.println(m.to + "에게 페이이북 문자를 보냈습니다!");				
			}
		}
	}

}

class Message {
	
	public String message;
	public String to;
	
	public Message(String message, String to) {
		super();
		this.message = message;
		this.to = to;
	}

}