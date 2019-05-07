package pingPong;

import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;

public class pong extends Agent {

    class pongAgente extends SimpleBehaviour {

        private boolean fin = false;

        @Override
        public void action() {
            System.out.println(" Preparandose para recibir");

            ACLMessage mensaje = receive();

            if (mensaje != null) {
                System.out.println(getLocalName() + ": acaba de recibir el siguiente mensaje de ping: ");
                System.out.println(mensaje.toString());

                ACLMessage respuesta = mensaje.createReply();
                respuesta.setPerformative(ACLMessage.INFORM);
                respuesta.setContent("estoy muy bien ping");
                send(respuesta);
                System.out.println(getLocalName() + ":enviando mensaje a ping");
                System.out.println(respuesta.toString());

                //--- le contesta a ping
                ACLMessage mensaje2 = blockingReceive();
                if (mensaje2 != null) {
                    System.out.println(getLocalName() + ": acaba de recibir el siguiente mensaje de ping: ");
                    System.out.println(mensaje2.toString());

                    ACLMessage respuesta2 = mensaje2.createReply();
                    respuesta.setPerformative(ACLMessage.INFORM);
                    respuesta.setContent("como te fue en el examen de programacion");
                    send(respuesta);
                    System.out.println(getLocalName() + ":enviando mensaje a ping");
                    System.out.println(respuesta.toString());
         //---------------------------------------------------------------------------  
                    //--- le contesta a ping
                    ACLMessage mensaje3 = blockingReceive();
                    if (mensaje3 != null) {
                        System.out.println(getLocalName() + ": acaba de recibir el siguiente mensaje de ping: ");
                        System.out.println(mensaje3.toString());

                        ACLMessage respuesta3 = mensaje3.createReply();
                        respuesta.setPerformative(ACLMessage.INFORM);
                        respuesta.setContent("que bueno , si estaba muy fasil ");
                        send(respuesta);
                        System.out.println(getLocalName() + ":enviando mensaje a ping");
                        System.out.println(respuesta.toString());
         //---------------------------------------------------------------------------

                        fin = true;
                    }
                }
            }
        }

        @Override
        public boolean done() {
            return fin;
        }
    }

    @Override
    protected void setup() {
        addBehaviour(new pongAgente());
    }
}
