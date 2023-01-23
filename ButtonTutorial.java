import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonTutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonTutorial extends Button
{
    /**
     * Act - do whatever the ButtonTutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ButtonTutorial(){
        getImage().scale(getImage().getWidth()/2  , getImage().getHeight()/2);
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
            Greenfoot.setWorld(new Tutorial());
        }
    }    
}
