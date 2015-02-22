package practica1_S1_2015.Pruebas;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.Border;

public class Panel  extends JPanel {
    ImageIcon imagen;
    String ruta;
    
    public Panel (String ruta){
    this.ruta = ruta;
    }
            
    public void paint(Graphics g){
        Dimension tamanio = getSize();
        imagen = new ImageIcon(getClass().getResource(ruta));
        g.drawImage(imagen.getImage(), 0, 0,tamanio.width,tamanio.height, null);
        super.paint(g);
        
    }

    
    

}
