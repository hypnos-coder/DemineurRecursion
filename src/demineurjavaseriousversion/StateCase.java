/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineurjavaseriousversion;

/**
 *
 * @author samue
 */
public class StateCase {
    int id;
    int idPartie;
    String listeCaseMine;
    String listeCaseMarque;
    String listeCaseDevoile;

    public StateCase(){
        
    }
    public StateCase(int id, int idPartie, String listeCaseMine, String listeCaseMarque, String listeCaseDevoile) {
        this.id = id;
        this.idPartie = idPartie;
        this.listeCaseMine = listeCaseMine;
        this.listeCaseMarque = listeCaseMarque;
        this.listeCaseDevoile = listeCaseDevoile;
    }
    
    //Les accesseurs

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPartie() {
        return idPartie;
    }

    public void setIdPartie(int idPartie) {
        this.idPartie = idPartie;
    }

    public String getListeCaseMine() {
        return listeCaseMine;
    }

    public void setListeCaseMine(String listeCaseMine) {
        this.listeCaseMine = listeCaseMine;
    }

    public String getListeCaseMarque() {
        return listeCaseMarque;
    }

    public void setListeCaseMarque(String listeCaseMarque) {
        this.listeCaseMarque = listeCaseMarque;
    }

    public String getListeCaseDevoile() {
        return listeCaseDevoile;
    }

    public void setListeCaseDevoile(String listeCaseDevoile) {
        this.listeCaseDevoile = listeCaseDevoile;
    }
    
    
    
}
