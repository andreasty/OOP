import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveHero();
    }
    
    public void moveHero(){
        int y = getY();
        int x = getX();
        
        if(Greenfoot.isKeyDown("w")|| Greenfoot.isKeyDown("up")){
            setLocation(getX(), y-3);
        }
        
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            setLocation(getX(), y+3);
        }
        
        if(Greenfoot.isKeyDown("a")|| Greenfoot.isKeyDown("left")){
            setLocation(x-3, y);   
        }
        
        if(Greenfoot.isKeyDown("d")|| Greenfoot.isKeyDown("right")){
            setLocation(x+3, y);   
        }
        
        if(Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("d")){
            setLocation(x+3, y-3);
        }
        
        if(Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("a")){
            setLocation(x-3, y-3);
        }
        
        if(Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("d")){
            setLocation(x+3, y+3);
        }
        
        if(Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("a")){
            setLocation(x-3, y+3);
        }
    }
    
    int laserTimer = 0;
    public void laserTimer(){
        if(laserTimer == 30){
            getWorld().addObject(new Laser(), getX() +5, getY());
            laserTimer = 0;
        }
        else{
            laserTimer++;
        }
    }
    
}
