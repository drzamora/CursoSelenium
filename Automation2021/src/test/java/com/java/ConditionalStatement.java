package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidad = 90; // km/hr
		int limiteVelocidad = 80;
		 
//		if(velocidad > limiteVelocidad) { //> mayor, 
//			System.out.println("El coche va a exceso de velicidad");
//		}else {
//			System.out.println("El coche va en la velocidad adecuada");
//		}
		
        // IF ANIDADO
		
		Boolean carretera = true;
		 
		if(carretera) {  
			System.out.println("Estas en una carretera");
		
			limiteVelocidad = 110; //km/KR
			
			
			if(velocidad > limiteVelocidad) { //> mayor, 
				System.out.println("El coche va a exceso de velicidad");
			}else {
				System.out.println("El coche va en la velocidad adecuada");
			}
				
		}else if (velocidad > limiteVelocidad) {
			System.out.println("El coche esta en una calle y va a exceso de velocidad");
		}else {
		    System.out.println("El coche esta en una calle y va a la velocidad adecuada");
		}
		
		
		//SWITCH CASE
		
		int temperatura = 40;
		
		switch(temperatura) {
		
		case 5:
		System.out.println("Mucho Frío");
		break;
		
		case 10:
		System.out.println("Frío");
		break;
		
		case 20:
		System.out.println("Clima Agradable");
		break;
		
		case 30:
		System.out.println("Calor");
		break;
		
		default:
		System.out.println("No encontro relación con la temperatura");
		break;
		}
				
	}

}
