/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineurjavaseriousversion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author samue
 */
public class JoueurService implements JoueurDAO{

    @Override
    public Joueur enregistrer(Joueur joueur) {
        String pseudo = joueur.getPseudo();
        String password = joueur.getPassword();
        String query = "INSERT INTO joueur(pseudo, password) VALUES('"+pseudo+"', '"+password+"');";
        
         try {
            Connection connection = DatabaseConnexion.getInstance();
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return joueur;
    }

    @Override
    public ArrayList<Joueur> lister() {
        ArrayList<Joueur> listeJoueur =  new ArrayList<Joueur>();
        String query = "SELECT * FROM joueur;";
        
        try {
            Connection connection = DatabaseConnexion.getInstance();
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(query);
            
            while(results.next()){
                int id = results.getInt("id");
                String pseudo = results.getString("pseudo");
                String password = results.getString("password");
                Joueur joueur = new Joueur(id, pseudo, password);
                
                listeJoueur.add(joueur);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return listeJoueur;
    }
    
}
