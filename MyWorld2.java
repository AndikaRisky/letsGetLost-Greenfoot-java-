import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{
    /**
     * Constructor for objects of class MyWorld1.
     * 
     */
    int level = 2;
    public MyWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(590, 590, 1);
        prepare(1);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int speed)
    {

        WallHeightLong wallHeightLong = new WallHeightLong();
        addObject(wallHeightLong,9,81);
        wallHeightLong.setLocation(11,93);
        WallHeightLong wallHeightLong2 = new WallHeightLong();
        addObject(wallHeightLong2,15,291);
        wallHeightLong2.setLocation(11,271);
        WallHeightLong wallHeightLong3 = new WallHeightLong();
        addObject(wallHeightLong3,12,447);
        wallHeightLong3.setLocation(11,451);
        WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,9,579);
        wallHeightSmall.setLocation(11,571);
        WallHeightLong wallHeightLong4 = new WallHeightLong();
        addObject(wallHeightLong4,584,79);
        wallHeightLong4.setLocation(587,94);
        WallHeightLong wallHeightLong5 = new WallHeightLong();
        addObject(wallHeightLong5,586,283);
        wallHeightLong5.setLocation(586,274);
        WallHeightLong wallHeightLong6 = new WallHeightLong();
        addObject(wallHeightLong6,587,455);
        wallHeightLong6.setLocation(586,453);
        WallHeightSmall wallHeightSmall2 = new WallHeightSmall();
        addObject(wallHeightSmall2,585,574);
        wallHeightSmall2.setLocation(587,569);
        wallHeightSmall2.setLocation(587,569);
        WallWidthLong wallWidthLong = new WallWidthLong();
        addObject(wallWidthLong,90,18);
        wallWidthLong.setLocation(105,14);
        WallWidthSmall wallWidthSmall = new WallWidthSmall();
        addObject(wallWidthSmall,218,10);
        wallWidthSmall.setLocation(221,14);
        WallHeightLong wallHeightLong7 = new WallHeightLong();
        addObject(wallHeightLong7,493,14);
        wallHeightLong7.setLocation(479,78);
        removeObject(wallHeightLong7);
        WallWidthLong wallWidthLong2 = new WallWidthLong();
        addObject(wallWidthLong2,496,9);
        wallWidthLong2.setLocation(490,13);
        WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,349,17);
        wallWidthMedium.setLocation(351,13);
        WallHeightSmall wallHeightSmall3 = new WallHeightSmall();
        addObject(wallHeightSmall3,528,39);
        wallHeightSmall3.setLocation(530,49);
        WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,75,126);
        wallWidthMedium2.setLocation(75,128);
        WallHeightSmall wallHeightSmall4 = new WallHeightSmall();
        addObject(wallHeightSmall4,240,48);
        wallHeightSmall4.setLocation(243,49);
        WallHeightLong wallHeightLong8 = new WallHeightLong();
        addObject(wallHeightLong8,356,121);
        wallHeightLong8.setLocation(356,111);
        WallHeightSmall wallHeightSmall5 = new WallHeightSmall();
        addObject(wallHeightSmall5,352,228);
        wallHeightSmall5.setLocation(356,222);
        WallWidthSmall wallWidthSmall2 = new WallWidthSmall();
        addObject(wallWidthSmall2,326,243);
        wallWidthSmall2.setLocation(320,244);
        WallWidthMedium wallWidthMedium3 = new WallWidthMedium();
        addObject(wallWidthMedium3,423,244);
        wallWidthMedium3.setLocation(422,245);
        WallWidthMedium wallWidthMedium4 = new WallWidthMedium();
        addObject(wallWidthMedium4,522,128);
        wallWidthMedium4.setLocation(524,128);
        WallHeightSmall wallHeightSmall6 = new WallHeightSmall();
        addObject(wallHeightSmall6,473,85);
        wallHeightSmall6.setLocation(471,91);
        WallWidthSmall wallWidthSmall3 = new WallWidthSmall();
        addObject(wallWidthSmall3,433,70);
        wallWidthSmall3.setLocation(435,68);
        WallWidthMedium wallWidthMedium5 = new WallWidthMedium();
        addObject(wallWidthMedium5,522,300);
        wallWidthMedium5.setLocation(524,300);
        WallHeightSmall wallHeightSmall7 = new WallHeightSmall();
        addObject(wallHeightSmall7,473,337);
        wallHeightSmall7.setLocation(470,337);
        WallWidthMedium wallWidthMedium6 = new WallWidthMedium();
        addObject(wallWidthMedium6,408,365);
        wallWidthMedium6.setLocation(408,359);
        WallHeightSmall wallHeightSmall8 = new WallHeightSmall();
        addObject(wallHeightSmall8,416,282);
        wallHeightSmall8.setLocation(413,280);
        WallWidthLong wallWidthLong3 = new WallWidthLong();
        addObject(wallWidthLong3,312,298);
        wallWidthLong3.setLocation(316,302);
        WallWidthSmall wallWidthSmall4 = new WallWidthSmall();
        addObject(wallWidthSmall4,204,301);
        wallWidthSmall4.setLocation(204,302);
        WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,242,226);
        wallHeightMedium.setLocation(240,238);
        WallWidthSmall wallWidthSmall5 = new WallWidthSmall();
        addObject(wallWidthSmall5,275,184);
        wallWidthSmall5.setLocation(279,184);
        WallHeightMedium wallHeightMedium2 = new WallHeightMedium();
        addObject(wallHeightMedium2,529,247);
        wallHeightMedium2.setLocation(531,237);
        WallWidthMedium wallWidthMedium7 = new WallWidthMedium();
        addObject(wallWidthMedium7,462,187);
        wallWidthMedium7.setLocation(466,184);
        WallHeightSmall wallHeightSmall9 = new WallHeightSmall();
        addObject(wallHeightSmall9,422,155);
        wallHeightSmall9.setLocation(414,149);

        WallWidthLong wallWidthLong4 = new WallWidthLong();
        addObject(wallWidthLong4,498,588);
        wallWidthLong4.setLocation(490,588);
        WallWidthSmall wallWidthSmall6 = new WallWidthSmall();
        addObject(wallWidthSmall6,392,590);
        wallWidthSmall6.setLocation(378,588);
        WallHeightSmall wallHeightSmall10 = new WallHeightSmall();
        addObject(wallHeightSmall10,527,558);
        wallHeightSmall10.setLocation(531,553);
        WallWidthLong wallWidthLong5 = new WallWidthLong();
        addObject(wallWidthLong5,266,127);
        wallWidthLong5.setLocation(264,127);
        WallHeightSmall wallHeightSmall11 = new WallHeightSmall();
        addObject(wallHeightSmall11,302,85);
        wallHeightSmall11.setLocation(298,92);
        WallHeightSmall wallHeightSmall12 = new WallHeightSmall();
        addObject(wallHeightSmall12,187,162);
        wallHeightSmall12.setLocation(181,165);
        WallHeightSmall wallHeightSmall13 = new WallHeightSmall();
        addObject(wallHeightSmall13,183,91);
        wallHeightSmall13.setLocation(183,91);
        WallWidthSmall wallWidthSmall7 = new WallWidthSmall();
        addObject(wallWidthSmall7,149,186);
        wallWidthSmall7.setLocation(148,186);
        WallHeightSmall wallHeightSmall14 = new WallHeightSmall();
        addObject(wallHeightSmall14,72,163);
        wallHeightSmall14.setLocation(68,164);
        WallWidthMedium wallWidthMedium8 = new WallWidthMedium();
        addObject(wallWidthMedium8,122,70);
        wallWidthMedium8.setLocation(120,69);
        WallHeightMedium wallHeightMedium3 = new WallHeightMedium();
        addObject(wallHeightMedium3,360,533);
        wallHeightMedium3.setLocation(355,525);
        WallWidthMedium wallWidthMedium9 = new WallWidthMedium();
        addObject(wallWidthMedium9,419,531);
        wallWidthMedium9.setLocation(421,533);
        WallHeightSmall wallHeightSmall15 = new WallHeightSmall();
        addObject(wallHeightSmall15,475,501);
        wallHeightSmall15.setLocation(473,496);
        WallWidthSmall wallWidthSmall8 = new WallWidthSmall();
        addObject(wallWidthSmall8,506,474);
        wallWidthSmall8.setLocation(508,474);
        WallWidthSmall wallWidthSmall9 = new WallWidthSmall();
        addObject(wallWidthSmall9,47,474);
        WallHeightSmall wallHeightSmall16 = new WallHeightSmall();
        addObject(wallHeightSmall16,65,507);
        wallHeightSmall16.setLocation(66,511);
        WallWidthLong wallWidthLong6 = new WallWidthLong();
        addObject(wallWidthLong6,98,242);
        wallWidthLong6.setLocation(103,242);
        WallHeightMedium wallHeightMedium4 = new WallHeightMedium();
        addObject(wallHeightMedium4,128,320);
        wallHeightMedium4.setLocation(127,309);
        WallWidthLong wallWidthLong7 = new WallWidthLong();
        addObject(wallWidthLong7,118,588);
        wallWidthLong7.setLocation(109,588);
        WallWidthMedium wallWidthMedium10 = new WallWidthMedium();
        addObject(wallWidthMedium10,242,588);
        wallWidthMedium10.setLocation(248,588);
        WallWidthLong wallWidthLong8 = new WallWidthLong();
        addObject(wallWidthLong8,254,531);
        wallWidthLong8.setLocation(264,533);
        WallWidthSmall wallWidthSmall10 = new WallWidthSmall();
        addObject(wallWidthSmall10,98,415);
        wallWidthSmall10.setLocation(89,415);
        WallHeightMedium wallHeightMedium5 = new WallHeightMedium();
        addObject(wallHeightMedium5,62,357);
        wallHeightMedium5.setLocation(66,353);
        WallWidthLong wallWidthLong9 = new WallWidthLong();
        addObject(wallWidthLong9,209,474);
        wallWidthLong9.setLocation(218,476);
        WallHeightMedium wallHeightMedium6 = new WallHeightMedium();
        addObject(wallHeightMedium6,296,429);
        wallHeightMedium6.setLocation(300,411);
        WallWidthMedium wallWidthMedium11 = new WallWidthMedium();
        addObject(wallWidthMedium11,239,357);
        wallWidthMedium11.setLocation(235,357);
        WallHeightSmall wallHeightSmall17 = new WallHeightSmall();
        addObject(wallHeightSmall17,185,398);
        wallHeightSmall17.setLocation(182,396);
        WallHeightSmall wallHeightSmall18 = new WallHeightSmall();
        addObject(wallHeightSmall18,245,445);
        wallHeightSmall18.setLocation(239,439);
        WallWidthLong wallWidthLong10 = new WallWidthLong();
        addObject(wallWidthLong10,422,416);
        wallWidthLong10.setLocation(398,416);
        WallWidthSmall wallWidthSmall11 = new WallWidthSmall();
        addObject(wallWidthSmall11,506,416);
        wallWidthSmall11.setLocation(510,416);
        WallHeightSmall wallHeightSmall19 = new WallHeightSmall();
        addObject(wallHeightSmall19,413,460);
        wallHeightSmall19.setLocation(416,454);
        WallHeightSmall wallHeightSmall20 = new WallHeightSmall();
        addObject(wallHeightSmall20,525,382);
        wallHeightSmall20.setLocation(532,382);
        MainCast mainCast = new MainCast();
        addObject(mainCast,326,579);
        MoveHorizontal moveHorizontal = new MoveHorizontal(speed);
        addObject(moveHorizontal,153,214);
        MoveHorizontal moveHorizontal2 = new MoveHorizontal(speed);
        addObject(moveHorizontal2,289,327);
        MoveVertical moveVertical = new MoveVertical(speed);
        addObject(moveVertical,561,397);
        MoveVertical moveVertical2 = new MoveVertical(speed);
        addObject(moveVertical2,386,149);
        Flag flag = new Flag();
        addObject(flag,293,54);
        MoveVertical moveVertical3 = new MoveVertical(speed);
        addObject(moveVertical3,160,278);
        moveVertical3.setLocation(154,282);
        AddSpeed addSpeed = new AddSpeed();
        addObject(addSpeed,97,159);
        CheckPoint checkPoint = new CheckPoint();
        addObject(checkPoint,38,161);
        CheckPoint checkPoint2 = new CheckPoint();
        addObject(checkPoint2,216,390);
        AddSpeed addSpeed2 = new AddSpeed();
        addObject(addSpeed2,266,387);
        AddSpeed addSpeed3 = new AddSpeed();
        addObject(addSpeed3,561,220);
        CheckPoint checkPoint3 = new CheckPoint();
        addObject(checkPoint3,554,157);
        AddSpeed addSpeed4 = new AddSpeed();
        addObject(addSpeed4,72,446);
        CheckPoint checkPoint4 = new CheckPoint();
        addObject(checkPoint4,41,502);
        AddSpeed addSpeed5 = new AddSpeed();
        addObject(addSpeed5,318,216);
        CheckPoint checkPoint5 = new CheckPoint();
        addObject(checkPoint5,385,272);
        AddSpeed addSpeed6 = new AddSpeed();
        addObject(addSpeed6,507,100);
        CheckPoint checkPoint6 = new CheckPoint();
        addObject(checkPoint6,433,41);
        AddSpeed addSpeed7 = new AddSpeed();
        addObject(addSpeed7,404,558);
        CheckPoint checkPoint7 = new CheckPoint();
        addObject(checkPoint7,266,558);
        AddSpeed addSpeed8 = new AddSpeed();
        addObject(addSpeed8,274,505);
        removeObject(wallWidthSmall5);
        removeObject(wallWidthLong5);
        WallWidthLong wallWidthLong11 = new WallWidthLong();
        addObject(wallWidthLong11,267,127);
        wallWidthLong11.setLocation(268,128);
        removeObject(wallHeightSmall12);
        WallHeightSmall wallHeightSmall21 = new WallHeightSmall();
        addObject(wallHeightSmall21,186,154);
        wallHeightSmall21.setLocation(185,164);
        removeObject(wallHeightSmall13);
        WallHeightSmall wallHeightSmall22 = new WallHeightSmall();
        addObject(wallHeightSmall22,183,91);
        wallHeightSmall22.setLocation(185,92);

        WallHeightLong wallHeightLong9 = new WallHeightLong();
        addObject(wallHeightLong9,125,522);
        wallHeightLong9.setLocation(124,498);
        removeObject(wallWidthSmall9);
        WallWidthSmall wallWidthSmall12 = new WallWidthSmall();
        addObject(wallWidthSmall12,46,479);
        wallWidthSmall12.setLocation(44,479);
        removeObject(wallHeightSmall17);
        removeObject(wallWidthMedium11);
        WallWidthMedium wallWidthMedium12 = new WallWidthMedium();
        addObject(wallWidthMedium12,222,355);
        wallWidthMedium12.setLocation(241,359);
        WallHeightSmall wallHeightSmall23 = new WallHeightSmall();
        addObject(wallHeightSmall23,191,417);
        wallHeightSmall23.setLocation(188,397);
        removeObject(wallWidthMedium3);
        WallWidthMedium wallWidthMedium13 = new WallWidthMedium();
        addObject(wallWidthMedium13,404,244);
        wallWidthMedium13.setLocation(415,244);
        removeObject(wallWidthSmall8);
        WallWidthSmall wallWidthSmall13 = new WallWidthSmall();
        addObject(wallWidthSmall13,488,478);
        wallWidthSmall13.setLocation(499,473);
        removeObject(wallHeightSmall2);
        WallHeightSmall wallHeightSmall24 = new WallHeightSmall();
        addObject(wallHeightSmall24,570,571);
        wallHeightSmall24.setLocation(590,563);
        removeObject(wallHeightSmall24);
        WallHeightSmall wallHeightSmall25 = new WallHeightSmall();
        addObject(wallHeightSmall25,584,565);
        wallHeightSmall25.setLocation(586,566);
        removeObject(wallHeightLong4);
        WallHeightLong wallHeightLong10 = new WallHeightLong();
        addObject(wallHeightLong10,588,89);
        wallHeightLong10.setLocation(586,96);
        removeObject(wallHeightSmall7);
        WallHeightSmall wallHeightSmall26 = new WallHeightSmall();
        addObject(wallHeightSmall26,479,335);
        wallHeightSmall26.setLocation(471,337);
        removeObject(wallWidthMedium7);
        WallWidthMedium wallWidthMedium14 = new WallWidthMedium();
        addObject(wallWidthMedium14,461,180);
        wallWidthMedium14.setLocation(467,184);
        removeObject(wallHeightLong);
        WallHeightLong wallHeightLong11 = new WallHeightLong();
        addObject(wallHeightLong11,15,103);
        wallHeightLong11.setLocation(11,97);
        removeObject(wallHeightSmall);
        WallHeightSmall wallHeightSmall27 = new WallHeightSmall();
        addObject(wallHeightSmall27,12,560);
        wallHeightSmall27.setLocation(11,566);
        checkPoint6.setLocation(476,44);
        CheckPoint checkPoint8 = new CheckPoint();
        addObject(checkPoint8,449,387);
        removeObject(mainCast);
        MainCast mainCast2 = new MainCast();
        addObject(mainCast2,324,561);
    }
}
