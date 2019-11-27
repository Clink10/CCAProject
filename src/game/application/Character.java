package game.application;

public abstract class Character implements Lookable {

    private Bag bag;
    private final String NAME;
    private int life;

    /**
     * 
     * @param place
     * @param NAME
     * @param life
     */
    public Character(String NAME, int life) {
        this.NAME = NAME;
        this.life = life;
        this.bag = new Bag();
    }

    /**
     * 
     * @param Item
     */
    public void addItem(int Item) {
        
    }

    /**
     * 
     * @param Item
     */
    public void removeItem(int Item) {
        // TODO - implement Character.removeItem
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return
     */
    public String getNAME() {
        return NAME;
    }

    /**
     *
     * @return
     */
    public int getLife() {
        return life;
    }

    /**
     *
     * @param life
     */
    public void setLife(int life) {
        this.life = life;
    }
    
    
    @Override
    public String toString() {
        return this.NAME + " \n"
             + "life: " + this.life; 
    }
    
}