package Perjashtimet;
//Ndërtoni një program CountLetters që afishon numrin e shkronjave të një stringu derisa të
//kapet një karakter që nuk është shkronjë. Sa herë që identifikohet një karakter që nuk është
//shkronjë të hidhet një përjashtim NotALetterException me një mesazh të përshtatshëm për
//përdoruesin. Ky mesazh duhet të afishohet nëse ndodh përjashtimi.
public class Perjashtim_numer_string {

	

	public static void main(String[] args){
		String test="ss7v8z99";
		int nr=0;
     for(int i=0;i<test.length();i++) {
			    try {
			    		if( !Character.isLetter(test.charAt(i))) {
			    			NotALetterException e = new NotALetterException("Eshte numer");
			    			throw e;
			        	}
			    		nr++;
			     }
			    catch(NotALetterException ex) {
			   	 System.out.println("The exception is  "+ex.getMessage());
			    }
     }
     
 	System.out.print(nr);
	}

}