import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Botecito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Botecito extends Actor
{
    /**
     * Act - do whatever the Botecito wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Boolean canFire = true;
    public  Botecito(){
        
        }
    
 public void act ()
{
    if(Greenfoot.isKeyDown("D")){
         setLocation(getX()+5, getY());
         setRotation(90);
        }
        
    else if(Greenfoot.isKeyDown("A")){
         setLocation(getX()-5, getY());
         setRotation(270);
    }
    else if(Greenfoot.isKeyDown("W")){
        setLocation(getX(), getY()-5);
        setRotation(360);
    }    
    else if(Greenfoot.isKeyDown("S")){
        setLocation(getX(), getY()+5);
        setRotation(180);
    }
    fireProjectile();
}
//Accion de dispoaro para disparar
    public void fireProjectile()
    {
        if(Greenfoot.isKeyDown("space") && canFire == true){
            getWorld().addObject(new Calavera(), getX () ,getY()-30 );
            canFire = false;
            
        } else if(!Greenfoot.isKeyDown("space")){
            canFire =true;   
        }
        
    

        

}
 }
