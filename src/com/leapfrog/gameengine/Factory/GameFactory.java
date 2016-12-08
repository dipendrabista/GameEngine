/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.gameengine.Factory;

import com.leapfrog.gameengine.command.ExitCommand;
import com.leapfrog.gameengine.command.GameCommand;
import com.leapfrog.gameengine.command.MoveCommand;
import com.leapfrog.gameengine.command.RunCommand;
import com.sun.java.accessibility.util.EventID;

/**
 *
 * @author punoj123
 */
public class GameFactory {

    public static GameCommand get(String key) {
        if (key.equalsIgnoreCase("move")) {
            return new MoveCommand();
        }
        else if(key.equalsIgnoreCase("run"))
        {
        
        return new RunCommand();
        }
        else if(key.equalsIgnoreCase("exit"))
        {
        return new ExitCommand();
        
        }
        else
        {
        return null;
        
        }

    }
}
