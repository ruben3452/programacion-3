/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package misAgentes;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
/**
 *
 * @author alucard
 */
public class MiAgenteCiclico extends Agent {
    @Override
    protected void setup(){
        System.out.println("hola");   
    MiComportamientoCiclico ciclico = new MiComportamientoCiclico();
    addBehaviour(ciclico);
    }
    protected void takeDawn(){
        System.out.println("adios");
    }  
    private class MiComportamientoCiclico extends CyclicBehaviour{

        @Override
        public void action() {
            System.out.println("q mas");  
        }
    
    }
    }
