package treeMap_EX;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapStudent {
public static void main(String [] args) {
	Map<String,Integer> m= new TreeMap<String,Integer>();
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<2;i++) {
		String emri=scan.next();
		int nota= scan.nextInt();
		m.put(emri, nota);
	}
	System.out.println("jep emrin dhe noten");
	String emri=scan.next();
	int nota= scan.nextInt();
	m.put(emri, nota);
	System.out.println("lista e re");
	for(Map.Entry<String, Integer> entry: m.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue().toString());
	}
	
}

}
