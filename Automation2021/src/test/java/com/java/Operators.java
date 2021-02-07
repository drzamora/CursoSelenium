package com.java;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aritmeticos (+,-,/,*,%)
		
		int x = 6;
		int y = 4;
		
//		int z = x * y;
		int z = x % y;
		
		System.out.println("Este es el valor de z: " + z);
		
		//Unarios (-,--,+,++,!)
		
		int A = 3;
		int B = 4;
		
		System.out.println("Este es el valor de A: " + -A);
		System.out.println("Este es el valor de A: " + --A); //Incrementar
		System.out.println("Este es el valor de A: " + +A);
		System.out.println("Este es el valor de A: " + ++A);
		
		System.out.println("Este es el valor de B: " + -B);
		System.out.println("Este es el valor de B: " + --B); //Incrementar
		System.out.println("Este es el valor de B: " + +B);
		System.out.println("Este es el valor de B: " + ++B);
		
		//Relacionales (-,--,+,++,!)
		
		if (A == B) {
			System.out.println("A y B son valores iguales ");
		}
		
//		if (A != B) {
//			System.out.println("A y B son valores iguales ");	
//		if (A >= B) {
//			System.out.println("A y B son valores iguales ");	
//		if (A > B) {
//			System.out.println("A y B son valores iguales ");	
//		if (A < B) {
//			System.out.println("A y B son valores iguales ");	
//		if (A <= B) {
//			System.out.println("A y B son valores iguales ");
		
		//Condicionales (&&, ||)
		
		int var1 = 5;		
		int var2 = 6;	
		int var3 = 5;	
		int var4 = 5;	
		
		if (var1 == var2 && var3 == var4) {        //No entra en BLACK CODE porque no se cumplen ambas condiciones  5 no es igual a 6 y aunque 5 es igual a 5
			System.out.println("BLOCK CODE ");
			
		}
		
		int var5 = 5;		
		int var6 = 5;	
		int var7 = 5;	
		int var8 = 5;	
	    
		if (var5 == var6 || var7 == var8) {
			System.out.println("BLOCK CODE 2 ");
		
		}
		
		
	}

}
