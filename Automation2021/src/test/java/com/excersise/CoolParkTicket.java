package com.excersise;

public class CoolParkTicket extends TicketsParks{

	double adultTicket, childTicket, studentTicket, studentAndChildTicket;
	int age;
	boolean student = false;
	String priceDay, park;
	
	//Constructor 
	public CoolParkTicket (double price, int personAge, boolean studentId) {
		super();
		this.adultTicket = price;
		this.childTicket = price * (.80);
		this.studentTicket = price * (.50);
		this.studentAndChildTicket = (this.studentTicket + this.childTicket) - price;
		this.age = personAge;
		this.student = studentId;
		this.priceDay = "Normal Day Price";
		this.park = "Cool Park - ";
		
	}
	
	//Encapsulación
	
	
	//Setter
	private void setPriceDay(String priceDay) {
		this.priceDay = priceDay;
	}
	
	
	//Getter
	private String getPriceDay(String priceDay) {
		return priceDay;
	}
	
	
	//Metodo
	@Override
	public double getTicketPrice() {
		double priceTicket;
		
		if(age < 13 && student) {
			priceTicket = studentAndChildTicket;
			System.out.println("Student and ChildTicket Price (70% applied): $ "+ studentAndChildTicket);	
		} else if(age >= 13 && student) {
			priceTicket = studentTicket;
		    System.out.println("StudentTicket Price (50% applied): $ "+ studentTicket);
		} else if (age >= 18) {
			priceTicket = adultTicket;
			System.out.println("AdultTicket Price: $ "+ adultTicket);
		} else {
			priceTicket = childTicket;
			System.out.println("ChildTicket Price (20% applied): $ "+ childTicket);
		}
			
		return priceTicket;
	}
	
	//Overloading
	@Override
	public void printPriceDay() {
		System.out.println(welcomeMessageString() + park + getPriceDay(priceDay));
		 
	}
	
	@Override
	public void printPriceDay(String keyManager, String priceDay) {
		setPriceDay(priceDay);
		System.out.println(welcomeMessageString() + park + getPriceDay(priceDay));
		
	}

}
