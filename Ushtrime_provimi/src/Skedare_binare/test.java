package Skedare_binare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	File f= new File("/home/xhesi/Desktop/person.dat");
	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
	Person p= new Person("xhesi",20);
	out.writeObject(p);
	out.close();
	
   ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
   Person p1= (Person)  in.readObject();
   System.out.println("Personi eshte: "+p1.getEmri()+" "+p1.getMosha());
   in.close();
}
}
