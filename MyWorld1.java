import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld1 extends World
{

    /**
     * Constructor for objects of class MyWorld5.
     * 
     */
    public MyWorld1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        WallHeightLong wallHeightLong = new WallHeightLong();
        addObject(wallHeightLong,600,90);
        WallHeightLong wallHeightLong2 = new WallHeightLong();
        addObject(wallHeightLong2,600,270);
        WallHeightLong wallHeightLong3 = new WallHeightLong();
        addObject(wallHeightLong3,600,450);
        WallHeightLong wallHeightLong4 = new WallHeightLong();
        addObject(wallHeightLong4,2,90);
        WallHeightLong wallHeightLong5 = new WallHeightLong();
        addObject(wallHeightLong5,2,270);
        WallHeightLong wallHeightLong6 = new WallHeightLong();
        addObject(wallHeightLong6,2,450);
        WallWidthLong wallWidthLong = new WallWidthLong();
        addObject(wallWidthLong,510,1);
        WallWidthLong wallWidthLong2 = new WallWidthLong();
        addObject(wallWidthLong2,330,1);
        WallWidthLong wallWidthLong3 = new WallWidthLong();
        addObject(wallWidthLong3,150,1);
        WallWidthLong wallWidthLong4 = new WallWidthLong();
        addObject(wallWidthLong4,510,600);
        WallWidthLong wallWidthLong5 = new WallWidthLong();
        addObject(wallWidthLong5,330,600);
        WallWidthLong wallWidthLong6 = new WallWidthLong();
        addObject(wallWidthLong6,150,600);

        WallWidthSmall wallWidthSmall = new WallWidthSmall();
        addObject(wallWidthSmall,39,63);
        WallWidthSmall wallWidthSmall2 = new WallWidthSmall();
        addObject(wallWidthSmall2,39,242);
        WallWidthSmall wallWidthSmall3 = new WallWidthSmall();
        addObject(wallWidthSmall3,568,242);
        wallWidthSmall3.setLocation(566,242);
        WallWidthSmall wallWidthSmall4 = new WallWidthSmall();
        addObject(wallWidthSmall4,569,537);
        wallWidthSmall4.setLocation(565,534);
        wallWidthSmall4.setLocation(564,534);
        WallWidthSmall wallWidthSmall5 = new WallWidthSmall();
        addObject(wallWidthSmall5,46,598);
        wallWidthSmall5.setLocation(35,600);

        WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,7,573);
        wallHeightSmall.setLocation(2,568);
        WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,69,121);
        WallHeightSmall wallHeightSmall2 = new WallHeightSmall();
        addObject(wallHeightSmall2,121,93);
        wallHeightSmall2.setLocation(121,93);
        WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,485,548);
        wallHeightMedium.setLocation(480,535);
        WallHeightSmall wallHeightSmall3 = new WallHeightSmall();
        addObject(wallHeightSmall3,360,566);
        wallHeightSmall3.setLocation(361,565);
        WallWidthLong wallWidthLong7 = new WallWidthLong();
        addObject(wallWidthLong7,502,57);
        wallWidthLong7.setLocation(514,63);
        WallWidthLong wallWidthLong8 = new WallWidthLong();
        addObject(wallWidthLong8,221,528);
        wallWidthLong8.setLocation(279,537);
        WallWidthLong wallWidthLong9 = new WallWidthLong();
        addObject(wallWidthLong9,115,536);
        removeObject(wallWidthLong9);
        WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,124,537);
        wallWidthMedium2.setLocation(129,537);
        wallWidthMedium2.setLocation(78,537);
        WallWidthSmall wallWidthSmall6 = new WallWidthSmall();
        addObject(wallWidthSmall6,78,537);
        wallWidthMedium2.setLocation(89,537);
        wallWidthMedium2.setLocation(161,537);
        wallWidthSmall6.setLocation(87,537);
        WallHeightLong wallHeightLong7 = new WallHeightLong();
        addObject(wallHeightLong7,69,474);
        wallHeightLong7.setLocation(64,447);
        WallWidthSmall wallWidthSmall7 = new WallWidthSmall();
        addObject(wallWidthSmall7,92,361);
        wallWidthSmall7.setLocation(89,364);
        wallWidthSmall7.setLocation(113,363);
        WallWidthSmall wallWidthSmall8 = new WallWidthSmall();
        addObject(wallWidthSmall8,113,363);
        wallWidthSmall7.setLocation(101,370);
        wallWidthSmall8.setLocation(124,398);
        wallWidthSmall7.setLocation(100,366);
        wallWidthSmall7.setLocation(107,370);
        removeObject(wallWidthSmall7);
        removeObject(wallWidthSmall8);
        WallWidthSmall wallWidthSmall9 = new WallWidthSmall();
        addObject(wallWidthSmall9,84,364);
        wallWidthSmall9.setLocation(89,364);
        wallWidthSmall9.setLocation(113,365);
        WallWidthSmall wallWidthSmall10 = new WallWidthSmall();
        addObject(wallWidthSmall10,113,365);
        wallWidthSmall9.setLocation(90,365);
        wallWidthSmall10.setLocation(100,365);
        WallHeightMedium wallHeightMedium2 = new WallHeightMedium();
        addObject(wallHeightMedium2,122,305);
        wallHeightMedium2.setLocation(122,299);
        WallWidthSmall wallWidthSmall11 = new WallWidthSmall();
        addObject(wallWidthSmall11,90,298);
        wallWidthSmall11.setLocation(95,301);
        wallWidthSmall11.setLocation(91,299);
        WallHeightSmall wallHeightSmall4 = new WallHeightSmall();
        addObject(wallHeightSmall4,241,504);
        wallHeightSmall4.setLocation(242,504);
        WallWidthLong wallWidthLong10 = new WallWidthLong();
        addObject(wallWidthLong10,210,241);
        wallWidthLong10.setLocation(206,245);
        WallHeightLong wallHeightLong8 = new WallHeightLong();
        addObject(wallHeightLong8,294,286);
        wallHeightLong8.setLocation(303,276);
        WallHeightLong wallHeightLong9 = new WallHeightLong();
        addObject(wallHeightLong9,299,124);
        removeObject(wallHeightLong9);
        WallHeightMedium wallHeightMedium3 = new WallHeightMedium();
        addObject(wallHeightMedium3,307,126);
        wallHeightMedium3.setLocation(303,127);
        WallWidthSmall wallWidthSmall12 = new WallWidthSmall();
        addObject(wallWidthSmall12,282,68);
        wallWidthSmall12.setLocation(281,67);
        wallWidthSmall12.setLocation(258,67);

        removeObject(wallWidthSmall12);
        WallHeightLong wallHeightLong10 = new WallHeightLong();
        addObject(wallHeightLong10,184,99);
        wallHeightLong10.setLocation(181,99);
        WallWidthMedium wallWidthMedium3 = new WallWidthMedium();
        addObject(wallWidthMedium3,121,181);
        wallWidthMedium3.setLocation(121,181);
        WallHeightLong wallHeightLong11 = new WallHeightLong();
        addObject(wallHeightLong11,355,71);
        wallHeightLong11.setLocation(361,98);
        WallHeightMedium wallHeightMedium4 = new WallHeightMedium();
        addObject(wallHeightMedium4,363,245);
        wallHeightMedium4.setLocation(361,247);
        WallHeightMedium wallHeightMedium5 = new WallHeightMedium();
        addObject(wallHeightMedium5,541,484);
        wallHeightMedium5.setLocation(540,479);
        WallHeightMedium wallHeightMedium6 = new WallHeightMedium();
        addObject(wallHeightMedium6,531,367);
        wallHeightMedium6.setLocation(540,359);
        WallWidthSmall wallWidthSmall13 = new WallWidthSmall();
        addObject(wallWidthSmall13,394,118);
        wallWidthSmall13.setLocation(394,119);
        WallWidthSmall wallWidthSmall14 = new WallWidthSmall();
        addObject(wallWidthSmall14,518,304);
        wallWidthSmall14.setLocation(518,304);
        WallHeightSmall wallHeightSmall5 = new WallHeightSmall();
        addObject(wallHeightSmall5,489,275);
        wallHeightSmall5.setLocation(483,282);
        WallWidthMedium wallWidthMedium4 = new WallWidthMedium();
        addObject(wallWidthMedium4,484,420);
        wallWidthMedium4.setLocation(474,420);
        WallHeightMedium wallHeightMedium7 = new WallHeightMedium();
        addObject(wallHeightMedium7,420,482);
        wallHeightMedium7.setLocation(421,488);
        WallWidthMedium wallWidthMedium5 = new WallWidthMedium();
        addObject(wallWidthMedium5,359,478);
        wallWidthMedium5.setLocation(356,479);
        WallHeightSmall wallHeightSmall6 = new WallHeightSmall();
        addObject(wallHeightSmall6,302,452);
        wallHeightSmall6.setLocation(303,452);
        WallWidthLong wallWidthLong11 = new WallWidthLong();
        addObject(wallWidthLong11,276,413);
        wallWidthLong11.setLocation(276,417);
        WallWidthSmall wallWidthSmall15 = new WallWidthSmall();
        addObject(wallWidthSmall15,157,417);
        wallWidthSmall15.setLocation(156,417);
        WallHeightSmall wallHeightSmall7 = new WallHeightSmall();
        addObject(wallHeightSmall7,136,446);
        wallHeightSmall7.setLocation(133,451);
        WallWidthSmall wallWidthSmall16 = new WallWidthSmall();
        addObject(wallWidthSmall16,162,469);
        wallWidthSmall16.setLocation(159,474);
        WallHeightMedium wallHeightMedium8 = new WallHeightMedium();
        addObject(wallHeightMedium8,179,357);
        wallHeightMedium8.setLocation(184,351);

        WallWidthSmall wallWidthSmall17 = new WallWidthSmall();
        addObject(wallWidthSmall17,219,297);
        wallWidthSmall17.setLocation(222,298);
        WallHeightSmall wallHeightSmall8 = new WallHeightSmall();
        addObject(wallHeightSmall8,242,337);
        wallHeightSmall8.setLocation(244,336);
        WallWidthMedium wallWidthMedium6 = new WallWidthMedium();
        addObject(wallWidthMedium6,383,359);
        removeObject(wallWidthMedium6);
        WallHeightLong wallHeightLong12 = new WallHeightLong();
        addObject(wallHeightLong12,385,365);
        removeObject(wallHeightLong12);

        WallWidthLong wallWidthLong12 = new WallWidthLong();
        addObject(wallWidthLong12,388,357);
        wallWidthLong12.setLocation(396,358);
        WallHeightLong wallHeightLong13 = new WallHeightLong();
        addObject(wallHeightLong13,417,277);
        wallHeightLong13.setLocation(422,262);
        WallWidthMedium wallWidthMedium7 = new WallWidthMedium();
        addObject(wallWidthMedium7,489,182);
        wallWidthMedium7.setLocation(490,179);
        WallHeightSmall wallHeightSmall9 = new WallHeightSmall();
        addObject(wallHeightSmall9,537,139);
        wallHeightSmall9.setLocation(542,142);
        WallWidthSmall wallWidthSmall18 = new WallWidthSmall();
        addObject(wallWidthSmall18,509,127);
        wallWidthSmall18.setLocation(505,119);
        WallWidthSmall wallWidthSmall19 = new WallWidthSmall();
        addObject(wallWidthSmall19,277,77);
        wallWidthSmall19.setLocation(267,74);
        WallHeightMedium wallHeightMedium9 = new WallHeightMedium();
        addObject(wallHeightMedium9,240,131);
        wallHeightMedium9.setLocation(244,128);

        MainCast mainCast = new MainCast();
        addObject(mainCast,45,29);
        CheckPoint checkPoint = new CheckPoint();
        addObject(checkPoint,273,142);
        CheckPoint checkPoint2 = new CheckPoint();
        addObject(checkPoint2,499,31);
        CheckPoint checkPoint3 = new CheckPoint();
        addObject(checkPoint3,507,148);
        CheckPoint checkPoint4 = new CheckPoint();
        addObject(checkPoint4,570,405);
        CheckPoint checkPoint5 = new CheckPoint();
        addObject(checkPoint5,343,448);
        CheckPoint checkPoint6 = new CheckPoint();
        addObject(checkPoint6,236,564);
        CheckPoint checkPoint7 = new CheckPoint();
        addObject(checkPoint7,88,330);
        AddSpeed addSpeed = new AddSpeed();
        addObject(addSpeed,47,90);
        AddSpeed addSpeed2 = new AddSpeed();
        addObject(addSpeed2,271,104);
        AddSpeed addSpeed3 = new AddSpeed();
        addObject(addSpeed3,299,568);
        AddSpeed addSpeed4 = new AddSpeed();
        addObject(addSpeed4,214,331);
        AddSpeed addSpeed5 = new AddSpeed();
        addObject(addSpeed5,543,32);
        AddSpeed addSpeed6 = new AddSpeed();
        addObject(addSpeed6,568,465);
        AddSpeed addSpeed7 = new AddSpeed();
        addObject(addSpeed7,170,442);
        MoveHorizontal moveHorizontal = new MoveHorizontal(1);
        addObject(moveHorizontal,512,91);
        MoveHorizontal moveHorizontal2 = new MoveHorizontal(1);
        addObject(moveHorizontal2,158,212);
        MoveHorizontal moveHorizontal3 = new MoveHorizontal(1);
        addObject(moveHorizontal3,336,386);
        MoveHorizontal moveHorizontal4 = new MoveHorizontal(1);
        addObject(moveHorizontal4,518,210);
        MoveHorizontal moveHorizontal5 = new MoveHorizontal(1);
        addObject(moveHorizontal5,214,443);
        MoveVertical moveVertical = new MoveVertical(1);
        addObject(moveVertical,35,403);
        Flag flag = new Flag();
        addObject(flag,534,552);
        CheckPoint checkPoint8 = new CheckPoint();
        addObject(checkPoint8,152,88);
        wallWidthSmall10.act();
        removeObject(wallWidthSmall10);
        removeObject(wallWidthSmall9);
        WallWidthSmall wallWidthSmall20 = new WallWidthSmall();
        addObject(wallWidthSmall20,96,362);
        wallWidthSmall20.setLocation(100,364);
        checkPoint7.setLocation(105,333);

        removeObject(mainCast);
        MainCast mainCast2 = new MainCast();
        addObject(mainCast2,43,28);
    }
    
}
