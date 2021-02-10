import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Missile extends Actor
{
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int gravity;
    public Missile(int imageSize)
    {
        getImage().scale(getImage().getWidth()/imageSize, getImage().getHeight()/imageSize);
    }
    
    abstract public void drop();
    
    public void applyGravity()
    {
        gravity++;
        setLocation(getX(),getY()+gravity);
    }
    
    public void act() 
    {
         // Add your action code here.
    }    
}
