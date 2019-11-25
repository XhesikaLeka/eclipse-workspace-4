package Perjashtimet;

public class Divide {
private int nr;

	public Divide(int nr) {
		this.nr=nr;
		// TODO Auto-generated constructor stub
	}
public int divide(int divider) {
	if(divider==0)
	{
		DivideByZeroExcetion e= new DivideByZeroExcetion("snuk o plak");
		throw e;
	}
	return this.nr/divider;
}
public static void main(String [] args) {

	Divide d= new Divide(10);
	try {
		System.out.println(d.divide(2));
	}
	catch(DivideByZeroExcetion e) {
		System.out.println(e.getMessage());
		
	}
}
}
