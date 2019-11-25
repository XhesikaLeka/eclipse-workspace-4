package teza_2018;
//2. (10 pikë)Shkruani një metodë merrAkronim e cila kthen akronimin e një Stringu që e merr si parametër.
//Për këtë do të përdoret karakteri # dhe jo hapësira duke supozuar që nuk do të ketë hapësira në String. Një
//akronim përbëhet nga shkronja e parë e inputit String jo # dhe nga të gjithë karakteret jo thurrje që ndjekin
//karakterin #. Për shembull metoda merrAkronim(“Not#a##Number”) do të kthejë NaN.
public class Ushtrimi2_akronim {
	
	
public static String merrAkronim(String str) {

	String strArray[] = str.split("#");
	String result="";
	
	for(int i=0;i<strArray.length;i++) {
	
		
		result=result+ Character.toString(strArray[i].charAt(0))+" ";
		
	}
	return result;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(merrAkronim("Not#a##Number"));

	}

}
