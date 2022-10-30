import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explode extends Actor
{
    /**
     * Act - do whatever the Explode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int timerExplode = 0;
    public void act()
    {
        // Add your action code here.
        if (timerExplode == 60) {
            getWorld().removeObject(this);
            timerExplode = 0;
        } else {
            timerExplode++;
        }
    }
}
