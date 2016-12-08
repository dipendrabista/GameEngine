/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.gameengine.command;

import com.leapfrog.gameengine.Entity.Player;

/**
 *
 * @author punoj123
 */
public class ExitCommand extends GameCommand {
    
    @Override
    public void execute(Player player) {
        System.out.println("game is closing..............................");
        System.exit(0);
    }
    
}
