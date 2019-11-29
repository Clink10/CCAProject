/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.application.character;

import game.application.Usable;

/**
 *
 * @author Fabien
 */
public class Hero extends Character {
    
    private String location;
    public Hero(String NAME, int life) {
        super(NAME, life);
    }
    
    @Override
    public String toString() {
        return super.toString() + this.location;
    }

}
