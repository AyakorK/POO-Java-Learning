package com.CodingFactory.FightingGame;

import java.util.*;

public class CharacterController {

    private ArrayList<Characters> Characters;

    private Object Player1;
    private Object Player2;

    public CharacterController() {
        this.Characters = new ArrayList<Characters>();

    }


    public void saveCharacter(Characters Character) {

        this.Characters.add(Character);
    }

    public ArrayList getCharacters() {
        return this.Characters;
    }

    public Object getPlayer1() {
        return this.Player1;
    }

    public void setPlayer1(Object Player1) {
        this.Player1 = Player1;
    }

    public Object getPlayer2() {
        return this.Player2;
    }

    public void setPlayer2(Object Player2) {
        this.Player2 = Player2;
    }

}
