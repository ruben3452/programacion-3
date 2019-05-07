/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package progenitor;
import java.util.Hashtable;
import jpl.*;
import jpl.Query;
/**
 *
 * @author orihime
 */
public class Progenitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //estas 3 primeras lineas consultan el archivo de prolog
        String t1 = "consult('progenitor.pl')";
        Query q1 = new Query(t1);
        System.out.println( t1 + " " + (q1.hasSolution() ? "correcto" : "fallo") );
    //----------------------------------------------------------------------------------
        //aca manda las dos variables y analisa con prolog
        String t2 = "abuelo(leo,raul)";
        Query q2 = new Query(t2);
        System.out.println( t2 + " es abuelo: " + (q2.hasSolution() ? "si" : "no ") );
   //------------------------------------------------------------------------------------- 
        String t3 = "abuelo(ana,luis)";
        Query q3 = new Query(t3);
        System.out.println( t3 + " es abuelo: " + (q3.hasSolution() ? "si" : "no ") );
   //-------------------------------------------------------------------------------------
        
        String t4 = "primo(daniel,raul)";
        Query q4 = new Query(t4);
        System.out.println( t4 + " es primo: " + (q4.hasSolution() ? "si" : "no ") );
    }
    
}
