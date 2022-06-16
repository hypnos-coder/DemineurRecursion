/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Didi Orlog SOSSOU Edo Amen YAWOVI Essowaza Samuel ATAKE
 */
public class Grille extends JApplet {

    public GrilleObj g;
    public int x;
    public int y;
    ArrayList<Case> listeCase = new ArrayList<Case>();
    static int clic;
    static int resultat;
    //static int nbCaseVide;
    static int score;

    public Grille(int x, int y, GrilleObj g) {
        this.g = new GrilleObj(x, y, Color.blue);
        this.g.remplissage(x, y);
        this.score = score;
        createGrille(x, y);
        System.out.println("creer");
    }

    public void setG(GrilleObj g) {
        this.g = g;
    }
    
    private static void createDialog() {    
      JFrame frame = new JFrame("Démineur | Dialogue");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
      resultat = setDialog(frame);
      frame.setSize(560, 200);      
      frame.setLocationRelativeTo(null);  
      frame.setVisible(false);
   }
    
    private static void createWinDialog(){
        JFrame frame = new JFrame("Démineur | Dialogue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        resultat = setWinDialog(frame);
        frame.setSize(560, 200);      
        frame.setLocationRelativeTo(null);  
        frame.setVisible(false);
    }

    protected void createGrille(int x, int y) {

        for (CaseObj i : this.g.listeCaseObj) {
            //System.out.println("camen le connard");

            Case cij = new Case(i);
            //cij.setBorderPainted(false);
            cij.setFocusPainted(false);
            
            cij.setBackground(new Color(168, 168, 168));
            cij.setBorder(new RounderedBorder(10));
            listeCase.add(cij);

            cij.addMouseListener((MouseListener) new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    //Calme toi!
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    //To change body of generated methods, choose Tools | Templates.
                    //System.out.println("Nicer");
                    int buttonDown = e.getButton();

                    if (buttonDown == MouseEvent.BUTTON3) {

                        // Bouton GAUCHE enfoncé
                        if(cij.getCo().devoile==false){
                            if (cij.getCo().marque==false){
                            System.out.println("Case marquée");
                            cij.getCo().setMarque(true);
                            cij.setBackground(Color.white);
                            cij.setIcon(new ImageIcon(getClass().getResource("../flag.png")));}
                            else{
                                cij.getCo().setMarque(false);
                                cij.setBackground(new Color(168, 168, 168));
                                cij.setIcon(null);
                            }
                        }

                    } else if (buttonDown == MouseEvent.BUTTON2) {
                        // Bouton du MILIEU enfoncé
                    } else if (buttonDown == MouseEvent.BUTTON1) {
                        // Bouton DROIT enfonce
                        
                        if (cij.getCo().marque == false) {
                            int guess;
                            clic++;
                            System.out.println("Nombre case vide "+nbCaseVide());
                            System.out.println("Nombre Case dévoilées "+nbCaseDevoile());
                            
                            
                            if (clic == 1) { //On est au premier clic
                                //
                                PrincipalWindow.setTime();
                                //
                                cij.getCo().setMine(false);
                                
                                GrilleObj.createStateGrille(listeCase);
                                
                                ArrayList<CaseObj> firstList = new ArrayList();
                                firstList = g.getvoisin(cij.getCo());
                                for (CaseObj i : firstList) {
                                    i.setMine(false);

                                }

                                guess = new Random().nextInt(firstList.size());
                                CaseObj voisinAleatoire = firstList.get(guess);
                                ArrayList<CaseObj> secondList = new ArrayList();
                                secondList = g.getvoisin(voisinAleatoire);
                                for (CaseObj k : secondList) {
                                    k.setMine(false);

                                }
                                
                                
                            }
                            Icon img = new ImageIcon("../R.png");
                            
                            if (cij.getCo().mine == false) {
                                System.out.println("Cool!");
                                //cij.devoiler();
                                //cij.setText(""+g.calculmines(cij.getCo()));
                                
                                recursif(cij);
                                if(nbCaseVide() == nbCaseDevoile()){
                                    System.out.println("You win!!!:)");
                                     createWinDialog();
                                  if(resultat == JOptionPane.YES_OPTION){
                                        System.out.println("Vous avez sélectionné: Oui continuer");
                                        nouvellegrille(x,y);
                                        setVisible(true);
                                    }else if (resultat == JOptionPane.NO_OPTION){
                                        System.out.println("Vous avez sélectionné: Non quitter.");
                                        System.exit(0);
                                    }else {
                                        System.out.println("vous n'avez rien sélectionné");
                                    }
                                }

                            } else {
                                System.out.println("bommmmmmbe");

                                for (Case i : listeCase) {
                                    if (i.getCo().mine == true) {
                                        i.setIcon(new ImageIcon(getClass().getResource("../R.png")));

                                    }

                                }
                                clic=0;
                                //JOptionPane.showMessageDialog(null, "Vous avez perdu!");
                                
                                //JDialog pour la reprise du jeu ou la fin
                                  createDialog();
                                  if(resultat == JOptionPane.YES_OPTION){
                                        System.out.println("Vous avez sélectionné: Oui continuer");
                                        nouvellegrille(x,y);
                                        setVisible(true);
                                    }else if (resultat == JOptionPane.NO_OPTION){
                                        System.out.println("Vous avez sélectionné: Non quitter.");
                                        System.exit(0);
                                    }else {
                                        System.out.println("vous n'avez rien sélectionné");
                                    }
                                

                            }
                            
                        }

                    }
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    //To change body of generated methods, choose Tools | Templates.
                }

            }
            );

            this.setLayout(new GridLayout(x, y));
            this.add(cij);
        }

    }
    
    private static int setDialog(JFrame frame){
        //JLabel label = new JLabel();
        String[] options = {"Reprendre", "Quitter"}; 
            int result = JOptionPane.showOptionDialog(
               frame,
               "Vous avez perdu!\n Que voulez-vous faire...?", 
               "Demineur | Dialogue",            
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE,
               null,     //Pas d'icône customisé
               options,  //Nom des boutons (libelé)
               options[0] //Bouton par défaut
            );
            return result;
    }
    
    private static int setWinDialog(JFrame frame){
        String[] options = {"Reprendre", "Quitter"}; 
            int result = JOptionPane.showOptionDialog(
               frame,
               "\tVous avez gagné!\n\t Que voulez-vous faire...?", 
               "Demineur | Dialogue",            
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE,
               null,     //Pas d'icône customisé
               options,  //Nom des boutons (libelé)
               options[0] //Bouton par défaut
            );
        return result;
    }

    protected void nouvellegrille(int x, int y) {
        for (Case i:listeCase) {
            i.getCo().setMine(g.getRandomBool());
            i.setBackground(new Color(168, 168, 168));
            i.setIcon(null);
            i.setText(null);
            i.setBorder(new RounderedBorder(10));
            i.getCo().setMarque(false);
            i.getCo().setDevoile(false);
            i.revalidate();
        }
    }

    protected ArrayList correspondance(Case cij) {
        ArrayList<CaseObj> liste = new ArrayList<CaseObj>();
        ArrayList<Case> listeCaseVoisins = new ArrayList<Case>();
        liste = g.getvoisin(cij.getCo());
        for (Case j : listeCase) {
            for (CaseObj i : liste) {
                if (j.getCo() == i) {
                    listeCaseVoisins.add(j);

                }
            }
        }

        return listeCaseVoisins;

    }
    
    public int nbCaseDevoile(){
        int nbCaseDevoile = 0;
        for (Case i: listeCase) {
            if(i.getCo().getDevoile()){
                nbCaseDevoile++;
                this.setScore(nbCaseDevoile*2);
                System.out.println("Votre score: "+this.getScore());
            }
        }
        return nbCaseDevoile;
    }
    public int nbCaseVide(){
        int nbCaseVide = 0;
        for (Case i: listeCase) {
            if(i.getCo().getMine()== false){
                nbCaseVide++;
            }
        }
        return nbCaseVide;
    }
    

    public void recursif(Case ca) {
        ArrayList<Case> listevoisins = new ArrayList();
        listevoisins = correspondance(ca);

        ca.setBackground(Color.WHITE);
        //ca.setEnabled(false);
        ca.getCo().setDevoile(true);
        if (g.calculmines(ca.getCo()) == 0) {
            ca.setText("");
        } else {
            ca.setText("" + g.calculmines(ca.getCo()));
        }

        if (g.calculmines(ca.getCo()) == 0) {
            for (Case i : listevoisins) {
                if (i.getCo().devoile == false) {
                    recursif(i);
                }

            }
        }
        
        
    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        Grille.score = score;
    }

}
