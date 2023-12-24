package tp_tableau;

public class TableauTrie {
int capacite,taille,increment;
Ordonnable []table;
public void inserer(Ordonnable o) {
	if(this.taille==this.capacite)
		this.capacite+=this.increment;
	Ordonnable[]Newtableau=new Ordonnable[capacite];
	for(int i=0;i<this.capacite;i++) {
		Newtableau[i]=table[i];
	}
	this.table=Newtableau;
	
}
public void supprimer(Ordonnable o) {
	
	if(this.taille==this.capacite-this.increment) this.capacite-=this.increment;
	Ordonnable[]Newtableau=new Ordonnable[capacite];
	for(int i=0;i<this.capacite;i++) {
		Newtableau[i]=table[i];
	}
	this.table=Newtableau;
}
}
