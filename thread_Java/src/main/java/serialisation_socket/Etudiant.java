package serialisation_socket;

import java.io.Serializable;

public class Etudiant implements Serializable {
    private String Nom;
    private String Prenom;
    private String Groupe;

    public Etudiant(String nom, String prenom, String groupe) {
        Nom = nom;
        Prenom = prenom;
        Groupe = groupe;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getGroupe() {
        return Groupe;
    }

    public void setGroupe(String groupe) {
        Groupe = groupe;
    }
}
