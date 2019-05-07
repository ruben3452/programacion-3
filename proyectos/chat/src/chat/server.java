
package chat;



import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.domain.AMSService;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.AMSAgentDescription;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.SearchConstraints;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.wrapper.PlatformController;

/**
 *
 * @author alucard
 */
public class server extends Agent {
    protected void setup(){
        
        try{
           
            DFAgentDescription dfd = new DFAgentDescription();
            dfd.setName(getAID());
           
            DFService.register(this, dfd);
            System.out.println(getLocalName()+" Agente registrado.");
            
        }catch(FIPAException e){
            e.printStackTrace();
        }
        
        Object[] arg2 = getArguments();
       
        for(int i=0;i<arg2.length;i++){
            registrarAgente((String)arg2[i]);
        }
        doWait(10000);
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.setContent("Bienvenid@");
        for(int i=0;i<arg2.length;i++){
            msg.addReceiver(new AID((String)arg2[i],AID.ISLOCALNAME));
        }

        send(msg);

        
    }
    protected void registrarAgente(String nameAgente){
        
        
        
        try{
            PlatformController container = getContainerController();
            container.createNewAgent(nameAgente, "chat.chatGUIAgent",null).start();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
       
    }
 
}