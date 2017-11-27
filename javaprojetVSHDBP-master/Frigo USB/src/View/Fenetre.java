package View;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	private JButton plus = new JButton("Plus");
	private JButton moins = new JButton("Moins");
	public static JLabel ecran = new JLabel();

  public Fenetre(){
	
	this.setTitle("Pannel Frigo USB");
    this.setSize(500, 400);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);
    this.setResizable(false);
    this.setContentPane(new Panneau());
    
	this.getContentPane().add(plus);
	this.getContentPane().add(moins);
	this.add(ecran);
	
	
	//setLayout(null);
	
	ecran.setBounds(new Rectangle (new Point(50,250), ecran.getPreferredSize()));
	ecran.setOpaque(true);
	ecran.setSize(250,50);
  }
	 
  }
