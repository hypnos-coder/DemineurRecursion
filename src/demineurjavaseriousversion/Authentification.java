/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @authors
 * Didi Orlog SOSSOU
 * Edo Amen YAWOVI
 * Essowaza Samuel ATAKE
 */
public class Authentification extends JFrame{
    JoueurDAO joueurDao;
    
    private JLabel topLabel;
    private JPanel contentPane;
    private JTextField pseudo;
    private JTextField password;
    private JButton bouton;
    
    public Authentification(){
        setTitle("Authentifiez-vous");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 950, 450);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        topLabel = new JLabel("Autentification : Démineur");
        topLabel.setForeground(Color.BLACK);
        topLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        topLabel.setBounds(350, 10, 325, 93);
        contentPane.add(topLabel);
        
        JLabel pLabel = new JLabel("Votre pseudo");
        pLabel.setForeground(Color.BLACK);
        pLabel.setFont(new Font("Times New Roman", Font.ITALIC,30));
        pLabel.setBounds(350, 50, 325, 93);
        contentPane.add(pLabel);
        
        pseudo = new JTextField();
        pseudo.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        pseudo.setBounds(350, 110, 325, 60);
        pseudo.setColumns(5);
        contentPane.add(pseudo);
        
        JLabel pwdLabel = new JLabel("Mot de passe");
        pwdLabel.setForeground(Color.BLACK);
        pwdLabel.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        pwdLabel.setBounds(350, 190, 325, 93);
        contentPane.add(pwdLabel);
        
        password = new JTextField();
        password.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        password.setBounds(350, 250, 325, 60);
        password.setColumns(5);
        contentPane.add(password);
        
        bouton = new JButton("Se connecter");
        bouton.setFont(new Font("Times New Roman", Font.BOLD, 25));
        bouton.setForeground(Color.black);
        bouton.setBounds(350, 330, 325, 60);
        bouton.addActionListener((ActionEvent arg0) -> {
            String pseudoInput = pseudo.getText();
            String passwordInput = password.getText();
            if((pseudoInput.length() != 0) && (passwordInput.length() != 0)){
                //System.out.println(pseudoInput);
                this.setVisible(false);
                Level lvl = new Level(pseudoInput);
                System.out.println("Le pseudo est "+lvl.getPseudo()+" et le mot de passe est: "+passwordInput);
                
                joueurDao = new JoueurService();
                Joueur joueur = new Joueur(pseudoInput, passwordInput);
                Joueur joueurRegistered = joueurDao.enregistrer(joueur);
                System.out.println(joueurRegistered);
                
                
                lvl.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Veuillez entrer votre pseudo ou votre mot de passe");
            }
            
            
            
            
            
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        });
        contentPane.add(bouton);
        
    }
}
