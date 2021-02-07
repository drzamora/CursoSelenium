//Escriba un m�todo areEqualByThreeDecimalPlaces con dos par�metros de tipo double.
//
//El m�todo debe devolver un valor booleano y debe devolver verdadero si dos n�meros dobles son iguales hasta con tres decimales. De lo contrario, devuelve falso.
//
//EJEMPLOS DE ENTRADA / SALIDA:
//* areEqualByThreeDecimalPlaces (-3.1756, -3.175); ? deber�a devolver verdadero ya que los n�meros son iguales hasta 3 lugares decimales.
//* areEqualByThreeDecimalPlaces (3.175, 3.176); ? debe devolver falso ya que los n�meros no son iguales hasta 3 lugares decimales
//* areEqualByThreeDecimalPlaces (3.0, 3.0); ? deber�a devolver verdadero ya que los n�meros son iguales hasta 3 lugares decimales.
//* areEqualByThreeDecimalPlaces (-3.123, 3.123); ? debe devolver falso ya que los n�meros no son iguales hasta 3 posiciones decimales.
//
//SUGERENCIA: Utilice papel y l�piz.
//SUGERENCIA: Usa el casting.
//NOTA: El m�todo areEqualByThreeDecimalPlaces debe definirse como est�tico p�blico como lo hemos estado haciendo hasta ahora en el curso.
//NOTA: No agregue un m�todo principal al c�digo de la soluci�n.

package com.java;

public class Decimal {

	public static void main(String[] args) {
        System.out.println("�Los numeros son iguales hasta tres lugares decimiales? " + areEqualByThreeDecimalPlaces (-3.1756, -3.175) );
        System.out.println("�Los numeros son iguales hasta tres lugares decimiales? " + areEqualByThreeDecimalPlaces (3.175, 3.176) );
        System.out.println("�Los numeros son iguales hasta tres lugares decimiales? " + areEqualByThreeDecimalPlaces (3.0, 3.0) );
        System.out.println("�Los numeros son iguales hasta tres lugares decimiales? " + areEqualByThreeDecimalPlaces (-3.123, 3.123) );
	}

	public static boolean areEqualByThreeDecimalPlaces(double numero1, double numero2) {
		
		//Casting - Transformaci�n
		
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
