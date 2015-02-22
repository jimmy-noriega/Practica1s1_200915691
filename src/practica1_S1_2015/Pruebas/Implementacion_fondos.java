/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_S1_2015.Pruebas;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Implementacion_fondos extends javax.swing.JPanel {
    
    public Implementacion_fondos(){
    initComponents();
    }
    
    public void paintComponent(Graphics g){
        Dimension Tamaño= getSize();
        ImageIcon imagenfondo = new ImageIcon(getClass().getResource("imagenes/fondo de juego.png"));
        g.drawImage(imagenfondo.getImage(),0,0,Tamaño.width,Tamaño.height,null);
        setOpaque(false);
        super.paintComponent(g);
        
    }
    
    

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
    
}
