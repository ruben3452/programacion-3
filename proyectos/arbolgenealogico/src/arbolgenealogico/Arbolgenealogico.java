/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arbolgenealogico;
import java.util.Hashtable;
import jpl.*;
import jpl.Query;
/**
 *
 * @author alucard
 */
public class Arbolgenealogico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     String s1 = "consult('arbolgenealogico.pl')";
        Query r1 = new Query(s1);
        System.out.println( s1 + " " + (r1.hasSolution() ? "correcto" : "fallo") );
    //--------------------**--------------------+++------------------------**----------
        
        String s2 = "abuelo(juan,raul)";
        Query r2 = new Query(s2);
        System.out.println( s2 + " es abuelo: " + (r2.hasSolution() ? "si" : "no ") );
   //----------------***---------------------+++-----------------------------**----------- 
        String s3 = "abuelo(andrea,dakota)";
        Query r3 = new Query(s3);
        System.out.println( s3 + " es abuelo: " + (r3.hasSolution() ? "si" : "no ") );
   //----------------***---------------------+++-----------------------------**-----------
        
        String s4 = "primo(daniel,camila)";
        Query r4 = new Query(s4);
        System.out.println( s4 + " es primo: " + (r4.hasSolution() ? "si" : "no ") );
        
   ///-----------------***--------------------+++-----------------------------**-------------     
        String s5 = "primo(daniel,miguel)";
        Query r5 = new Query(s5);
        System.out.println( s5 + " es primo: " + (r5.hasSolution() ? "si" : "no ") );
    
    
    }
    
}
