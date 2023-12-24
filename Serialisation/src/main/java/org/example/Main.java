package org.example;

import jakarta.xml.bind.JAXB;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.sql.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext=JAXBContext.newInstance(Banque.class);
        Banque banque=new Banque();
        banque.Comptes.add(new Compte(1,67008, new Date(0),TypeCompte.COURANT));
        banque.Comptes.add(new Compte(2,56908, new Date(0),TypeCompte.EPARGNE));
        banque.Comptes.add(new Compte(3,49768, new Date(0),TypeCompte.COURANT));
        Marshaller marshaller=jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(banque,new File("comptes.xml"));


    }
}