
/**
 * Write a description of class Rover_Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Rover_Runner
{        
    
    public static void main(String args[]){
        // Make a Scanner
        SimpleScanner input = new SimpleScanner();
        
        System.out.println("What is your rover's name?");
        String name;
        name = input.readString();
        System.out.println("Your rover is " + name + ".");
        
        boolean running = true;
        String exitCommand = "quit";
        
        while (running) {                
            Rover r1 = new Rover(name);
            System.out.println();
            System.out.println("Commands");
            System.out.println("move: To move a distance forward.");
            System.out.println("right: to turn right.");
            System.out.println("left: to turn left.");
            System.out.println("picture: to take a picture.");
            System.out.println("quit: to stop the program.");
            System.out.println();
            
            System.out.println("Enter a command:");
            String command = input.readString();
            if(command.equals("move")){
                r1.move();
                System.out.println("Enter a distance to move:");
                String distance = input.readString();
                System.out.println(name + " moved " + distance + " miles.");
            }
            else if(command.equals("right")){
                r1.rotateRight();
            }
            else if(command.equals("left")){
                r1.rotateLeft();
            }
            else if(command.equals("picture")){
                
            }
            else if(command.equals("quit")){
                running = false;
            }
            else{
                System.out.print("Invalid Command");
            }
        }
        System.out.println("Goodbye");
    }
}
