/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_S1_2015;

/**
 *
 * @author Usuario
 */
public class Metodos_Cola {
    private Nodo sig,frente,ultimo;
            String Datos;
            
    Metodos_Cola(){
    frente=ultimo=null;
    Datos="";
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
        public void sacarnodo(){
        frente=frente.sig;
        }
        
    /**
     *
     */
    public  void imprimir(){
        Nodo aux=frente;
        String salir ="";
        while(aux!=null){
        salir+=aux.dato+"_____";  
        }
        System.out.println("Nodo: " +salir);
        }
}
        
    

    

