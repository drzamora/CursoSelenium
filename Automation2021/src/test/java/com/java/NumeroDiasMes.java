//Escriba un m�todo getDaysInMonth con dos par�metros mes y a�o. ? Ambos de tipo int.
//
//Si el mes del par�metro es <1 o> 12, devuelve -1. ?
//Si el a�o del par�metro es <1 o> 9999, devuelve -1.
//
//Este m�todo debe devolver el n�mero de d�as del mes. Tenga cuidado con los a�os bisiestos, tienen 29 d�as en el mes 2 (febrero).
//
//Debe verificar si el a�o es bisiesto utilizando el m�todo isLeapYear descrito anteriormente.
//
//Ejemplos de entrada / salida:
//* getDaysInMonth (1, 2020); ? Debe devolver 31 ya que enero tiene 31 d�as.
//* getDaysInMonth (2, 2020); ? debe regresar 29 ya que febrero tiene 29 d�as en un a�o bisiesto y 2020 es un a�o bisiesto.
//* getDaysInMonth (2, 2018); ? deber�a devolver 28 ya que febrero tiene 28 d�as si no es un a�o bisiesto y 2018 no es un a�o bisiesto.
//* getDaysInMonth (-1, 2020); ? deber�a devolver -1 ya que el mes del par�metro no es v�lido.
//* getDaysInMonth (1, -2020); ? deber�a devolver -1 ya que el a�o del par�metro est� fuera del rango de 1 a 9999.
//
//SUGERENCIA: Utilice la declaraci�n de cambio.
//NOTA: Los m�todos isLeapYear y getDaysInMonth deben ser est�ticos p�blicos como lo hemos estado haciendo hasta ahora en el curso.
//NOTA: No agregue un m�todo principal al c�digo de la soluci�n.

package com.java;

import java.util.Date;
import java.util.GregorianCalendar;

public class NumeroDiasMes {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(-1600));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(2700));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(1700));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(1800));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(1900));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(2100));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(2200));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(2300));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(2500));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(2600));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(1600));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(2000));
		System.out.println("�Es a�o Biciesto? "+ anioBisiesto(2400));
		
		System.out.println("Numero de d�as "+ numeroDias(1, 2020));
		System.out.println("Numero de d�as "+ numeroDias(4, 2021));
		System.out.println("Numero de d�as "+ numeroDias(2, 2020));
		System.out.println("Numero de d�as "+ numeroDias(2, 2018));
		System.out.println("Numero de d�as "+ numeroDias(-3, 2020));
		System.out.println("Numero de d�as "+ numeroDias(0, 2018));
		System.out.println("Numero de d�as "+ numeroDias(13, 2021));
		System.out.println("Numero de d�as "+ numeroDias(1, -2020));
		System.out.println("Numero de d�as "+ numeroDias(5, 0));
		System.out.println("Numero de d�as "+ numeroDias(5, 10000));
		System.out.println("Numero de d�as "+ numeroDias(0, 0));

	}
	
		public static boolean anioBisiesto(int anio) { 
		if (anio <= 0 || anio > 9999) {
		   return false;
		} else if ( anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
		   return true;
		} else { 
		   return false;
		}
	}
                
		public static boolean esBisiesto(int anio) {
 
			GregorianCalendar calendar = new GregorianCalendar();
			boolean esBisiesto = false;
			if (calendar.isLeapYear(anio)) {
				esBisiesto = true;
			}
			return esBisiesto;
 
		}
		
		public static int numeroDias (int mes, int anio) { 
			
			int numeroDias = -1;	
            if (anio <= 0 || anio > 9999) {
                return numeroDias = -1;
            }
			switch(mes) {
				case 1:
				case 3:
				case 5:
				case 7:	
				case 8:	
				case 10:	
				case 12:	
					numeroDias = 31;
					break;
					
				case 4:
				case 6:
				case 9:
				case 11:	
					numeroDias = 30;
					break;	
					
				case 2:
					if((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
					numeroDias = 29;
                    } else {
                    numeroDias = 28;
                    }
                    break;	
                        
				default:
				numeroDias = -1;
				
	          }
			  return numeroDias;
   }
}
