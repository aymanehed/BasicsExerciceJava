package tp_forme;

import java.util.Scanner;

public class Stockage {
	int taille;
	private int  i;
	Forme_geometrique[] liste; 
	public Stockage(int taille) {
	this.taille=taille;
	this.liste =new Forme_geometrique[taille];
	this.i=0;
	}
	
		
	
	void ajouter (Forme_geometrique forme) {
		if(i<taille)
			{this.liste[i]=forme;
		i++;
		}
	}
	void afficherForme() {
		for( int j=0;j<taille;j++) {
	
		liste[j].afficher();
		}
	}

}
