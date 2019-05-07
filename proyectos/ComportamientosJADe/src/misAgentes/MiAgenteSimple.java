/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package misAgentes;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
/**
 *
 * @author alucard
 */
public class MiAgenteSimple extends Agent {
    @Override
    protected void setup(){
        System.out.println("hola");
        System.out.println("Añadiendo comportamiento");
        ComportamientoSimple micomportamiento =new ComportamientoSimple();
        addBehaviour(micomportamiento);
    }
    protected void takeDawn(){
        System.out.println("adios");
    }
    private class ComportamientoSimple extends Behaviour{
      public int etapa = 0;
      @Override
        public void action(){
                switch (etapa) {  //sw tab
                      case 0:
                          System.out.println("estoy en la etapa"+etapa);          
                          
                          etapa++;
                          break;
                                  case 1:
                          System.out.println("estoy en la etapa"+etapa);          
                          etapa++;
                          break;
                                
                                  case 2:
                          System.out.println("estoy en la etapa"+etapa);          
                          etapa++;
                          break;
                                
                    
                }
          
      }
      @Override
      public boolean done(){
          System.out.println("he terminado");
          return (etapa == 3);
    }
    }
    }

