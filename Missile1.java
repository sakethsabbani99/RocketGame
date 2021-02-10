import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile1 extends Missile
{
    /**
     * Act - do whatever the Missile1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   
    
    public Missile1()
    {
        super(2);
    }
    
    
    public void act() 
    {
        // Add your action code here.
        move(4);
        
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        if(gravity <= 8)
        {
            drop();
        } 
    }   
    
    public void drop()
    {
        applyGravity();
    }
    
}
