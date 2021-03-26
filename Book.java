package chapter2;

public class Book {

	public static void main(String[] args) {
		//1. 인스턴스 변수(클래스변수, 멤버변수)
		Maker book1 = new Maker();    //2.생성자
		book1.bookName= "hello";
		book1.bookID= 1;
		book1.bookWriter= "미상";
		book1.bookPrice=20000;
		book1.bookPublisher="하늘";
		book1.managerID="이";

		
		Maker book2 = new Maker();
		book2.bookName= "bye";
		book2.bookID= 2;
		book2.bookWriter= "미상";
		book2.bookPrice=15000;
		
		Maker book3 = new Maker();
		book3.bookName= "nice";
		book3.bookID= 3;
		book3.bookWriter= "good";
		book3.bookPrice=10000;
		
		Maker book4 = new Maker("신데렐라","미상",30000);
	
	
		book1.showBookInfo();
		book2.showBookInfo();
		book3.showBookInfo();
		book4.showBookInfo();
		
	}
	

}


class Maker {
	int bookID;
	public String bookName;
	public String bookWriter;
	int bookPrice;
	String bookPublisher;
	String managerID;

	static int width = 100;
	static int height = 200;
	
	Maker(){
		System.out.println("디폴드 생성자");
	}
	Maker(String bookName,String bookWriter,int bookPrice){//오버로딩된 생성자
		this.bookName=bookName;//메개
		this.bookWriter=bookWriter;
		this.bookPrice=bookPrice;
	}
	
//	void setbook(String bookName,String bookWriter,int bookPrice){
//		
//	}
	
	
	//source-generget,set 필요한 부분을 감별하는 메서드 추가
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	//메소드,get메소드,set메소드,
	void showBookInfo(){//3.메서드
		System.out.println("책이름:"+bookName+" 저자:"+bookWriter+" 가격"+bookPrice);
	}
}

