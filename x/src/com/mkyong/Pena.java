package com.mkyong;

 
public class Pena {
Limite inicio, termino;
public Pena(Limite inicio, Limite termino){this.inicio=inicio;this.termino=termino;}
public Pena Agravar(){return new Pena(termino, termino.Agravar());}
public Pena Rebajar(){return new Pena(inicio.Rebajar(), inicio);}
public Pena Mitad1(){return new Pena(inicio, new Limite(((termino.valor-inicio.valor)/2)+inicio.valor));}
public Pena Mitad2(){return new Pena(new Limite(termino.valor-(termino.valor-inicio.valor)/2) , termino);}


public String toString(){return "De " + inicio.toString() + " a " + termino.toString() + ". \n" ;
}	
}