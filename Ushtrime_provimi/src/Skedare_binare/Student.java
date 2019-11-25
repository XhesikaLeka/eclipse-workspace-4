package Skedare_binare;

import java.io.Serializable;

public class Student implements Serializable{
	private String emri;
	private String mbiemri;
	private int mesatare;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public String getMbiemri() {
		return mbiemri;
	}

	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}

	public int getMesatare() {
		return mesatare;
	}

	public void setMesatare(int mesatare) {
		this.mesatare = mesatare;
	}

	public Student(String emri, String mbiemri, int mesatare) {
		super();
		this.emri = emri;
		this.mbiemri = mbiemri;
		this.mesatare = mesatare;
	}
	

}
