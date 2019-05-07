/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consultadepais;
/*
*/
import java.util.Hashtable;
import jpl.*;
import jpl.Query;

/**
 *
 * @author Dahiana
 */
public class ConsultaDePais {    
    public static void main(String[] args) {
        /*En este string guardamos el nombre del archivo
        */  /*      
        String ConsultarPaises = "consult('pais.pl')";
        
        
        Query X1=new Query(ConsultarPaises);
        System.out.println(ConsultarPaises+" "+ (X1.hasSolution() ? "Si se encontro el archivo":"No se ha encontrado el archivo"));
        
         //estas dos variables guardamos el contenido de las paises y 
        String XX = "'Mali'";
        String YY = "Y";
        //En este string guardamos la variable para consultar desde prolog//
        String Consulta = "limitrofes(Nigeria,Cameroun), write (Y),nl,fail. ";
        
        Query X2=new Query(Consulta);
        System.out.println("la solucion para la"+Consulta+"\n de los paises que estan alrededor"+XX+"Son: \n");
        
        while(X2.hasMoreSolutions()) {
    java.util.Hashtable X3 = X2.nextSolution();
            System.out.println(X3);
        } */   
        
        String x1 = "consult('pais.pl')";
        Query y1 = new Query(x1);
        System.out.println( x1 + " " + (y1.hasSolution() ? "correcto" : "fallo") );
        
            String x2 = "limitrofes(Nigeria,Cameroun)";
        Query y2 = new Query(x2);
        System.out.println( x2 + " es limitrofe: " + (y2.hasSolution() ? "si" : "no ") );
   
    while(y2.hasMoreSolutions()) {
    java.util.Hashtable X3 = y2.nextSolution();
            System.out.println(X3);
        } 
    }
        
                
    }
    
