package org.example;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
@XmlRootElement
public class Banque {
    public List<Compte>Comptes=new ArrayList<Compte>();
}
