/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @authors
 * Didi Orlog SOSSOU
 * Edo Amen YAWOVI
 * Essowaza Samuel ATAKE
 */
public class Level extends JFrame{
    JLabel mainLabel;
    JButton level1, level2, level3;
    JPanel levelPane;
    String pseudo;
    
    public Level(String pseudo){
        this.pseudo = pseudo;
        setTitle("Level");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 950, 450);
        setResizable(false);
        levelPane = new JPanel();
        levelPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(levelPane);
        levelPane.setLayout(null);
        
        mainLabel = new JLabel("Choisissez le niveau de difficulté");
        mainLabel.setForeground(Color.black);
        mainLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        mainLabel.setBounds(350, 10, 325, 93);
        levelPane.add(mainLabel);
        
        level1 = new JButton("Facile");
        level1.setForeground(Color.blue);
        level1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        level1.setBounds(350, 90, 250, 60);
        level1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent arg0) {
                PrincipalWindow pw = new PrincipalWindow(4, 4, pseudo);
                pw.setPseudo(getPseudo());
                System.out.println(pw.getPseudo());
                setVisible(false);
                pw.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        level2 = new JButton("Moyen");
        level2.setForeground(Color.black);
        level2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        level2.setBounds(350, 165, 250, 60);
        level2.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent arg0) {
                PrincipalWindow pw = new PrincipalWindow(12, 12, pseudo);
                pw.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        level3 = new JButton("Avancé");
        level3.setForeground(Color.green);
        level3.setFont(new Font("Times New Roman", Font.BOLD, 30));
        level3.setBounds(350, 240, 250, 60);
        level3.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent arg0) {
                PrincipalWindow pw = new PrincipalWindow(18, 18, pseudo);
                pw.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        levelPane.add(level1);
        levelPane.add(level2);
        levelPane.add(level3);
        
        
        
        
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    
}
