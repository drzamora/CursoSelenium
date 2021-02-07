//Escribe un metodo que se llame hasEqualSum con 3 parametros de tipo int.
//
//El metodo debe regresar un valor booleano verdadero si la suma de los dos primeros parametros es igual a la suma del tercer parametro, en otro caso devolver false.
//
//Aqui algunos ejemplos de input y output:
//* hasEqualSum(1, 1, 1);  deberia regresar FALSE porque la suma de 1+1 no es 1
//* hasEqualSum(1, 1, 2);  deberia regresar TRUE porque la suma de 1+1 si es 2


package com.java;

public class VerificadorSumaNumero {

	public static void main(String[] args) {
		System.out.println("El valor es " + hasEqualSum(1,1,1));	
		System.out.println("El valor es " + hasEqualSum(1,1,2));	
	}
	
	public static boolean hasEqualSum (int a, int b, int c) {
		
		if ((a+b) == c) {
			return true;
		}else { 
			return false;
			
		}
	
		
	}
	
}
