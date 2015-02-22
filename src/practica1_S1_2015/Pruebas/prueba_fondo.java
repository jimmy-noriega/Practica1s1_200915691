/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_S1_2015.Pruebas;

import practica1_S1_2015.Pruebas.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class prueba_fondo  extends JFrame{
    
    
       public static void main(String args[]) {
         prueba_fondo f = new prueba_fondo();
         f.setSize(500, 400);
         f.setVisible(true);
         Panel p= new Panel("/imagenes/fondo.jpg");
         f.add(p);                      
        };
    
}
