package com.mkyong;

public class Limite {
	int a, m,d;
	float valor;
	Limite(float valor){this.valor=valor;a=(int)(valor/360);m=(int)(valor/30-12*((int)(valor/360)));d=(int)valor%30;}
	public Limite (int a, int m, int d) {this.a=a;this.m=m;this.d=d;valor=a*360+m*30+d;}
	Limite Agravar(){return new Limite(valor*3/2);}
	Limite Rebajar(){return new Limite(valor*1/2);}
	public String toString(){
	
		String as="años",ms="meses",ds="días";
		if (a==1){ as="año";}
		if (m==1){ms="mes";}
		if (d==1){ds="día";}
		
		int count = 0;
		if (a==0&&m==0){count++;return d+" "+ds;}
		else if (a==0&&d==0){count++;return m+" "+ms;}
		else if (m==0&&d==0){count++;return a +" "+as;}

		else if (a==0&&m!=0&&count==0){return m +" "+ms+" y "+d+" "+ds;}
		else if (m==0&&a!=0&&count==0){return a +" "+as+" y "+m+" "+ms;}
		else if (m==0&&a!=0&&count==0){return a +" "+as+" y "+d+" "+ds;}
		
		else {return a +" "+as+ ", "+ m+" "+ms+ " y "+ d +" "+ds;}
		}
}
