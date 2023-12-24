
package graph_theory;

import java.util.*;
import java.io.*;

public class Sommet {
	Arraylist<String> Sommets;
/* Sommet(String[] Sommets){
	 for (int i =0;i<Sommets.length;i++) {
		 s
		this.Sommets[i] =Sommets[i]; 
		
	} */
	
 //}
	 public Sommet()
	{
		 this.Sommets=new Arraylist<String>();
	}	
	 
	 public  void aff_sommet(int size) {

		Scanner sc= new Scanner(System.in);
		for(int i=0;i<size;i++)
		{
			System.out.println("sommet"+(i+1));
			this.Sommets[i]= sc.next();
			
			
		}}
		public static void main(String[]args) {
			Scanner scanner= new Scanner(System.in);
			Sommet s=new Sommet();
		System.out.println("combien de sommets voulez vous saisir ");
		int sc=scanner.nextInt();
		s.aff_sommet(sc);
			
		}
	
}

