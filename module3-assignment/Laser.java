import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().scale(50,50);
        move(8);
        laserHitEnemy();
    }
    
     public void laserHitEnemy() {
        if(isTouching(Enemy.class)) {
            removeTouching(Enemy.class);
            // removeTouching(Laser.class);
            getWorld().addObject(new Explode(), getX() + 60, getY());
            getWorld().removeObject(this);
        } else if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
