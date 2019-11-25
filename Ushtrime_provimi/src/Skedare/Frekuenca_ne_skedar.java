package Skedare;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Frekuenca_ne_skedar {

	public static void func_vec() throws FileNotFoundException {
		File inf= new File("/home/xhesi/Desktop/input.txt");
		File outf= new File("/home/xhesi/Desktop/output.txt");
		Scanner scan = new Scanner(inf);
		PrintWriter out= new PrintWriter(outf);
		ArrayList<String> fjalet= new ArrayList<>();
		ArrayList<Integer> frekuenca= new ArrayList<>();
		while(scan.hasNext()) {
			String s=scan.next();
			if(fjalet.contains(s)){
				int pos=fjalet.indexOf(s);
				frekuenca.set(pos,frekuenca.get(pos)+1);
			}
			else{
				fjalet.add(s);
				frekuenca.add(1);
			}
		}
		String tmp,tmp2;
		for(int i=0;i<frekuenca.size();i++) {
			for(int j=0;j<frekuenca.size();j++) {
				if(frekuenca.get(i)<frekuenca.get(j)) {
				tmp=fjalet.get(j);
				tmp2=fjalet.get(i);
				fjalet.set(j, tmp2);
				fjalet.set(i, tmp);
				}
			}
		}
		for(int i=0;i<fjalet.size();i++)
		{
			out.println(fjalet.get(i));
			System.out.println(fjalet.get(i));
			System.out.println(frekuenca.get(i));
		}
		scan.close();
		out.close();
	}

	public static void main(String[] args) {
		try {
			func_vec();
		}
     catch(FileNotFoundException e){
    	 System.out.print(e.getMessage());
     }
	}

}
