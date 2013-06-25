package com.mkyong.action;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;


import com.mkyong.Limite;
import com.mkyong.Pena;
import com.opensymphony.xwork2.ActionSupport;

 
@SuppressWarnings({ "serial" })
public class Calculadora extends ActionSupport {
	  private InputStream inputStream;
	  public InputStream getInputStream() {
	    return inputStream;}
	private int a;
	private int m;
	private int d;
	private int a0;
	private int m0;
	private int d0;
	private String txtString;
	private List<Integer> listaCuantias= new ArrayList<Integer>(Arrays.asList(1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)); 
	
	public List<Integer> getListaCuantias() {
    return listaCuantias;
    }
	
	public void setListaCuantias(List<Integer> listaCuantias) {
		this.listaCuantias = listaCuantias;
	}
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getA0() {
		return a0;
	}

	public void setA0(int a0) {
		this.a0 = a0;
	}

	public int getM0() {
		return m0;
	}

	public void setM0(int m0) {
		this.m0 = m0;
	}

	public int getD0() {
		return d0;
	}

	public void setD0(int d0) {
		this.d0 = d0;
	}

	public void setTxtString(String txtString) {
		this.txtString = txtString;
	}

	public String getTxtString() {
		return txtString;
	}
	
	public String execute() throws IOException {
		Pena p =new Pena(new Limite(a,m,d), new Limite(a0,m0,d0));
		Pena p1= p.Rebajar();
		Pena p2= p1.Rebajar();
		Pena p3= p.Mitad1();
		Pena p4= p.Mitad2();
		Pena p5= p.Agravar();
		Pena p6= p5.Agravar();
		System.out.println(p.toString());
		inputStream = new ByteArrayInputStream (("<br>Pena inferior en dos grados: " + p2.toString()+ "<br>Pena inferior en un grado: " +p1.toString()+"<br><br>Mitad inferior de la pena: " +p3.toString()+"<br>Mitad superior de la pena: " +p4.toString()+"<br><br>Pena superior en un grado: " +p5.toString()+" <br>Pena superior en dos grados: " +p6.toString()).getBytes("UTF-8"));
			  return "SUCCESS";
 
	}


	

	
}