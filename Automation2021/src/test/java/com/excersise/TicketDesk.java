package com.excersise;

public class TicketDesk {

	public static void main(String[] args) {

		double precioCoolPark = 100;
		double precioTestersPark = 100;
		int age = 12;
		boolean student = true;
		boolean childrensDay = true;
		boolean birthday = false;
		double totalPriceTicket;

		
//		CoolParkTicket coolPark = new CoolParkTicket(100, 20 , false);
//		coolPark.printPriceDay("xyc", "Día del niño");
//		coolPark.getTicketPrice();
//		
//		TestersParkTicket testersPark = new TestersParkTicket(precioCoolPark, age, student);
//		testersPark.printPriceDay("xyc", "Día del niño");
//		testersPark.getTicketPrice();
		
		
		TicketsParks ticket = new CoolParkTicket(precioCoolPark, age, student);
		ticket.printPriceDay();
		totalPriceTicket =  ticket.getTicketPrice();

		ticket = new TestersParkTicket(precioTestersPark, age, student, birthday, childrensDay); //Polimorfismo
		ticket.printPriceDay();                                         
		totalPriceTicket = totalPriceTicket + ticket.getTicketPrice();
		
		System.out.println("TotalTicket Price $: " + totalPriceTicket);
		
	}

}
