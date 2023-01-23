import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoveVertical here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveVertical extends Bomb
{
    /**
     * Act - do whatever the MoveVertical wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    public MoveVertical(int inc)
    {
        speed = inc;
    }
    public void act()
    {
        setLocation(getX() , getY()-speed);
        if(isTouching(Wall.class))
            {
                speed = -speed;
            }
    }
    
}
