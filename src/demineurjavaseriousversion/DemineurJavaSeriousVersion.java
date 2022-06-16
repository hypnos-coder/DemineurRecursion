/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

/**
 *
 * @author 
 * Didi Orlog SOSSOU
 * Edo Amen YAWOVI
 * Essowaza Samuel ATAKE
 */
public class DemineurJavaSeriousVersion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("Bienvenue dans le jeu DEMINEUR");
        
        //PrincipalWindow pw = new PrincipalWindow();
        //pw.setVisible(true);
        
        Authentification auth = new Authentification();
        auth.setVisible(true);
        
        //Level lvl = new Level();
        //lvl.setVisible(true);
        
        //Partie part = new Partie(25);
        //int i = part.count();
    }
    
}
