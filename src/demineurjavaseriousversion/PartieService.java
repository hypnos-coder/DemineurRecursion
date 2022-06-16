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
public class PartieService implements PartieDAO{

    @Override
    public Partie enregistrer(Partie partie) {
        int id = partie.getId();
        int idJoueur = partie.getIdJoueur();
        int tempsPartie = partie.getTempsPartie();
        int scorePartie = partie.getScorePartie();
        int level = partie.getLevel(); //Level 1 --- Facile; Level 2 --- Moyen; Level 3 ------Difficile
        String couleur = partie.getCouleur();
        
        String query = "INSERT INTO partie(idjoueur, tempspartie, scorepartie, level, couleur) VALUES ('"+idJoueur+"', '"+tempsPartie+"', '"+scorePartie+"', '"+level+"', '"+couleur+"');";
        try {
            Connection connection = DatabaseConnexion.getInstance();
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return partie;
    }

    @Override
    public ArrayList<Partie> lister() {
        ArrayList<Partie> parties = new ArrayList<Partie>();
        String query ="SELECT * FROM partie;";
        
        try {
            Connection connection = DatabaseConnexion.getInstance();
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(query);
            
            while(results.next()){
                int id = results.getInt("id");
                int idJoueur = results.getInt("idJoueur");
                int tempsPartie = results.getInt("tempspartie");
                int scorePartie = results.getInt("scorepartie");
                int level = results.getInt("level");
                String couleur = results.getString("couleur");
                
                Partie partie = new Partie(id, idJoueur, tempsPartie, scorePartie, level, couleur);
                
                parties.add(partie);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        
        
        return parties;
    }
    
}
