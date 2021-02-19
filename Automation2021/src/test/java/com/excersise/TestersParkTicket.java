package com.excersise;

public class TestersParkTicket extends TicketsParks {

	double adultTicket, childTicket, studentTicket, studentAndChildTicket, childrensDayTicket, birthdayTicket;
	int age;
	boolean student = false;
	boolean childrensDay = false;
	boolean birthday = false;
	String priceDay, park;
	
	//Constructor 
	public TestersParkTicket (double price, int personAge, boolean studentId, boolean personBirthday, boolean celebration) {
		super();
		this.adultTicket = price;
		this.childTicket = price * (.60);
		this.studentTicket = price * (.70);
		this.childrensDayTicket = price * (.20);
		this.birthdayTicket = price * (.50);
		this.studentAndChildTicket = (this.studentTicket + this.childTicket) - price;
		this.age = personAge;
		this.student = studentId;
		this.birthday = personBirthday;
		this.childrensDay = celebration; 
		this.priceDay = "Normal Day Price"; 
		this.park = "Testers Park - ";
		
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
	
	//Metodo
	@Override
	public double getTicketPrice() {
		double priceTicket;
		
				
        if (age < 13 && childrensDay && student) {
			priceTicket = childrensDayTicket;
		    System.out.println("ChildrensDayTicket Price (80% applied): $ "+ childrensDayTicket);	
	    } else if (age < 13 && !childrensDay && student) {
	    	priceTicket = studentAndChildTicket;
		    System.out.println("Student and ChildTicket Price (70% applied): $ "+ studentAndChildTicket);	
		} else if (age < 18 && birthday && !student) {
			priceTicket = birthdayTicket;
			System.out.println("BirthdayTicket Price (50% applied) : $ "+ birthdayTicket);	    
		} else if (age >= 13 && age <=25 && !birthday && student) {
			priceTicket = studentTicket;
		    System.out.println("StudentTicket Price (30% applied): $ "+ studentTicket);	    
		} else if (age >= 18) {
			priceTicket = adultTicket;
			System.out.println("AdultTicket Price: $ "+ adultTicket);
		} else {
			priceTicket = childTicket;
			System.out.println("ChildTicket Price (40% applied): $ "+ childTicket);
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
