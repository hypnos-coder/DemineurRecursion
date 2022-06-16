/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

import java.util.ArrayList;

/**
 *
 * @author 
 * Didi Orlog SOSSOU
 * Edo Amen YAWOVI
 * Essowaza Samuel ATAKE
 */
public class CaseObj {
    boolean mine;
    boolean devoile;
    boolean marque;

    public CaseObj(boolean mine){
        this.mine = mine;   
        this.devoile = false;
        this.marque=false;
    }

    public boolean getMarque() {
        return marque;
    }

    public void setMarque(boolean marque) {
        this.marque = marque;
    }
    
    //Les accesseurs
    public boolean getMine(){
        return mine;
    }
    public void setMine(boolean mine){
        this.mine = mine;
    }


    public boolean getDevoile() {
        return devoile;
    }

    public void setDevoile(boolean devoile) {
        this.devoile = devoile;
    }
    
    
    
    
    
}
