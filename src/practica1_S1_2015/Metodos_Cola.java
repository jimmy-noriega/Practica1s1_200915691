/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_S1_2015;

import javax.swing.JButton;

/**
 *
 * @author Usuario
 */
public class Metodos_Cola {
    private Nodo sig,frente,ultimo;
    private NodoBoton sig1,frente1,ultimo1; 
            String Datos;
            JButton Boton;
            
    Metodos_Cola(){
    frente=ultimo=null;
    Datos="";
    JButton Boton = new JButton();
    }
   
    
    public void insertarnodo(String x){
        Nodo nuevo;
        if(frente==null){
           nuevo = new Nodo(x,null);
           frente=ultimo=nuevo;      
        }
        else{
             nuevo = new Nodo(x,null);
             ultimo.sig=null;
             ultimo=nuevo;
        }
    
    }
    
    public void insertarnodoboton(JButton x){
        NodoBoton nuevo;
        if(frente1==null){
           nuevo = new NodoBoton(x,null);
           frente1=ultimo1=nuevo;      
        }
        else{
             nuevo = new NodoBoton(x,null);
             ultimo1.sig=null;
             ultimo1=nuevo;
        }
    
    }
    
    
    
        public void sacarnodo(){
        frente=frente.sig;
        }
        
        /*public void sacarnodoboton(){
        frente1=frente1.sig1;
        }*/
        
    /**
     *
     */
    public  void imprimir(){
        Nodo aux=frente;
        String salir ="";
        while(aux!=null){ 
        salir= salir +aux.dato +"->"; 
        aux=aux.sig;
        }
        System.out.println(salir);
   }
}
        
    

    

