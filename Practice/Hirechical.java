package com.Practice;

public class Hirechical {
	String title;
	String author;
	int ISBM;
	private double price;
	Hirechical(String title,String author,int ISBM,double price){
		this.title=title;
		this.author=author;
		this.ISBM=ISBM;
		this.setPrice(price);
	}
	void setPrice(double price) {
		if(price>0) {
			this.price=price;		
		}
	}
	void getDetails() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(ISBM);
		System.out.println(price);
	}
	public static void main(String[] args) {
		PrintedBook pb = new PrintedBook("java","vamsi",143,786,2002);
		EBook eb = new EBook("SQL","vardan",123,460,40.46);
		eb.setPrice(460);
		pb.setPrice(786);
		
		pb.getDetails();
		System.out.println();
		eb.getDetails();
		
	}

}
class PrintedBook extends Hirechical{
	int pages;
	PrintedBook(String title,String author,int ISBM,double price,int pages){
		super(title,author,ISBM,price);
		this.pages=pages;
	}
	void getDetails(){
		super.getDetails();
		System.out.println(pages);
	}
}
class EBook extends Hirechical{
	double fileSize;
	EBook(String title,String author,int ISBM,double price,double fileSize){
		super(title,author,ISBM,price);
		this.fileSize=fileSize;
	}
	void getDetails() {
		super.getDetails();
//		System.out.println(title);
//		System.out.println(author);
//		System.out.println(ISBM);
//		System.out.println(price);
		System.out.println(fileSize);
	}
}