package Skedare;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//i ben reverse skedarit
public class Reverse {

	public static void main(String[] args) throws IOException {
		File inputFile= new File("/home/xhesi/Documents/prova");
		Scanner scan = new Scanner(inputFile);
		String teksti ="";

		while(scan.hasNextLine()) {
			String s= scan.nextLine();
			StringBuilder b= new StringBuilder(s);
			b.reverse();
			teksti+=b.toString()+"\n";
		}
		scan.close();
		FileWriter in=new FileWriter(inputFile);
		in.write(teksti);
		in.close();
	}

}
