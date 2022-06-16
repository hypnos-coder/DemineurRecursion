/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 
 * Didi Orlog SOSSOU
 * Edo Amen YAWOVI
 * Essowaza Samuel ATAKE
 */
public class GrilleObj {
    //Variables declaration
    int x;
    int y;
    Color couleur;
    ArrayList<CaseObj> listeCaseObj = new ArrayList<CaseObj>();

    public void resetListeCaseObj() {
        this.listeCaseObj.removeAll(listeCaseObj);
    }

    public GrilleObj(int x, int y, Color couleur){
        this.x=x;
        this.y=y;
        this.couleur = couleur;
        System.out.println("creer1");
        //createGrille();
    }
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    
    public Color getCouleur(){
        return couleur;
    }
    public void setCouleur(Color couleur){
        this.couleur=couleur;
    }
    
     public void remplissage(int x , int y){
         int nbCaseVide = 0;
          for(int i=0; i<=(x*y)-1; i++){
              CaseObj case1 = new CaseObj(getRandomBool()); //case1.setMine(getRandomBool());
              listeCaseObj.add(case1);
          }
         
     }
     
     
    public ArrayList getvoisin(CaseObj co){
        int pos;
        ArrayList<CaseObj> listevoisins = new ArrayList<CaseObj>();
        pos = listeCaseObj.indexOf(co);
        //System.out.println(pos);
        
        if ((pos+1)%y ==1){
            
            for(int i=pos-y; i<=pos-y+1; i++){
              
              try{
                     //System.out.println(i);
                     listevoisins.add(listeCaseObj.get(i)); }
                     
               catch(IndexOutOfBoundsException e){
                   continue; 
               }

             }
          
        for(int i=pos+1 ; i<pos+2; i++){
            
            if (i!=pos){
                try{
                    listevoisins.add(listeCaseObj.get(i));
                }
                catch(IndexOutOfBoundsException e){
                    continue;

                 }
            }
            
        }
            
             for(int i=pos+y; i<=pos+y+1; i++){
                 
                 try{
                     //System.out.println(i);
                     listevoisins.add(listeCaseObj.get(i)); } 
                    
                catch(IndexOutOfBoundsException e){
                   continue; 
               }
       
       }
            
        }else if((pos+1)%y == 0){
        
            
            for(int i=pos-y-1; i<=pos-y; i++){
              
              try{
                     //System.out.println(i);
                     listevoisins.add(listeCaseObj.get(i)); }
                     
               catch(IndexOutOfBoundsException e){
                   continue; 
               }

             }
          
        for(int i=pos-1 ; i<pos; i++){
            
            if (i!=pos){
                try{
                    listevoisins.add(listeCaseObj.get(i));
                }
                catch(IndexOutOfBoundsException e){
                    continue;

                 }
            }
            
        }
            
             for(int i=pos+y-1; i<=pos+y; i++){
                 
                 try{
                     //System.out.println(i);
                     listevoisins.add(listeCaseObj.get(i)); } 
                    
                catch(IndexOutOfBoundsException e){
                   continue; 
                }}
        
        }
        else{
          for(int i=pos-y-1; i<=pos-y+1; i++){
              
              try{
                     //System.out.println(i);
                     listevoisins.add(listeCaseObj.get(i)); }
                     
               catch(IndexOutOfBoundsException e){
                   continue; 
               }

             }
          
        for(int i=pos-1 ; i<=pos+1; i++){
            
            if (i!=pos){
                try{
                    listevoisins.add(listeCaseObj.get(i));
                }
                catch(IndexOutOfBoundsException e){
                    continue;

                 }
            }
            
        }
            
            System.out.println(pos-1);
             for(int i=pos+y-1; i<=pos+y+1; i++){
                 
                 try{
                     //System.out.println(i);
                     listevoisins.add(listeCaseObj.get(i)); } 
                    
                catch(IndexOutOfBoundsException k){
                   continue; 
               }
       
       }
     }
                
        System.out.println("   ");
       return listevoisins;
         
    }   
     
     
    public int calculmines(CaseObj co){
        int nbmines = 0;
         ArrayList<CaseObj> liste = new ArrayList<CaseObj>();
         liste = getvoisin(co);
 
        for (CaseObj i: liste ){
            if (i.mine==true){
                nbmines++;
            }

        }

        return nbmines;

    }


    public static boolean getRandomBool(){
        Random rd = new Random();
        return rd.nextBoolean();
    }
    
    static void createStateGrille(ArrayList<Case> listeCase){
        String listeCaseMine = "";
        String listeCaseMarque = "";
        String listeCaseDevoile = "";
        
        for(Case i: listeCase){
            listeCaseMine += String.valueOf(i.getCo().getMine())+";";
            listeCaseMarque += String.valueOf(i.getCo().getMarque())+";";
            listeCaseDevoile += String.valueOf(i.getCo().getDevoile())+";";
        }
        
        System.out.println(listeCaseMine);
    }

   
}
