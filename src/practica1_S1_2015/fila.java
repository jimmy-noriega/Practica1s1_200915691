/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_S1_2015;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class fila {
   private ArrayList<String> pila = new ArrayList();
    
    public void insertar(String x){
    pila.add(x);
    
    }
    
    public String eliminar(){
        
        if(!(pila.isEmpty())){
        String aux = pila.get(pila.size()-1);
        pila.remove(pila.size()-1);
        return aux;
        
        }else{
        return null;
        }   
    }

    
    
    public void borrar_fichero(String ruta){
    try{
      File fichero = new File(ruta);
    fichero.delete();
    }catch (Exception e){
    System.out.println(e);
    }
  
    
    }
    public void creararchivo(String path, String contenido){
            try
           {
           //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
           File archivo=new File(path);

           //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
           FileWriter escribir=new FileWriter(archivo,true);

           //Escribimos en el archivo con el metodo write 
           escribir.write(contenido);

           //Cerramos la conexion
           escribir.close();
           }

           //Si existe un problema al escribir cae aqui
           catch(Exception e)
           {
           System.out.println("Error al escribir");
           }
           }
    
    public void crearjpg(String fileInputPath, String fileOutputPath){
    
    try {
      
      String dotPath = "C:\\Program Files (x86)\\Graphviz2.30\\bin\\dot.exe";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }
    
    }


    
    
        public String imprimirfila(){
        int size =pila.size();
        String salir="";
        for(int x=0;x<pila.size();x++) {
           if (x==(pila.size()-1)){
            salir+=pila.get(x);
           }else{
               salir+=pila.get(x)+"  ->  ";
           }
            
            } 
        
            return salir;
    }  
}
