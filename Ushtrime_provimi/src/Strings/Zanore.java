package Strings;

import java.util.ArrayList;

public class Zanore {

public static void main(String [] args) {
	String s="Ky eshte nje string me zanore";
	ArrayList<Character> zanoret= new ArrayList<>();
	ArrayList<Integer> sasia= new ArrayList<>();
    ArrayList<Character> zan= new ArrayList<>();
    zan.add('a');
    zan.add('o');
    zan.add('u');
    zan.add('i');
    zan.add('e');
    zan.add('y');
	for(int i=0;i<s.length();i++)
	{
		if(zan.contains(s.charAt(i)))
			{
				if(zanoret.contains(s.charAt(i))) {
						int poz=zanoret.indexOf(s.charAt(i));
						sasia.add(poz,sasia.get(poz)+1);
				}
				else {
		
						zanoret.add(s.charAt(i));
						sasia.add(0);
				}
			}
	}
	for(int i=0;i<zanoret.size();i++) {
		System.out.println("Zanorja "+i+" eshte "+zanoret.get(i)+" perseritet "+sasia.get(i));
	}
}

}
