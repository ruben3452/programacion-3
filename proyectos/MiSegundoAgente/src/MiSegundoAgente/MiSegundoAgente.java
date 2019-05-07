/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MiSegundoAgente;
import jade.core.Agent;
import jade.core.behaviours.*;
/**
 *
 * @author alucard
 */
public class MiSegundoAgente extends Agent {

   
private class MostrarHojaDeVida extends SimpleBehaviour{

 @Override
 public void action(){
     System.out.println("Soy el agente: " +getLocalName());
     System.out.println("Mi nombre completo es" +getLocalName());
     System.out.println("Mi agente ID"+getAID());
     System.out.println("mi estado actual es"+getAgentState());
     System.out.println("El ID de mi AMS es"+getAMS());


}

        @Override
        public boolean done() {
            return true;
        }
    
}
@Override
protected void setup(){
    MostrarHojaDeVida ciclodevida = new MostrarHojaDeVida();
    addBehaviour(ciclodevida);
    //this.doWake();
    //this.doSuspend();
    this.doDelete();
    //this.doWait(10000);
    System.out.println("Mi estado actual es:"+getAgentState());
}
@Override
protected void takeDown(){
    System.out.println("Hasta luego");   
}
}
