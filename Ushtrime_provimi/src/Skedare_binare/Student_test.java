package Skedare_binare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Student_test {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		File f= new File("/home/xhesi/Desktop/student.bin");
		ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(f));
		//ObjectInputStream in= new ObjectInputStream(new FileInputStream(f));
		Student s= new Student("xhesi","leka",10);
		out.writeObject(s);
		out.close();
		ObjectInputStream in= new ObjectInputStream(new FileInputStream(f));
		Student s1= (Student) in.readObject();
		System.out.println(s1.getEmri()+" "+s1.getMbiemri()+" "+s1.getMesatare());
		in.close();
	}

}
