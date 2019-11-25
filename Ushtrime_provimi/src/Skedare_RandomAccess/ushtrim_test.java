package Skedare_RandomAccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ushtrim_test {

	public ushtrim_test() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String [] args) throws IOException {
		RandomAccessFile f;
		f = new RandomAccessFile("/home/xhesi/Desktop/rnd.dat","rw");
		int a=2;
		f.writeInt(a);
		f.seek(0);
		System.out.println(f.readInt());
		
	}

	
	
}
