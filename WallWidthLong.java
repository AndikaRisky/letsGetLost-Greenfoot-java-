import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallLong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallWidthLong extends Wall
{
    /**
     * Act - do whatever the WallLong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WallWidthLong(){
        getImage().scale(getImage().getWidth() * 6 , getImage().getHeight());
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
