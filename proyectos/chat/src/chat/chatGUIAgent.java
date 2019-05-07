
package chat;

import jade.core.AID;
import jade.core.behaviours.CyclicBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.MessageTemplate;
import jade.tools.sniffer.Message;

import javax.swing.UIManager;
import java.awt.*;
import java.util.Iterator;
import javax.swing.JList;

public class chatGUIAgent extends GuiAgent {
    private chatGUI vChat;
    private String servicio;
    private String chatters;
    
    @Override
    public void setup(){
       registrarServicio();
       //buscarServicio();
       
       CyclicBehaviour cicleBehaviour = new TalkBehaviour(this); 
       CyclicBehaviour actualizarListaNicksBehaviour = new actualizarLista(this);
       addBehaviour(actualizarListaNicksBehaviour);
       addBehaviour(cicleBehaviour);
       
       
       
       vChat = new chatGUI(this);
       
       
       
       vChat.setVisible(true);
       vChat.setTitle("Nombre Agente: "+getLocalName());
       vChat.setResizable(false);
       
    }
    public void registrarServicio(){
    // Descripción del agente
        DFAgentDescription descripcion = new DFAgentDescription();
        descripcion.setName(getAID());
        descripcion.addLanguages("Castellano");
 
    // Descripcion de un servicio se proporciona
        ServiceDescription servicio = new ServiceDescription();
        servicio.setType("chatter");
        servicio.setName("chatter");
 
    // Añade dicho servicio a la lista de servicios de la descripción del agente
        descripcion.addServices(servicio);
 
        try{
            DFService.register(this, descripcion);
        }
        catch (FIPAException e){
            e.printStackTrace();
        }
    
    }
    
    protected void takeDown(){   
        try
        {
            DFService.deregister(this);
        }
        catch (FIPAException fe)
        {
            fe.printStackTrace();
        }
        System.out.println("El agente "+getAID().getName()+" ya no ofrece sus servicios.");
    }
    
    public void buscarServicio(){
        ServiceDescription servicio = new ServiceDescription();
        servicio.setType("chatter");
 
        // Plantilla de descripción que busca el agente
        DFAgentDescription descripcion = new DFAgentDescription();
        descripcion.addLanguages("Castellano");
 
       
        descripcion.addServices(servicio);
        try{
        
            DFAgentDescription[] resultados = DFService.search(this,descripcion);
 
            
            chatters="::::::::::::LISTA:::::::::::";
           
            for (int i = 0; i < resultados.length; ++i){
                
                chatters += "\n"+resultados[i].getName().getLocalName();
                
            }
            
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    
    }
    
    
    class TalkBehaviour extends CyclicBehaviour{
        public TalkBehaviour(GuiAgent ga){
            super(ga);
        }
        @Override
        public void action(){
            
            ACLMessage reply = receive(MessageTemplate.MatchPerformative(ACLMessage.INFORM));
            if(reply!=null){
                String content = reply.getContent();
                String sender = reply.getSender().getLocalName();
                vChat.textoChat.append("<"+sender+">: "+content+"\n");
            }else{
                block();
            }
        }
    }
    
    class actualizarLista extends CyclicBehaviour{
        public actualizarLista(GuiAgent ga){
            super(ga);
        }
        @Override
        public void action(){
            doWait(2000);
            buscarServicio();
            vChat.listaNicks.setText(chatters);
        }
    }
    
    @Override
    public void onGuiEvent(GuiEvent ge){
        String receiverName = (String) ge.getParameter(0);
        String msgContent   = (String) ge.getParameter(1);
        ACLMessage toSend   = new ACLMessage(ACLMessage.INFORM);
        toSend.setContent(msgContent);
        toSend.setPerformative(ACLMessage.INFORM);
        toSend.addReceiver(new AID(receiverName,AID.ISLOCALNAME));
        send(toSend);
    }
}
