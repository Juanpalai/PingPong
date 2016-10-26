/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinpon;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author oop
 */
public class animationArea extends JComponent
{
    private Ball ball;
    
    //--------------------------------------------------------------------------
    
    public animationArea() 
    {
        ball = new Ball(100,100,this);
        ball.start();
    }
    
    //--------------------------------------------------------------------------
    
    public void paint(Graphics g)
    {
        ball.draw(g);
    }
    
}
