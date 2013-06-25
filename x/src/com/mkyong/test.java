package com.mkyong;

import java.util.Scanner;
class test {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);	
		System.out.println("Introduzca número de años:");
		while (!teclado.hasNextInt()) {System.out.println("Introduzca número de años:");
		teclado.nextLine();} int a = teclado.nextInt();	
		System.out.println("Introduzca número de meses:");
		while (!teclado.hasNextInt()) {System.out.println("Introduzca número de meses:");
		teclado.nextLine();}  int m = teclado.nextInt();		 
		System.out.println("Introduzca número de días:");
		while (!teclado.hasNextInt()) {System.out.println("Introduzca número de días:");
		teclado.nextLine();}  int d = teclado.nextInt();
		System.out.println("Introduzca número de años:");
		while (!teclado.hasNextInt()) {System.out.println("Introduzca número de años:");
		teclado.nextLine();} int a1 = teclado.nextInt();	
		System.out.println("Introduzca número de meses:");
		while (!teclado.hasNextInt()) {System.out.println("Introduzca número de meses:");
		teclado.nextLine();}  int m1 = teclado.nextInt();		 
		System.out.println("Introduzca número de días:");
		while (!teclado.hasNextInt()) {System.out.println("Introduzca número de días:");
		teclado.nextLine();}  int d1 = teclado.nextInt();
		Pena p =new Pena(new Limite(a,m,d), new Limite(a1,m1,d1));
		p.Agravar();
		Pena p2 =new Pena(new Limite(a,m,d), new Limite(a1,m1,d1));
		p2.Rebajar();System.out.println(p2.toString());p2.Rebajar();System.out.println(p2.toString());p2.Rebajar();System.out.println(p2.toString());p2.Rebajar();System.out.println(p2.toString());


		
	}

}
