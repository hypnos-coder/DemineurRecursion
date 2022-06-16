/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineurjavaseriousversion;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samue
 */
public class StateCaseService implements StateCaseDAO{

    @Override
    public StateCase enregistrer(StateCase stateCase) {
        int id = stateCase.getId();
        int idPartie = stateCase.getIdPartie();
        String listeCaseMine = stateCase.getListeCaseMine();
        String listeCaseMarque = stateCase.getListeCaseMarque();
        String listeCaseDevoile = stateCase.getListeCaseDevoile();
        
        String query = "INSERT INTO statecase(idpartie, listecasemine, listecasemarque, listecasedevoile) VALUES ('"+idPartie+"', '"+listeCaseMine+"', '"+listeCaseMarque+"', '"+listeCaseDevoile+"');";
        
        try {
            Statement statement = DatabaseConnexion.getInstance().createStatement();
            statement.executeQuery(query);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        return stateCase;
    }

    @Override
    public ArrayList<StateCase> listerCasePartie() {
        ArrayList<StateCase> listeCaseState = new ArrayList<StateCase>();
        String query = "SELECT * FROM statecase";
        try{
            Statement statement = DatabaseConnexion.getInstance().createStatement();
            ResultSet results = statement.executeQuery(query);
            
            while(results.next()){
                int id = results.getInt("id") ;
                int idPartie = results.getInt("idpartie");
                String listeCaseMine = results.getString("listecasemine");
                String listeCaseMarque = results.getString("listecasemarque");
                String listeCaseDevoile = results.getString("listecasedevoile");
                
                StateCase statecase = new StateCase(id, idPartie, listeCaseMine, listeCaseMarque, listeCaseDevoile);
                listeCaseState.add(statecase);
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
        return listeCaseState;
    }

    @Override
    public StateCase update(StateCase stateCase) {
        int id = stateCase.getId();
        int idPartie = stateCase.getIdPartie();
        String listeCaseMine = stateCase.getListeCaseMine();
        String listeCaseMarque = stateCase.getListeCaseMarque();
        String listeCaseDevoile = stateCase.getListeCaseDevoile();
        
        String query = "UPDATE statecase SET idpartie="+idPartie+", listecasemine="+listeCaseMine+", listecasemarque="+listeCaseMarque+", listecasedevoile="+listeCaseDevoile+" WHERE id= "+stateCase.getId();
        
        try {
            Statement statement = DatabaseConnexion.getInstance().createStatement();
            statement.executeQuery(query);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        return stateCase;
    }

    @Override
    public StateCase singleGrille(int i) {
        String query = "SELECT * FROM statecase WHERE idpartie="+i;
        
        try {
            Statement statement = DatabaseConnexion.getInstance().createStatement();
            ResultSet result = statement.executeQuery(query);
            
                int id = result.getInt("id") ;
                int idPartie = result.getInt("idpartie");
                String listeCaseMine = result.getString("listecasemine");
                String listeCaseMarque = result.getString("listecasemarque");
                String listeCaseDevoile = result.getString("listecasedevoile");
            
                StateCase stateCase =  new StateCase(id, idPartie, listeCaseMine, listeCaseMarque, listeCaseDevoile);
                
                return stateCase;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
}
