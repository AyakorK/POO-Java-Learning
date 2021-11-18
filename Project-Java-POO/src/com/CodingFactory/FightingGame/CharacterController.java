package com.CodingFactory.FightingGame;

import java.util.*;

public class CharacterController {

    private ArrayList<Characters> Characters;

    public CharacterController() {
        this.Characters = new ArrayList<Characters>();

    }


    public void saveCharacter(Characters Character) {

        this.Characters.add(Character);
    }

    public ArrayList getCharacters() {
        return this.Characters;
    }

}
