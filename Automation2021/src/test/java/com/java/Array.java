package com.java;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		System.out.println("El d�a de la semana es " +dias[2]);
		
		String diaSemana = dias[2];
		System.out.println("El d�a de la semana es " + diaSemana);
		
		for(int i=0; i<7; i++) {
			System.out.println(dias[i]);
		}
		
		
		String [][]amigo = new String [2][2];
		amigo[0][0]="Ricardo";	
		amigo[0][1]="Leonardo";	
		amigo[1][0]="Carlos";		
		amigo[0][0]="Alez";
		
		System.out.println("La posici�n bidimensional es " + amigo[1][0]);
	}

	public static void metodo () {
		System.out.println("Este es mi metodo");
	}
	
//	public static int suma (int x, int y ) {
//		metodo ();
//		return x+y;
//	}

	public static String frases(String frase, String frase2, int numero) {
		return frase + " " +frase2 + " "+ numero;
	}

	public static void  wrapperMethod () {
		metodo();
		suma(1,2);
	}
	
	public static int suma(int x, int y) {
		return x+y;	
		
	}
	
	
    public static int suma(int x, int y, int z) {
		return x+y+z;	
    }	
		
	public static int suma(int x, int y, int z, int a ) {
			return x+y+z+a;	
	}	
}
