package com.mipaquetemaven.jaime.proyectoMavenJaimeCastel;

import java.util.ArrayList;

class CalculosMatematicos{
	
	public static boolean esPrimo() {
		int n=1;
		int resto=0;
		boolean resp = false;
		
		while(n<=100) {
			int div=1;
			int contD=0;
			
			while(div<=100) {
				resto=n%div;
				if(resto==0) {
					contD=contD+1;
				}
				div=div+1;
			}
			if(contD==2) {
				resp=true;
			}else {
				resp=false;
			}
			n=n+1;
		}
		return resp;
	}
	
	public static int potencia() {
		
		int resul=0;
		
		int p;
		System.out.println("Dime el numero al que quieres elevarlo");
		p=Entrada.leerEntero();
		
		int n;
		System.out.println("Introduce el número que va a ser elevado");
		n=Entrada.leerEntero();
		
		if(p>0) {
			resul=n^p;
		}
		return resul;
	}
	
	public static int factorial(int n) {
		int fact=1;
		int cont=1;
		System.out.println("Dime el número para el factorial");
		n=Entrada.leerEntero();
		
		while(cont<=n) {
			fact=fact*cont;
			cont=cont+1;
		}
		return fact;
	}

	public static ArrayList<Integer> listaDePrimosHasta(int numero){
		ArrayList<Integer> listaDePrimos = new ArrayList<Integer>();
			listaDePrimos.add(1);
			listaDePrimos.add(2);
			listaDePrimos.add(3);
			for(int i=5; i<=numero; i+=2) {
				if(esPrimo())
					listaDePrimos.add(i);
				}		
				return listaDePrimos;		
			}


}


