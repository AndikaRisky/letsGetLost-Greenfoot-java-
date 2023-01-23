import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Blank.
     * 
     */
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();
    }

    public void act(){
     
        
    } 

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Buttonstart buttonstart = new Buttonstart();
        addObject(buttonstart,252,311);
        buttonstart.setLocation(256,279);
        buttonstart.setLocation(275,345);
        removeObject(buttonstart);
        Buttonstart buttonstart2 = new Buttonstart();
        addObject(buttonstart2,257,323);
        showText("CONTROL",100,20);
        showText("TOMBOL W = ATAS",100,50);
        showText("TOMBOL S  = BAWAH",111,70);
        showText("TOMBOL A  = KIRI",93,90);
        showText("TOMBOL D  = KANAN",109,110);
        showText("● AMBIL SEMUA ADDSPEED YANG ADA",195,150);
        showText("● JANGAN MENABRAK BOM JIKA TIDAK INGIN",227,180);
        showText("NYAWA DAN SPEED ANDA BERKURANG",220,200);
        showText("● TENANG SAJA JIKA SPEEDMU MENCAPAI LEVEL",249,230);
        showText("4,ADDPSEED AKAN BERUBAH MENJADI NYAWA",257,250);
    }
}
