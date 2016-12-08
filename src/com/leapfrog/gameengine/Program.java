/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.gameengine;

import com.leapfrog.gameengine.Entity.Player;
import com.leapfrog.gameengine.Factory.GameFactory;
import com.leapfrog.gameengine.command.GameCommand;
import java.util.Scanner;

/**
 *
 * @author punoj123
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("======================================================");
        System.out.println("welcome to text based game!");
        System.out.println("======================================================");
        Player player = new Player();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("enter your name");
            String name = input.next();
            player.setName(name);
            System.out.println("enter your command");
            GameCommand comand = GameFactory.get(input.next());
            
            if (comand != null) {
                
                comand.execute(player);
            } else {
                
                System.out.println("invalid Command!");
            }
            
            System.out.println("do you want to continue?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                System.exit(0);
            }
            
        }
        
    }
    
}
