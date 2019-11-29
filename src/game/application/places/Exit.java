package game.application.places;

import game.application.character.Character;
import game.application.exceptions.LockedExitException;

public class Exit {
    
    private final String DESCRIPTION;

    public Exit(String Description) {
        this.DESCRIPTION = Description;
    }
    
    public boolean canPass(Character c) throws LockedExitException {
        if(c.getLife() < 1) {
            throw new LockedExitException();
        }
        return true;
    }

    public String getDescription() {
        return DESCRIPTION;
    }
}