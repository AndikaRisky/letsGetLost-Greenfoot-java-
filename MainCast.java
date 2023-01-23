import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCast extends Actor
{
    /**
     * Act - do whatever the MainCast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 1;
    private int CheckpointX ;
    private int CheckpointY ;
    private int HitPoint = 3 ;
    int score;
    public MainCast(){
        
    }
    public void act() 
    {
        Control(speed);
        HitAddSpeed();
        HitCheckPoint();
        HitBomb();
        hitFinish();
        getWorld().showText("Speed  "+speed,300,30);
        getWorld().showText("Nyawa  "+HitPoint,300,50);
    }  
    public void Control(int speed)
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+speed,getY());
            if(hitWall() == true)
            {
                setLocation(getX()- speed , getY());
            }
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-speed,getY());
            if(hitWall() == true)
            {
                setLocation(getX()+speed,getY());
            }
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-speed);
            if(hitWall() == true)
            {
                setLocation(getX(),getY()+speed);
            }
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+speed);
            if(hitWall() == true)
            {
                setLocation(getX(),getY()-speed);
            }
        }
        
    }
    public boolean hitWall(){
        if(isTouching(Wall.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void HitAddSpeed()
    {
        if(isTouching(AddSpeed.class))
        {
        score += 5;
        removeTouching(AddSpeed.class);
        Greenfoot.playSound("Addspeed.wav");
        if(speed < 4){
            speed++;
        }
        else
        {
            HitPoint++;
        }
        
    }
    }
    public void HitCheckPoint()
    {
        if(isTouching(CheckPoint.class))
        {
            CheckpointX = getX();
            CheckpointY = getY();
        }
    }
    public void HitBomb()
    {
        if(isTouching(Bomb.class))
        {
            setLocation(CheckpointX,CheckpointY);
            HitPoint--;
            speed--;
            Greenfoot.playSound("hitbomb.wav");
            if(speed == 0){
                speed=1;
            }
            if(HitPoint == 0){
                Greenfoot.playSound("gameover.wav");
                setLocation(300,300);
                setImage("lose.png");
                Greenfoot.stop();
            }
        }
    }
    public void hitFinish()
    {
        if(isTouching(Flag.class))
        {
            if(score == 35){
                Greenfoot.playSound("upLevel.wav");
                Greenfoot.delay(50);
                Greenfoot.setWorld(new MyWorld2());
            }
            if(score == 40){
                Greenfoot.playSound("upLevel.wav");
                Greenfoot.delay(20);
                Greenfoot.setWorld(new MyWorld3());
            }
            if(score == 45){
                Greenfoot.playSound("end.wav");
                Greenfoot.delay(20);
                setLocation(300,300);
                setImage("win.png");
                Greenfoot.stop();
            }
        }
    }
    public void hitWall()
{
    if(isTouching(Wall.class))
        {
            setLocation(10,10); lokasi awal
            nyawa--;
            if(nyawa == 0){
                Greenfoot.stop();
            }
            }
        }
}
}
