import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author Anderson Camacho
 * @email: camachosinh@gmail.com
 * @version general 1.5
 */
class Calavera extends Actor
{
   
    private int direccion;
   
    public void addedToWorld(World world){
        direccion = getWorld().getObjects(Botecito.class).get(0).getRotation();
    }
   
    public void act()
    {
        movimientoProyectil();
        quitarDelMundo();
    }
   
    public void movimientoProyectil()
    {
        if (direccion == 360 || direccion == 0){
        setLocation(getX(), getY()-10);
        }
        else if (direccion == 180){
        setLocation(getX(), getY()+10);    
        }
        else if (direccion == 90){
        setLocation(getX()+10, getY());
        
        }
        else if (direccion == 270){
        setLocation(getX()-10, getY());
        
        }
    }
   
    public void quitarDelMundo()
    {
        if(getY() == 0 || getX() == 0 || getX() == getWorld().getWidth()-1 || getY() == getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);
        }
    }
}


