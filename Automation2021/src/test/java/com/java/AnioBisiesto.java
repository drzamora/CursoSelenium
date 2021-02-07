//Escriba un método isLeapYear con un parámetro de tipo int llamado año.
//
//El parámetro debe ser mayor o igual a 1 y menor o igual a 9999.
//
//Si el parámetro no está en ese rango, devuelve falso.
//
//De lo contrario, si está en el rango válido, calcule si el año es bisiesto y devuelva verdadero si es bisiesto; de lo contrario, devuelva falso.
//
//Para determinar si un año es bisiesto, siga estos pasos:
//1. Si el año es divisible por 4, vaya al paso
//2. De lo contrario, vaya al paso 5.2. Si el año es divisible por 100, vaya al paso
//3. De lo contrario, vaya al paso 4.3. Si el año es divisible por 400, vaya al paso
//4. De lo contrario, vaya al paso 5.4. El año es bisiesto (tiene 366 días). El método isLeapYear debe devolver verdadero.
//5. El año no es bisiesto (tiene 365 días). El método isLeapYear debe devolver falso.
//
//Los siguientes años no son bisiestos:
//1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
//Esto se debe a que son divisibles por 100, pero no por 400.
//
//Los años siguientes son bisiestos:
//1600, 2000, 2400
//Esto se debe a que son divisibles de manera uniforme por 100 y 400.
//
//Ejemplos de entrada / salida:
//
//* isLeapYear (-1600); ? debe devolver falso ya que el parámetro no está en el rango (1-9999)
//* isLeapYear (1600); ? debería devolver verdadero ya que 1600 es un año bisiesto
//* isLeapYear (2017); ? debe devolver falso ya que 2017 no es un año bisiesto
//* isLeapYear (2000); ? debería volver a ser verdadero porque 2000 es un año bisiesto
//
//NOTA: El método isLeapYear debe definirse como estático público, como lo hemos estado haciendo hasta ahora en el curso.
//NOTA: No agregue un método principal al código de la solución.


package com.java;

public class AnioBisiesto {

	public static void main(String[] args) {
		System.out.println("¿El año es Biciesto? "+ isLeapYear(-1600));
		System.out.println("¿El año es Biciesto? "+ isLeapYear(1600));
		System.out.println("¿El año es Biciesto? "+ isLeapYear(2017));
		System.out.println("¿El año es Biciesto? "+ isLeapYear(2000));
		System.out.println("¿El año es Biciesto? "+ isLeapYear(9800));
		System.out.println("¿El año es Biciesto? "+ isLeapYear(10000));
		
		System.out.println("¿Es año Biciesto? "+ anioBiciesto(-1600));
		System.out.println("¿Es año Biciesto? "+ anioBiciesto(2700));
		System.out.println("¿Es año Biciesto? "+ anioBiciesto(1700));
		System.out.println("¿Es año Biciesto?  "+ anioBiciesto(1800));
		System.out.println("¿Es año Biciesto?  "+ anioBiciesto(1900));
		System.out.println("¿Es año Biciesto?  "+ anioBiciesto(2100));
		System.out.println("¿Es año Biciesto? "+ anioBiciesto(2200));
		System.out.println("¿Es año Biciesto? "+ anioBiciesto(2300));
		System.out.println("¿Es año Biciesto? "+ anioBiciesto(2500));
		System.out.println("¿Es año Biciesto? "+ anioBiciesto(2600));
		System.out.println("¿Es año Biciesto? "+ anioBiciesto(1600));
		System.out.println("¿Es año Biciesto? "+ anioBiciesto(2000));
		System.out.println("¿Es año Biciesto? "+ anioBiciesto(2400));
		
	}

	
	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) {
			return false;
		}else {
			boolean esDivisibleEntre4 = false;
			boolean esDivisibleEntre100 = false;
			boolean esDivisibleEntre400 = false;
			
			if ( (year % 4) == 0) {
				esDivisibleEntre4 = true;
			} else {
				esDivisibleEntre4 = false;
			}
			
			if ( (year % 100) == 0) {
				esDivisibleEntre100 = true;
			} else {
				esDivisibleEntre100 = false;
			}
			
			if ( (year % 400) == 0) {
				esDivisibleEntre400 = true;
			} else {
				esDivisibleEntre400 = false;
			}
			
			if ( (esDivisibleEntre4 == true && esDivisibleEntre100 == false) || (esDivisibleEntre400 == true)  ) {
				return true;
			} else {
				return false;
			}
			  
		}
			
	}
	
	public static boolean anioBiciesto (int year) {
		if (year < 1 || year > 9999) {
			return false;
		}
		return ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ); 
	}
	
}
