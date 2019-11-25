package Skedare_RandomAccess;

public class Student {
private int NR_rendor;
private int note;

	public Student(int nR_rendor, int note) {

	this.NR_rendor = nR_rendor;
	this.note = note;
}

	public int getNR_rendor() {
	return NR_rendor;
}

public void setNR_rendor(int nR_rendor) {
	this.NR_rendor = nR_rendor;
}

public int getNote() {
	return note;
}

public void setNote(int note) {
	this.note = note;
}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}
