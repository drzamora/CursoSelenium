package com.excersise;

public class TestersParkTicket extends TicketsParks {

	double adultTicket, childTicket, studentTicket;
	int age;
	boolean student = false;
	String priceDay, park;
	
	
	//Constructor 
	public TestersParkTicket (double price, int personAge, boolean studentId) {
		super();
		adultTicket = price;
		childTicket = price * (.60);
		studentTicket = price * (.70);
		age = personAge;
		student = studentId;
		priceDay = "Normal Day Price";
		park = "Testers Park - ";
		
	}
	
	//Encapsulamiento
	
	
	//Setter
	private void setPriceDay(String priceDay) {
		this.priceDay = priceDay;
	}
	
	
	//Getter
	private String getPriceDay(String priceDay) {
		return priceDay;
	}
	
	
	// Metodo
	@Override
	public double getTicketPrice() {
		double priceTicket;
		if(student == true) {
			priceTicket = studentTicket;
		    System.out.println("studentTicket Price (70% applied): $ "+ studentTicket);
		} else if  (age >=18) {
			priceTicket = adultTicket;
			System.out.println("adultTicket Price: $ "+ adultTicket);
		} else {
				priceTicket = childTicket;
				System.out.println("Child Price (40% applied): $ "+ childTicket);
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
