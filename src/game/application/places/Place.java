package game.application.places;

import game.application.items.Item;
import game.application.character.Character;
import java.util.*;

public class Place {
    
    private final String NAME;
    private final String DESCRIPTION;
    private final List<Character> CHARACTERS;
    private final Map<String, Exit> EXITS;
    private final List<Item> ITEMS;

    public Place(String NAME, String DESCRIPTION, List<Character> CHARACTERS, Map<String, Exit> EXITS, List<Item> ITEMS) {
        this.NAME = NAME;
        this.CHARACTERS = CHARACTERS;
        this.EXITS = EXITS;
        this.ITEMS = ITEMS;
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public Exit getExit(String s) {       
        return this.EXITS.get(s);
    }
    
    public List<Item> getItems() {
            // TODO - implement Place.getItems
            throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param s
     * @return 
     */
    public Item getItemByName(String s) {
        for(Item i : this.ITEMS) {
            if(i.getNAME().equalsIgnoreCase(s)) {
                return i;
            }
        }
        return null;
    }

    /**
     * 
     * @param s
     * @return 
     */
    public Character getCharacterByName(String s) {
        for(Character c : this.CHARACTERS) {
            if(c.getNAME().equalsIgnoreCase(s)) {
                return c;
            }
        }
        return null;
    }
    
    public List<Character> getCharacters() {
        return this.CHARACTERS;
    }

    public String getNAME() {
        return NAME;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }
    
    @Override
    public String toString() {
        return this.NAME + "\n"
            + "   Description: " + this.DESCRIPTION;
    }
}