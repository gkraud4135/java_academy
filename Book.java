package chapter2;

public class Book {

	public static void main(String[] args) {
		//1. �ν��Ͻ� ����(Ŭ��������, �������)
		Maker book1 = new Maker();    //2.������
		book1.bookName= "hello";
		book1.bookID= 1;
		book1.bookWriter= "�̻�";
		book1.bookPrice=20000;
		book1.bookPublisher="�ϴ�";
		book1.managerID="��";

		
		Maker book2 = new Maker();
		book2.bookName= "bye";
		book2.bookID= 2;
		book2.bookWriter= "�̻�";
		book2.bookPrice=15000;
		
		Maker book3 = new Maker();
		book3.bookName= "nice";
		book3.bookID= 3;
		book3.bookWriter= "good";
		book3.bookPrice=10000;
		
		Maker book4 = new Maker("�ŵ�����","�̻�",30000);
	
	
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
		System.out.println("������ ������");
	}
	Maker(String bookName,String bookWriter,int bookPrice){//�������̵��� ������
		this.bookName=bookName;//�ް�
		this.bookWriter=bookWriter;
		this.bookPrice=bookPrice;
	}
	
//	void setbook(String bookName,String bookWriter,int bookPrice){
//		
//	}
	
	
	//source-generget,set �ʿ��� �κ��� �����ϴ� �޼��� �߰�
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
	//�޼ҵ�,get�޼ҵ�,set�޼ҵ�,
	void showBookInfo(){//3.�޼���
		System.out.println("å�̸�:"+bookName+" ����:"+bookWriter+" ����"+bookPrice);
	}
}

