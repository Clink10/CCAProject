package game.application;

import game.application.exceptions.NonExistantPlaceException;
import game.application.exceptions.LockedExitException;
import game.application.exceptions.NonExistantLookableException;
import game.application.exceptions.NonLookableException;
import game.stockage.Stockage;
import java.util.List;

public class Game {

    private List<Place> places;
    private Place currentHeroPlace; 
    private Character hero;

    public Game() {
    }
    
    /**
     * Recup the data and initialize the differents components.
     */
    public void initializeGame() {
        Stockage s = new Stockage();
        this.places = s.getDataGame();
        this.hero = new Hero("hero", 100);
        this.currentHeroPlace = this.places.get(0);
    }

    /**
     * 
     * @param i
     * @return 
     */
    public Item take(Item i) {
            // TODO - implement Game.take
            throw new UnsupportedOperationException();
    }

    /**
     * Check if a Place with a name equals to the string location exists
     * near the actual Place. If it is the case then change the actual place
     * to the founded one. Return the new Place if successfull else a 
     * NonExistantPlaaceException.
     * 
     * @param location
     * @return 
     * @throws game.application.exceptions.NonExistantPlaceException
     * @throws game.application.exceptions.LockedExitException
     */
    public Place go(String location) throws NonExistantPlaceException, LockedExitException{
        Place placeOut = null;
        Exit e = this.currentHeroPlace.getExit(location);
        if(e == null) {
            throw new NonExistantPlaceException();
        }
        
        if(e.canPass(this.hero)) {
            for(Place p : this.places) {
                if(p.getNAME().equals(location)) {
                    placeOut = p;
                }
            }                                               
            this.currentHeroPlace = placeOut;
        }   
        return placeOut;
    }
    
    public Lookable look(String s) throws NonLookableException, NonExistantLookableException {
        Lookable l;
        Item i = this.getHeroPlace().getItemByName(s);
        
        if(i != null) {
            if(i instanceof Lookable) {
                l = i;
            }
            else {
                throw new NonLookableException();
            }
        }
        else {
            throw new NonExistantLookableException();
        }
        
        return l;
    }

    /**
     * 
     * @param s
     */
    private boolean existsPlace(String s) {
            // TODO - implement Game.existsPlace
            throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param item
     */
    public void use(String item) {
            // TODO - implement Game.use
            throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param item1
     * @param item2
     */
    public void use(String item1, String item2) {
            // TODO - implement Game.use
            throw new UnsupportedOperationException();
    }

    public Place getHeroPlace() {
        return currentHeroPlace;
    }

}