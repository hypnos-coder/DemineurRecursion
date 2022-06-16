/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

/**
 *
 * @author samue
 */
public class Joueur {
    int id;
    String pseudo;
    String password;
    
    public Joueur(){
        
    }
    
    public Joueur(String pseudo, String password){
        this.pseudo=pseudo;
        this.password=password;
    }
    
    public Joueur(int id, String pseudo, String password){
        this.id=id;
        this.pseudo=pseudo;
        this.password=password;
    }

    //Accesseurs
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //Hasheur

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
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
        final Joueur other = (Joueur) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Joueur{ pseudo=" + pseudo + ", password=" + password + '}';
    }
    
    
    
     
}
