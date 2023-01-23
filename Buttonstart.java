import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttonstart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttonstart extends Button
{
    /**
     * Act - do whatever the Buttonstart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Buttonstart(){
        
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9)); 
            Greenfoot.playSound("click.wav");
        }
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.delay(3);
            
            Greenfoot.setWorld(new MyWorld1());
        }
    }    
}
