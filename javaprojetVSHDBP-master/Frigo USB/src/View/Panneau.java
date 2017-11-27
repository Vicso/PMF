package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.*;
import Model.*;
import javax.swing.JLabel;

public class Panneau extends JPanel {
	
	
  public void paintComponent(Graphics g){                
    Font font = new Font("Courier", Font.BOLD, 20);
    g.setFont(font);
    g.setColor(Color.black);
    g.drawString("Sample DHT22...", 0, 75);
    g.drawString("température  :  ", 0, 95); 
    g.drawString("humidité : ", 0, 115);
    g.drawString("Consigne : ", 0, 135);
      
  }               
}       