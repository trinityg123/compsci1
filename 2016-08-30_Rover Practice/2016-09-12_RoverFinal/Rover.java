
/**
 * Write a description of class Rover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rover
{
    // fields
    String name;
    int x;
    int y;
    int dir = 0;// 0=North, 1=East, 2=South, 3=West
    int distance;
    
    public Rover(String name)
    {
        this.name = name;
        this.x = 0;
        this.y = 0;
    }
    
    private void getDirectoryName()
    {
        if (dir == 0)
        {
            System.out.println(name + " is facing North.");
        }
        else if (dir == 1)
        {
            System.out.println(name + " is facing North East.");
        }
        else if (dir == 2)
        {
            System.out.println(name + " is facing East.");
        }
        else if (dir == 3)
        {
            System.out.println(name + " is facing South East.");
        }
        else if (dir == 4)
        {
            System.out.println(name + " is facing South.");
        }
        else if (dir == -3)
        {
            System.out.println(name + " is facing South West.");
        }
        else if (dir == -2)
        {
            System.out.println(name + " is facing West.");
        }
        else if (dir == -1)
        {
            System.out.println(name + " is facing North West.");
            //System.out.println(name + " is at (" + x + ", " + y + ").");
        }
                
    }
    
    public void move()
    {
        getDirectoryName();
        System.out.println("(" + x +  ", " + y + ")");
    }
    
    public void rotateLeft() 
    {
        dir -= 1;
        
        if (dir < -3)
        {
            dir = 4;
        }
        
        System.out.println(name + " turned to the left"); 
        move();
    }
    
    public void rotateRight()
    {
        dir += 1;
        
        if (dir >= 5)
        {
            dir = -4;
        }
        
        System.out.println(name + " turned to the right");
        move();
    }
}
