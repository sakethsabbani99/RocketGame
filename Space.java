import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static Rocket rocket;
    
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        rocket = new Rocket(2);
        addObject(rocket, getWidth()/2, getHeight()/2);
        addObject(new Asteroids(),203,127);
        addObject(new Asteroids(2,2,1),510,88);
    }
    
    public void act()
    {
        showText("score:"+rocket.score+"    lives"+rocket.lives,100,50);
        youWin();
        gameOver();
    }
    public void youWin()
    {
        if(rocket.score == 4)
        {
            addObject(new YouWin(),getWidth()/2,getHeight()/2);
            Greenfoot.stop();
        }
    }
    public void gameOver()
    {
        if(rocket.lives ==0)
        {
            addObject(new GameOver(),getWidth()/2,getHeight()/2);
            Greenfoot.stop();
        }
    }
    
}
