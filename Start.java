import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Buttonstart buttonstart = new Buttonstart();
        addObject(buttonstart,309,456);
        buttonstart.setLocation(296,456);
        buttonstart.setLocation(208,312);
        buttonstart.setLocation(200,246);
        ButtonTutorial buttonTutorial = new ButtonTutorial();
        addObject(buttonTutorial,265,369);
        buttonTutorial.setLocation(191,344);
    }
}
