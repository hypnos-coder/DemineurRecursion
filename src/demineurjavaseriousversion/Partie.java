/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

/**
 *
 * @authors
 * Didi Orlog SOSSOU
 * Edo Amen YAWOVI
 * Essowaza Samuel ATAKE
 */
public class Partie {
    int id;
    int idJoueur;
    int tempsPartie;
    int scorePartie;
    int level; //Level 1 --- Facile; Level 2 --- Moyen; Level 3 ------ Difficile
    String couleur;
    
    public Partie(){
        
    } 
    
    public Partie(int id, int idJoueur, int tempsPartie, int scorePartie, int level, String couleur){
        this.id=id;
        this.idJoueur=idJoueur;
        this.tempsPartie=tempsPartie;
        this.scorePartie=scorePartie;
        this.level=level;
        this.couleur=couleur;
    }
    
    //Les accesseurs

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public int getTempsPartie() {
        return tempsPartie;
    }

    public void setTempsPartie(int tempsPartie) {
        this.tempsPartie = tempsPartie;
    }

    public int getScorePartie() {
        return scorePartie;
    }

    public void setScorePartie(int scorePartie) {
        this.scorePartie = scorePartie;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    //Le hash

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Partie other = (Partie) obj;
        return this.id == other.id;
    }
    
    
    
    
    
}
