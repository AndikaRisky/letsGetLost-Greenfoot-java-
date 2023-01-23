import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoveHorizontal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveHorizontal extends Bomb
{
    private int speed;
    /**
     * Act - do whatever the MoveHorizontal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MoveHorizontal(int inc)
    {
        speed = inc;
    }
    public void act() 
    {
        setLocation(getX()-speed , getY());
        if(isTouching(Wall.class))
            {
                speed = -speed;
            }
    }
}
