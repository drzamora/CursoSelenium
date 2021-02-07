//Escriba un método getDaysInMonth con dos parámetros mes y año. ? Ambos de tipo int.
//
//Si el mes del parámetro es <1 o> 12, devuelve -1. ?
//Si el año del parámetro es <1 o> 9999, devuelve -1.
//
//Este método debe devolver el número de días del mes. Tenga cuidado con los años bisiestos, tienen 29 días en el mes 2 (febrero).
//
//Debe verificar si el año es bisiesto utilizando el método isLeapYear descrito anteriormente.
//
//Ejemplos de entrada / salida:
//* getDaysInMonth (1, 2020); ? Debe devolver 31 ya que enero tiene 31 días.
//* getDaysInMonth (2, 2020); ? debe regresar 29 ya que febrero tiene 29 días en un año bisiesto y 2020 es un año bisiesto.
//* getDaysInMonth (2, 2018); ? debería devolver 28 ya que febrero tiene 28 días si no es un año bisiesto y 2018 no es un año bisiesto.
//* getDaysInMonth (-1, 2020); ? debería devolver -1 ya que el mes del parámetro no es válido.
//* getDaysInMonth (1, -2020); ? debería devolver -1 ya que el año del parámetro está fuera del rango de 1 a 9999.
//
//SUGERENCIA: Utilice la declaración de cambio.
//NOTA: Los métodos isLeapYear y getDaysInMonth deben ser estáticos públicos como lo hemos estado haciendo hasta ahora en el curso.
//NOTA: No agregue un método principal al código de la solución.

package com.java;

import java.util.Date;
import java.util.GregorianCalendar;

public class NumeroDiasMes {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(-1600));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(2700));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(1700));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(1800));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(1900));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(2100));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(2200));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(2300));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(2500));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(2600));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(1600));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(2000));
		System.out.println("¿Es año Biciesto? "+ anioBisiesto(2400));
		
		System.out.println("Numero de días "+ numeroDias(1, 2020));
		System.out.println("Numero de días "+ numeroDias(4, 2021));
		System.out.println("Numero de días "+ numeroDias(2, 2020));
		System.out.println("Numero de días "+ numeroDias(2, 2018));
		System.out.println("Numero de días "+ numeroDias(-3, 2020));
		System.out.println("Numero de días "+ numeroDias(0, 2018));
		System.out.println("Numero de días "+ numeroDias(13, 2021));
		System.out.println("Numero de días "+ numeroDias(1, -2020));
		System.out.println("Numero de días "+ numeroDias(5, 0));
		System.out.println("Numero de días "+ numeroDias(5, 10000));
		System.out.println("Numero de días "+ numeroDias(0, 0));

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
