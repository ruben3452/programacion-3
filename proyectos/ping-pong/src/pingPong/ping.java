package pingPong;

import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.*;

public class ping extends Agent {

    class pingAgente extends SimpleBehaviour {

        boolean fin = false;

        @Override
        public void action() {
            System.out.println(getLocalName() + ": enviando mensaje a pong");
            AID id = new AID();
            id.setLocalName("pong");

            ACLMessage mensaje = new ACLMessage(ACLMessage.REQUEST);

            mensaje.setSender(getAID());
            mensaje.setLanguage("Español");
            mensaje.addReceiver(id);
            mensaje.setContent("Hola, que tal pong ?");

            send(mensaje);
            System.out.println(getLocalName() + ": Enviando mensaje a pong");
            System.out.println(mensaje.toString());
            //-------------------------------------------------------------------------
            ACLMessage mensaje2 = blockingReceive();
            if (mensaje2 != null) {
                System.out.println(getLocalName() + ": acaba de recibir el siguiente mensaje de pong: ");
                System.out.println(mensaje2.toString());

                System.out.println(getLocalName() + ": Enviando contestacion pong");
                ACLMessage respuesta = mensaje2.createReply();
                respuesta.setPerformative(ACLMessage.INFORM);
                respuesta.setContent("a que bueno  pong");
                send(respuesta);
                System.out.println(getLocalName() + ":enviando mensaje a pong");
                System.out.println(respuesta.toString());
                // ----------------------------------------------------------------------      
                ACLMessage mensaje3 = blockingReceive();
                if (mensaje3 != null) {
                    System.out.println(getLocalName() + ": acaba de recibir el siguiente mensaje de pong: ");

                    System.out.println(getLocalName() + ": Enviando contestacion pong");
                    ACLMessage respuesta3 = mensaje3.createReply();
                    respuesta.setPerformative(ACLMessage.INFORM);
                    respuesta.setContent("bien estaba muy fasil");
                    send(respuesta);
                    System.out.println(getLocalName() + ":enviando mensaje a pong");
                    System.out.println(respuesta.toString());
        // ----------------------------------------------------------------------            

                    fin = true;
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
        addBehaviour(new pingAgente());
    }
}




