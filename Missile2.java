import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile2 extends Missile
{
    /**
     * Act - do whatever the Missile2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Missile2()
    {
        super(3);
    }
    
    
    public void act() 
    {
        // Add your action code here.
        
        drop();
    }   
    
    public void drop()
    {
        
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        else
        {
            applyGravity();
        }
    }
}
