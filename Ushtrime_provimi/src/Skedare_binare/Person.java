package Skedare_binare;

import java.io.Serializable;

public class Person implements Serializable {
private String emri;
private int mosha;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getEmri() {
		return emri;
	}
	public void setEmri(String emri) {
		this.emri = emri;
	}
	public int getMosha() {
		return mosha;
	}
	public void setMosha(int mosha) {
		this.mosha = mosha;
	}
	public Person(String emri, int mosha) {
	
		this.emri = emri;
		this.mosha = mosha;
	}

}
