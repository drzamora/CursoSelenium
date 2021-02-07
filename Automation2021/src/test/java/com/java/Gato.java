//Los gatos pasan la mayor parte del día jugando. En particular, juegan si la temperatura está entre 25 y 35 (inclusive). A menos que sea verano, el límite superior es 45 (inclusive) en lugar de 35.
//
//Escriba un método isCatPlaying que tenga 2 parámetros. El método debe devolver verdadero si el gato está jugando; de lo contrario, devolver falso
//
//El primer parámetro debe ser de tipo booleano y debe llamarse "verano" que representa si es verano.
//El segundo parámetro representa la temperatura y es de tipo int con el nombre "temperatura".
//
//EJEMPLOS DE ENTRADA / SALIDA:
//* isCatPlaying (verdadero, 10); debe devolver falso ya que la temperatura no está en el rango de 25 a 45
//* isCatPlaying (falso, 36); debe devolver falso ya que la temperatura no está en el rango de 25 a 35 (el parámetro de verano es falso)
//* isCatPlaying (falso, 35); debería volver a verdadero ya que la temperatura está en el rango de 25 a 35

package com.java;

public class Gato {

	public static void main(String[] args) {
	System.out.println("El Gato esta jugando "+isCatPlaying (true, 24) );
	System.out.println("El Gato esta jugando "+isCatPlaying (true, 25) );
	System.out.println("El Gato esta jugando "+isCatPlaying (false, 35) );
	System.out.println("El Gato esta jugando "+isCatPlaying (false, 36) );
	}
	
	
	public static Boolean isCatPlaying(boolean verano, int temperatura) {
//	if ( (temperatura >=25 && temperatura <= 45) && (verano == true) || (temperatura >=25 && temperatura <= 35) && (verano == false) ) {
	if ( (verano && temperatura >=25 && temperatura <= 45) || (!verano && temperatura >=25 && temperatura <= 35) ) {		
		return true;
	    } else {
		  return false;
		}
	}
	
}
