package com.Practice;
import java.util.Scanner;
public class Ticket {

	static int price;
	static int seatNumber;
	Ticket(){
		
	}
	double calculateFinalPrice(){
		return 0;
	}
	Ticket(int price1,int seatNumber1){
		price=price1;
		seatNumber=seatNumber1; 
	} 
	//public String toSting() {
		//return "Price: "+Ticket.price+"SeatNumber"+Ticket.seatNumber;
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter type of ticket 1.bus and 2.flight");
		int type1=sc.nextInt();
		switch(type1) {
		case 1:
			BusTicket obj1=new BusTicket(100,11,sc);
			double total=obj1.calculateFinalPrice();
			System.out.println(total);
			break;
		case 2:
			FlightTicket obj2=new FlightTicket(200,24,sc);
			double total1=obj2.calculateFinalPrice();
			System.out.println(total1);
			break;
		}
		
	
		sc.close();
		
	}
}
class BusTicket extends Ticket{ 
	int no_of_tickets;
	double discountPrice;
	double total;
	BusTicket(int price,int seatNumber,Scanner sc){
		super(price,seatNumber);
		System.out.print("enter No of tickets: ");
		no_of_tickets=sc.nextInt(); 
	}
	
	double calculateFinalPrice(){
		discount();
		total=(no_of_tickets*Ticket.price)-discountPrice;
		return total; 
	}
	void discount() {
		if(no_of_tickets*Ticket.price>=500) {
			discountPrice=(no_of_tickets*Ticket.price)*(10.0/100.0);
		}
	} 
	public String toString() { 
		return "Price: "+Ticket.price+"SeatNumber"+Ticket.seatNumber;
	}
}
class FlightTicket extends Ticket{
	int no_of_tickets;
	static double discountPrice;
	double total;
	FlightTicket(int price,int seatNumber,Scanner sc){
		super(price,seatNumber);
		System.out.print("enter No of tickets: ");
		no_of_tickets=sc.nextInt();
	}
	void discount() {
		if(no_of_tickets*Ticket.price>=700) {
			discountPrice=(no_of_tickets*Ticket.price)*(15.0/100.0);
			
		}
 
	} 
	double calculateFinalPrice(){
		discount();
		total=(no_of_tickets*Ticket.price)-discountPrice; 
		return total;
	}
	public String toString() {
		return "Price: "+Ticket.price+"SeatNumber"+Ticket.seatNumber;
	}
}
