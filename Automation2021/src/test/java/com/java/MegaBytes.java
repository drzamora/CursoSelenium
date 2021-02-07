//Escriba un m�todo llamado printMegaBytesAndKiloBytes que tenga 1 par�metro de tipo int con el nombre kiloBytes.
//
//El m�todo no debe devolver nada (vac�o) y necesita calcular los megabytes y los kilobytes restantes a partir del par�metro kilobytes.
//Luego, debe imprimir un mensaje con el formato "XX KB = YY MB y ZZ KB".
//
//XX representa el valor original kiloBytes.
//YY representa los megabytes calculados.
//ZZ representa los kilobytes restantes calculados.
//
//Por ejemplo, cuando el par�metro kiloBytes es 2500, debe imprimir "2500 KB = 2 MB y 452 KB".
//Si el par�metro kiloBytes es menor que 0, imprima el texto "Valor no v�lido".
//
//EJEMPLO ENTRADA / SALIDA
//* printMegaBytesAndKiloBytes (2500); ? debe imprimir el siguiente texto: "2500 KB = 2 MB y 452 KB"
//* printMegaBytesAndKiloBytes (-1024); ? debe imprimir el siguiente texto: "Valor no v�lido" porque el par�metro es menor que 0.
//* printMegaBytesAndKiloBytes (5000); ? debe imprimir el siguiente texto: "5000 KB = 4 MB y 904 KB"
//
//SUGERENCIA: Tenga mucho cuidado con los espacios en el mensaje impreso.
//SUGERENCIA: Utilice el operador restante
//SUGERENCIA: 1 MB = 1024 KB
//NOTA: No establezca el valor del par�metro kilobytes dentro de su m�todo.
//NOTA: No se aceptar� la soluci�n si hay espacios adicionales.
//NOTA: El m�todo printMegaBytesAndKiloBytes debe definirse como est�tico p�blico como lo hemos estado haciendo hasta ahora en el curso. NOTA: No agregue un m�todo principal al c�digo de la soluci�n.

package com.java;

public class MegaBytes {

	public static void main(String[] args) {
		
		MegaBytes mega = new MegaBytes();
		
		mega.printMegaBytesAndKiloBytes(2500);
		mega.printMegaBytesAndKiloBytes(-1024);
		mega.printMegaBytesAndKiloBytes(0);
		mega.printMegaBytesAndKiloBytes(5000);

	}

	public static void printMegaBytesAndKiloBytes(int kilobytes) {
		
		//Opciones Inv�lidas
		if (kilobytes < 0) {
			System.out.println("Valor no v�lido");
			return;
		}
		
		//Variables
		int MegaBytes = 0; //Almacenamiento megaBytes convertidos en kilobytes
		int remainder = 0; //restantes kiloBytes
				
		//C�lculos 1MB = 1024 KB
		MegaBytes = kilobytes / 1024; // Divisi�n
		remainder = kilobytes % 1024; // Restante en kiloBytes
		
		// Salida
		System.out.println(kilobytes + "KB = " + MegaBytes + "MB y " + remainder + "KB");
	
	}
}