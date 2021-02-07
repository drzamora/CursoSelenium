package com.excersise;

public class TicketDesk {

	public static void main(String[] args) {

		double precioCoolPark = 100;
		double precioTestersPatk = 110;
		int age = 25;
		boolean student = true;
		
//		CoolParkTicket coolPark = new CoolParkTicket(100, 20 , false);
//		coolPark.printPriceDay("xyc", "Día del niño");
//		coolPark.getTicketPrice();
//		
//		TestersParkTicket testersPark = new TestersParkTicket(precioCoolPark, age, student);
//		testersPark.printPriceDay("xyc", "Día del niño");
//		testersPark.getTicketPrice();
		
		TicketsParks ticket = new CoolParkTicket(precioCoolPark, age, student);
		ticket.printPriceDay();
		ticket.getTicketPrice();
		
		ticket = new TestersParkTicket(precioCoolPark, age, student); //Polimorfismo
		ticket.printPriceDay();
		ticket.getTicketPrice();
		
	}

}
