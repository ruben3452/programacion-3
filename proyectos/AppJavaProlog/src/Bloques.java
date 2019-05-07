/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Hashtable;
import jpl.*;
import jpl.Query;
/**
 *
 * @author Administrador
 */
public class Bloques {
        public static void main( String argv[] )
        {
        String t1 = "consult('bloques.pl')";
        Query q1 = new Query(t1);
        System.out.println( t1 + " " + (q1.hasSolution() ? "correcto" : "fallo") );
        String t2 = "encima_de(a,b)";
        Query q2 = new Query(t2);
        System.out.println( t2 + " is " + (q2.hasSolution() ? "probado" : "no probado") );
        String t4 = "mas_arriba_de(X,Y)";
        Query q4 = new Query(t4);
        System.out.println( "Solucion para t4 " + t4 );
        while ( q4.hasMoreSolutions() ){
        java.util.Hashtable s4= q4.nextSolution();
        System.out.println( "X = " + s4.get("X") + ", Y = " + s4.get("Y"));
        }
        }
 }
