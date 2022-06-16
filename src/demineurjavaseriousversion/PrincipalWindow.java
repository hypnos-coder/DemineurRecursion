/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.Timer;

/**
 *
 * @author 
 * Didi Orlog SOSSOU
 * Edo Amen YAWOVI
 * Essowaza Samuel ATAKE
 */
public class PrincipalWindow extends JFrame{
    int x, y;
    String pseudo;
    static JLabel labelTimer;
     static Timer t;
     static int k = 0;
    
    public PrincipalWindow(int x, int y, String pseudo){
        this.pseudo = pseudo;
        this.x=x;
        this.y=y;
        setTitle("Jeu de Démineur");
        setSize(900, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // les boutons de fermetures de la fenêtre
        this.setLocationRelativeTo(null);
        JPanel container = new JPanel();
        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        container.setAlignmentX(CENTER_ALIGNMENT);
        this.add(container);
        
        GrilleObj objG = new GrilleObj(this.x, this.y, Color.blue);
        Grille g = new Grille(this.x, this.y, objG);
        System.out.println("Score: "+g.getScore());
        System.out.println("Le pseudo du joueur est: "+pseudo);
        
        JLabel label = new JLabel("Nom Joueur: "+this.getPseudo());
         
        label.setBounds(500, 50, 500, 25); //Dimensionnement
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18)); // Font du label
        add(label); //Ajout du label dans la fenêtre

        labelTimer = new JLabel("");
        labelTimer.setBounds(600, 50, 500, 25);
        labelTimer.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        add(labelTimer);
        
        JPanel top = new JPanel();
        top.add(label);
        top.add(labelTimer);
        container.add(top, BorderLayout.NORTH);
        this.setContentPane(container);
        
        
        this.add(g);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public String getPseudo(){
        return this.pseudo;
    }
    
    public void setPseudo(String pseudo){
        this.pseudo = pseudo;
    }
    
   
    public static void setTime(){
        t = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                labelTimer.setText("Temps: "+String.valueOf(k));
                k++;
            }
        });
        t.start();
    }
    
    
    
    
    
}
