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
public interface PartieDAO {
    Partie enregistrer(Partie partie);
    ArrayList<Partie> lister();
}
