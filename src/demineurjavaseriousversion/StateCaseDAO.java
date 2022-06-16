/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package demineurjavaseriousversion;

import java.util.ArrayList;

/**
 *
 * @author samue
 */
public interface StateCaseDAO {
    StateCase enregistrer(StateCase stateCase);
    ArrayList<StateCase> listerCasePartie();
    StateCase update(StateCase statecase);
    StateCase singleGrille(int i);
}
