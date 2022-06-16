/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author 
 * Didi Orlog SOSSOU
 * Edo Amen YAWOVI
 * Essowaza Samuel ATAKE
 */
public class Case extends JButton{
    CaseObj co;
    
    public Case(CaseObj co){
        this.co=co;
        this.setBounds(20, 20, 20, 20);
    }
    
   /* public void devoiler(ArrayList<Case> listevoisins){
        this.setBackground(Color.WHITE);
        int nbmines = 0;
        for(Case i: listevoisins){
            if(i.getCo().mine == true){
                nbmines++;
            }
        }
        if(nbmines==0){
            for(Case i: listevoisins){
                i.setBackground(Color.white);
                i.devoiler();
            }
        }



    }*/

    public CaseObj getCo() {
        return co;
    }

    public void setCo(CaseObj co) {
        this.co = co;
    }
    
 
    
}
