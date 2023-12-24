import java.io.IOException;

public class TaperTouche {
public static void LireClavier() {
	try{System.out.println("Taper une touche pour terminer le programme");
	System.in.read();}
	catch(IOException E) {
	System.out.println("Exception");}
}

}
