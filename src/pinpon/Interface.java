/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinpon;

import javax.swing.JFrame;

/**
 *
 * @author oop
 */
public class Interface extends JFrame
{
    private animationArea area;
    
    //--------------------------------------------------------------------------
    
    public Interface()
    {
        super("Ping Pong");
        setSize(600, 400);
        area = new animationArea();
        add(area);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);        
    }
    
    //--------------------------------------------------------------------------
    
    public static void main(String[] args) 
    {
        new Interface();
    }
    
}
