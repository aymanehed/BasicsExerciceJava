
public class Client {
	String Matricule,Nom,Prenom;

	public Client(String matricule, String nom, String prenom) {
		Matricule = matricule;
		Nom = nom;
		Prenom = prenom;
	}
	
public void setMatricule(String matricule) {
	Matricule = matricule;
}
public void setNom(String nom) {
	Nom = nom;
}
public void setPrenom(String prenom) {
	Prenom = prenom;
}


public String toString() {
	return "Client [Matricule=" + Matricule + ", Nom=" + Nom + ", Prenom=" + Prenom + "]";
}
}
