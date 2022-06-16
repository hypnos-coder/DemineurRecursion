/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineurjavaseriousversion;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/**
 *
 * @author samue
 */
public class RounderedBorder implements Border{
    private int radius ;
    
    public RounderedBorder(int radius) {
        this.radius = radius ;
    }
    
    @Override
    public void paintBorder(Component arg0, Graphics g, int x, int y, int arg4, int arg5) {
       g.drawRoundRect(x, y, arg4-1, arg5-1, radius, radius);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1,this.radius+1,this.radius+2,this.radius) ;
    }

    @Override
    public boolean isBorderOpaque() {
        return false ;
    }
    
}
