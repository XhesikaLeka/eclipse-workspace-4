package Skedare;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Numerim_ne_Skedar {
   
   public static int findNRchar(String path) throws FileNotFoundException {

	   File inputFile = new File(path);
	   Scanner scan = new Scanner(inputFile);
	   int n=0;
	  while(scan.hasNext()) {
			   String s= scan.next();
			   n+=s.length();
		   }
	 scan.close();
	 return n;
}
   public static int findNRstring(String path) throws FileNotFoundException {

	   File inputFile = new File(path);
	   Scanner scan = new Scanner(inputFile);
	   int n=0;
	   while(scan.hasNext()) {
 String s= scan.next();
		   n++;
	   }
	   scan.close();
	return n;
  }
   public static int findNRlines(String path) throws FileNotFoundException {

 		File inputFile = new File(path);
 	   Scanner scan = new Scanner(inputFile);
 	   int n=0;
 	   while(scan.hasNextLine()) {
  String s= scan.nextLine();
 		   n++;
 	   }
 	   scan.close();
 	return n;
   }
  
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Jep path e skedarit");
		String path= scan.next();
		System.out.println("file ka "+findNRchar(path)+"char");
		System.out.println("file ka "+findNRstring(path)+"strings");

		System.out.println("file ka "+findNRlines(path)+"lines");
		
		
		

	}

}
