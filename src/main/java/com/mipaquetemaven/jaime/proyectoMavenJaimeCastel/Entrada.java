package com.mipaquetemaven.jaime.proyectoMavenJaimeCastel;
import java.util.Scanner;

public class Entrada {

		public static int leerEntero() {
			Scanner teclado=new Scanner(System.in);
			int x;
			x=teclado.nextInt();
			return x;
		}
		public static double leerDouble() {
			Scanner teclado=new Scanner(System.in);
			double x;
			x=teclado.nextDouble();
			return x;
		}
		public static String leerString() {
			Scanner teclado=new Scanner(System.in);
			String s;
			s=teclado.next();
			return s;
		}public static String leerFrase() {
			Scanner teclado=new Scanner(System.in);
			String s;
			s=teclado.nextLine();
			return s;
		}
		public static char leerCaracter() {
			Scanner teclado=new Scanner(System.in);
			String s;
			char c;
			s=teclado.next();
			c=s.charAt(0);
			return c;
		}

}
