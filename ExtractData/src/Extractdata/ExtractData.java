package Extractdata;
import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
	import java.util.List;
	import org.jsoup.Jsoup;
	import org.jsoup.nodes.Document;
	import org.jsoup.nodes.Element;
	import org.jsoup.select.Elements;
public class ExtractData {

	    public static void main(String[] args) {
	        // URL du site à extraire les annonces
	        String url = "https://www.jumia.ma/fashion-mode/?sort=popularity&tag=COL_321";

	        // Connection à la base de données
        Connection conn = null;
	        try {
	        	  Class.forName("com.mysql.cj.jdbc.Driver");
	        	    
	        	   conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/extractdata","root","");  

	        } catch (ClassNotFoundException e) {
	            System.out.println("Erreur: Classe JDBC introuvable.");
	            e.printStackTrace();
	            return;
	        } catch (SQLException e) {
	            System.out.println("Erreur: Impossible de se connecter à la base de données.");

	            e.printStackTrace();
	            return;
	        }

	        // Liste pour stocker les annonces
	        List<Product> Products = new ArrayList<>();
	        

	        try {
	            // Extraction des annonces avec JSoup
	            Document doc = Jsoup.connect(url).get();
	            Elements ProdElements = doc.select("a.core");

	            // Parcours des annonces et stockage dans la liste
	            for (Element Prodelement : ProdElements) {
	            	String title =  Prodelement.select("h3.name").text();
//System.out.println(Prodelement);
//            System.out.println(Prodelement);
	                String Price =  Prodelement.select("div.prc").text();
//	                System.out.println(CurrentPrice);
//	                String OldPrice =  Prodelement.select("div.old").text();
////	                System.out.println(OldPrice);
	                Product Prod = new Product(title, Price);
	                Products.add(Prod);
	            }
//Products.clear();
	            // Stockage des annonces dans la base de données
	            String sql = "INSERT INTO Product (title,Price) VALUES (?, ?)";
	            PreparedStatement pstmt = conn.prepareStatement(sql);
	            for (Product Prod :Products ) {
	                pstmt.setString(1, Prod.getTitle());
	                pstmt.setString(2, Prod.getPrice());
	                pstmt.executeUpdate();
	            }

	        } catch (IOException ex) {
	            System.out.println("Erreur: Impossible de récupérer les annonces.");
	            ex.printStackTrace();    return;}
        
	         catch (SQLException e) {
	            System.out.println("Erreur: Impossible de stocker les annonces dans la base de données.");
	            e.printStackTrace();
	            return;
	        } finally {
	            // Fermeture de la connexion à la base de données
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException e) {
                System.out.println("Erreur: Impossible de fermer la connexion à la base de données.");
	                e.printStackTrace();
	            }
	        }

	        // Analyse des résultats
	        System.out.println("Nombre d'annonces extraites : " + Products.size());

	        // Ecriture des annonces dans un fichier texte
	        String content = "";
	        for (Product Prod :Products) {
	            content +="||Title||\t"+ Prod.getTitle() + " \n ||Price|| " + Prod.getPrice()+ "\n";
	        }
	        File file = new File("product.txt");
	        try {
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            FileWriter fw = new FileWriter(file.getAbsoluteFile());
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write(content);
	            bw.close();
	            System.out.println("Les annonces ont été écrites dans le fichier avec succès.");
	        }catch (IOException exp) {
	    System.out.println("Erreur: Impossible d'écrire les annonces dans le fichier.");
	    exp.printStackTrace();
	    }


	    }
}

