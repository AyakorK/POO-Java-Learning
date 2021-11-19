package com.CodingFactory.FightingGame;

import java.util.*;

// Create a controller that will allow us to stock our characters


    //Create an ArrayList Characters

    private ArrayList<Characters> Characters;

    // Create two objects Player1 and Player2

    private Object Player1;
    private Object Player2;


    // Let the constructor be a new ArrayList of our Characters

    public CharacterController() {
        this.Characters = new ArrayList<Characters>();

    }

// Save our characters when asked by adding him to the ArrayList

    public void saveCharacter(Characters Character) {

        this.Characters.add(Character);
    }

    // When we want to get our ArrayList, ask to get it by returning it

    public ArrayList getCharacters() {
        return this.Characters;
    }

    // Get our Player1 by assigning him to the Character we selected first

    public Characters getPlayer1() {
        return (com.CodingFactory.FightingGame.Characters) this.Player1;
    }

    // Let's create our Player1 by assigning him to the Character we selected first

    public void setPlayer1(Characters Player1) {
        this.Player1 = Player1;
    }


    // Get our Player2

    public Characters getPlayer2() {
        return (com.CodingFactory.FightingGame.Characters) this.Player2;
    }


    // Create our second player by assigning him to the Character we selected in a second time

    public void setPlayer2(Characters Player2) {
        this.Player2 = Player2;
    }

}
