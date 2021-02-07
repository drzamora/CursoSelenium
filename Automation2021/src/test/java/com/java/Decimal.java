//Escriba un método areEqualByThreeDecimalPlaces con dos parámetros de tipo double.
//
//El método debe devolver un valor booleano y debe devolver verdadero si dos números dobles son iguales hasta con tres decimales. De lo contrario, devuelve falso.
//
//EJEMPLOS DE ENTRADA / SALIDA:
//* areEqualByThreeDecimalPlaces (-3.1756, -3.175); ? debería devolver verdadero ya que los números son iguales hasta 3 lugares decimales.
//* areEqualByThreeDecimalPlaces (3.175, 3.176); ? debe devolver falso ya que los números no son iguales hasta 3 lugares decimales
//* areEqualByThreeDecimalPlaces (3.0, 3.0); ? debería devolver verdadero ya que los números son iguales hasta 3 lugares decimales.
//* areEqualByThreeDecimalPlaces (-3.123, 3.123); ? debe devolver falso ya que los números no son iguales hasta 3 posiciones decimales.
//
//SUGERENCIA: Utilice papel y lápiz.
//SUGERENCIA: Usa el casting.
//NOTA: El método areEqualByThreeDecimalPlaces debe definirse como estático público como lo hemos estado haciendo hasta ahora en el curso.
//NOTA: No agregue un método principal al código de la solución.

package com.java;

public class Decimal {

	public static void main(String[] args) {
        System.out.println("¿Los numeros son iguales hasta tres lugares decimiales? " + areEqualByThreeDecimalPlaces (-3.1756, -3.175) );
        System.out.println("¿Los numeros son iguales hasta tres lugares decimiales? " + areEqualByThreeDecimalPlaces (3.175, 3.176) );
        System.out.println("¿Los numeros son iguales hasta tres lugares decimiales? " + areEqualByThreeDecimalPlaces (3.0, 3.0) );
        System.out.println("¿Los numeros son iguales hasta tres lugares decimiales? " + areEqualByThreeDecimalPlaces (-3.123, 3.123) );
	}

	public static boolean areEqualByThreeDecimalPlaces(double numero1, double numero2) {
		
		//Casting - Transformación
		
		int num1 = (int) (numero1 * 1000);
		int num2 = (int) (numero2 * 1000);
			
		//-3.1756, -3.175 = -3175.6 , -3175 son iguales hasta tres numeros decimales verdadero
		
		if(num1 == num2) {
			return true;
		} else {
		
		    return false;
	}
	
  }
	
}
