package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

/**
 * Command to open the spaceship's door and update the game score
 * @author Kyle Szombathy
 *
 */
public class COpenDoorUpdateScore extends Command {
    private GameWorld gameWorld;

    /**
     * Constructor that passes command name and gameWorld object
     * @param commandName Name of the command
     * @param gameWorld Object necessary to use in actionPerformed
     */
    public COpenDoorUpdateScore(String commandName, GameWorld gameWorld) {
        super(commandName);
        this.gameWorld = gameWorld;
    }

    /**
     * Perform the action related to this commands name
     */
    @Override
    public void actionPerformed(ActionEvent evt) {
        gameWorld.openDoorAndUpdateScore();
    }
}