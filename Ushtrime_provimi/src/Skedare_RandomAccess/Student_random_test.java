package Skedare_RandomAccess;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Student_random_test {
	

public static void main(String[] args) throws IOException {
	RandomAccessFile f = new RandomAccessFile("/home/xhesi/Desktop/std.dat","rw");
	int RECORD_SIZE=8;
	for(int i=0;i<4;i++) {
		Student s= new Student(i,i+2);
		f.writeInt(s.getNR_rendor());
		f.writeInt(s.getNote());
	}
	int size=(int) f.length()/RECORD_SIZE;
	for(int i=0;i<size;i++) {
			f.seek(i*RECORD_SIZE);
			int nr= f.readInt();
			int nota=f.readInt();
			Student s1= new Student(nr,nota);
			System.out.println(s1.getNR_rendor()+" "+s1.getNote());
	}
	f.seek(RECORD_SIZE*1+4);
	f.writeInt(4);
	System.out.println("Te dhenat pas ndryshimit te notes se studentit te dyte");
	for(int i=0;i<size;i++) {
		f.seek(i*RECORD_SIZE);
		int nr= f.readInt();
		int nota=f.readInt();
		Student s1= new Student(nr,nota);
		System.out.println(s1.getNR_rendor()+" "+s1.getNote());
}
}

}
