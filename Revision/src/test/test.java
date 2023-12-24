package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in).useDelimiter("|(-1)");
 int e;
 System.out.println("entrez des entiers");
 e=sc.nextInt();
 int tab[ ] = new int[10] ;
 int i=0;
 while(sc.hasNext())
 {
	 tab[i]=e;
	 e=sc.nextInt();
 System.out.println(e);
 i++;}
 for(int j=0;j<tab.length;j++)
	 System.out.println(tab[j]);
	}

}
