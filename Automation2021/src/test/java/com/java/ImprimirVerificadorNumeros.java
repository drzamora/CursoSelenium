//Escribe un m�todo que se llame imprimirVerificadorNumeros con 3 par�metros de tipo int. El m�todo no debe devolver nada (vac�o).
//
//Si uno de los par�metros es menor que 0, imprima el texto "Valor no v�lido".
//Si todos los n�meros son iguales, imprima el texto "Todos los n�meros son iguales"
//Si todos los n�meros son diferentes, imprima el texto "Todos los n�meros son diferentes".
//De lo contrario, imprima "Ni todos son iguales ni diferentes".
//
//EJEMPLOS DE ENTRADA / SALIDA:
//* printEqual (1, 1, 1); debe imprimir texto Todos los n�meros son iguales
//* printEqual (1, 1, 2); deben imprimir texto Ni todos son iguales o diferentes
//* printEqual (-1, -1, -1); debe imprimir el texto Valor no v�lido
//* printEqual (1, 2, 3); debe imprimir texto Todos los n�meros son diferentes

package com.java;

public class ImprimirVerificadorNumeros {

	public static void main(String[] args) {
		System.out.println(printEqual (1,1,1));
		System.out.println(printEqual (1,1,2));
		System.out.println(printEqual (-1,-1,-1));
		System.out.println(printEqual (1,2,3));
	}
	
	public static String printEqual(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0) {
			return "Valor no v�lido";
		} else if (a == b && a == c) { 
			return "Todos los n�meros son iguales";
		} else if (a != b && a != c) {
			return "Todos los n�meros son diferentes";	
		} else  {
			return "Ni todos son iguales o diferentes";			
		}
		
	}
} 
