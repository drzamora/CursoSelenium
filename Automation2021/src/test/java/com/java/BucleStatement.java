package com.java;

public class BucleStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// While
		
		int numero = 1;
		
		while(numero<=10) {
			System.out.println("El número es "+ numero);
			++numero;
		}

		//Do While ¿Cuantas veces tiene que sumar un  mismo  numero para llegar a 100?
		
		int numeroLimite = 20;
		int sumTotal = 0;
		int count = 0;
		do {
//			sumTotal = (numeroLimite + numeroLimite); 
			sumTotal += numeroLimite; 
			++count;
			
		}while(sumTotal<100);
		System.out.println("El numero se sumo " + count);
		
		//FOR
		
		int numeroFor= 10;
		for(int i=1; i<numeroFor; i++) {
			System.out.println("El número del FOR es "+ i);
		}
		
			
		
	}

}
