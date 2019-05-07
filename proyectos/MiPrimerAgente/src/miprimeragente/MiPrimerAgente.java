/*
 * Esta es pi primer angente y es una clase que hereda de jade.core.agent
 * sout - System.out.println("Hola mundo");
 */
package miprimeragente;

import jade.core.Agent;
import jade.core.behaviours.*;
/**
 *
 * @author alucard
 */
public class MiPrimerAgente extends Agent {

    class TareaSimple extends SimpleBehaviour {

        @Override
        public void action() {
            System.out.println("hola mundo ");
     for (int i = 0; i < 10; i++) {  
    System.out.println("contador:"+i);
}
        }

        
        
        @Override
        public boolean done() {
            return true;
        }
    }
    @Override
    public void setup() {
        System.out.println("Soy el agente " +getLocalName()+
                    "y tengo un comportamiento simple");
TareaSimple mitarea = new TareaSimple();
    addBehaviour(mitarea);
    }

}
