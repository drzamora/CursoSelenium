//Escriba un m�todo isLeapYear con un par�metro de tipo int llamado a�o.
//
//El par�metro debe ser mayor o igual a 1 y menor o igual a 9999.
//
//Si el par�metro no est� en ese rango, devuelve falso.
//
//De lo contrario, si est� en el rango v�lido, calcule si el a�o es bisiesto y devuelva verdadero si es bisiesto; de lo contrario, devuelva falso.
//
//Para determinar si un a�o es bisiesto, siga estos pasos:
//1. Si el a�o es divisible por 4, vaya al paso
//2. De lo contrario, vaya al paso 5.2. Si el a�o es divisible por 100, vaya al paso
//3. De lo contrario, vaya al paso 4.3. Si el a�o es divisible por 400, vaya al paso
//4. De lo contrario, vaya al paso 5.4. El a�o es bisiesto (tiene 366 d�as). El m�todo isLeapYear debe devolver verdadero.
//5. El a�o no es bisiesto (tiene 365 d�as). El m�todo isLeapYear debe devolver falso.
//
//Los siguientes a�os no son bisiestos:
//1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
//Esto se debe a que son divisibles por 100, pero no por 400.
//
//Los a�os siguientes son bisiestos:
//1600, 2000, 2400
//Esto se debe a que son divisibles de manera uniforme por 100 y 400.
//
//Ejemplos de entrada / salida:
//
//* isLeapYear (-1600); ? debe devolver falso ya que el par�metro no est� en el rango (1-9999)
//* isLeapYear (1600); ? deber�a devolver verdadero ya que 1600 es un a�o bisiesto
//* isLeapYear (2017); ? debe devolver falso ya que 2017 no es un a�o bisiesto
//* isLeapYear (2000); ? deber�a volver a ser verdadero porque 2000 es un a�o bisiesto
//
//NOTA: El m�todo isLeapYear debe definirse como est�tico p�blico, como lo hemos estado haciendo hasta ahora en el curso.
//NOTA: No agregue un m�todo principal al c�digo de la soluci�n.


package com.java;

public class AnioBisiesto {

	public static void main(String[] args) {
		System.out.println("�El a�o es Biciesto? "+ isLeapYear(-1600));
		System.out.println("�El a�o es Biciesto? "+ isLeapYear(1600));
		System.out.println("�El a�o es Biciesto? "+ isLeapYear(2017));
		System.out.println("�El a�o es Biciesto? "+ isLeapYear(2000));
		System.out.println("�El a�o es Biciesto? "+ isLeapYear(9800));
		System.out.println("�El a�o es Biciesto? "+ isLeapYear(10000));
		
		System.out.println("�Es a�o Biciesto? "+ anioBiciesto(-1600));
		System.out.println("�Es a�o Biciesto? "+ anioBiciesto(2700));
		System.out.println("�Es a�o Biciesto? "+ anioBiciesto(1700));
		System.out.println("�Es a�o Biciesto?  "+ anioBiciesto(1800));
		System.out.println("�Es a�o Biciesto?  "+ anioBiciesto(1900));
		System.out.println("�Es a�o Biciesto?  "+ anioBiciesto(2100));
		System.out.println("�Es a�o Biciesto? "+ anioBiciesto(2200));
		System.out.println("�Es a�o Biciesto? "+ anioBiciesto(2300));
		System.out.println("�Es a�o Biciesto? "+ anioBiciesto(2500));
		System.out.println("�Es a�o Biciesto? "+ anioBiciesto(2600));
		System.out.println("�Es a�o Biciesto? "+ anioBiciesto(1600));
		System.out.println("�Es a�o Biciesto? "+ anioBiciesto(2000));
		System.out.println("�Es a�o Biciesto? "+ anioBiciesto(2400));
		
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
