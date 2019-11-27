/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.stockage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import game.application.Hero;
import game.application.Character;
import game.application.Place;
import java.util.List;

/**
 *
 * @author Fabien
 */
public class Stockage {
    
    public List<Place> getDataGame() {
        
        RuntimeTypeAdapterFactory<Character> runtimeTypeAdapterFactory;
        runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory
                .of(Character.class, "type")
                .registerSubtype(Hero.class, "hero");

        Gson g = new GsonBuilder()
            .registerTypeAdapterFactory(runtimeTypeAdapterFactory)
            .create();
        List<Place> lp = g.fromJson("["
                                    + "{"
                                        +"\"NAME\": \"test\","
                                        +"\"DESCRIPTION\": \"premiere place, il y a un item1 et un item2\","
                                        +"\"CHARACTERS\": ["
                                                        + "{"
                                                               +"\"type\": \"hero\","
                                                               +"\"NAME\": \"testCharMap1\","
                                                               +"\"life\": 100,"
                                                               +"\"location\": \"location1\""
                                                        + "},"
                                                        + "{"
                                                               +"\"type\": \"hero\","
                                                               +"\"NAME\": \"test2CharMap1\","
                                                               +"\"life\": 100,"
                                                               +"\"location\": \"location2\""
                                                        + "}"
                                                       +"],"
                                        +"\"EXITS\": {"
                                                    + "\"test2\": {"
                                                           +"\"DESCRIPTION\": \"testExit\""
                                                    + "}"
                                                  +"},"
                                        +"\"ITEMS\": ["
                                                        + "{"                                                               
                                                               +"\"NAME\": \"item1\","
                                                               +"\"DESCRIPTION\": \"blablabla1\""
                                                        + "},"
                                                        + "{"
                                                               +"\"NAME\": \"item2\","
                                                               +"\"DESCRIPTION\": \"blablabla2\""
                                                        + "}"
                                                  +"]"
                                    + "},"
                                    + "{"
                                        +"\"NAME\": \"test2\","
                                        +"\"DESCRIPTION\": \"deuxieme place\","
                                        +"\"CHARACTERS\": ["
                                                        + "{"
                                                               +"\"type\": \"hero\","
                                                               +"\"NAME\": \"testCharMap2\","
                                                               +"\"life\": 100"
                                                        + "},"
                                                        + "{"
                                                               +"\"type\": \"hero\","
                                                               +"\"NAME\": \"test2CharMap2\","
                                                               +"\"life\": 100"
                                                        + "}"
                                                       +"],"
                                        +"\"EXITS\": {"
                                                    + "\"test\":{"
                                                           +"\"DESCRIPTION\": \"testExit\""
                                                    + "}"
                                                  +"},"
                                        +"\"ITEMS\": ["
                                                        + "{"
                                                               +"\"NAME\": \"item3\","
                                                               +"\"DESCRIPTION\": \"blabla3\""
                                                        + "},"
                                                        + "{"
                                                               +"\"NAME\": \"item4\","
                                                               +"\"DESCRIPTION\": \"blabla4\""
                                                        + "}"
                                                       +"]"
                                    + "}"
                                  + "]", new TypeToken<List<Place>>(){}.getType());
        return lp;
    }
    
    /*
    public static void main(String[] args) {
        
        Stockage s = new Stockage();
        List<Place> lp = s.getDataGame();
        System.out.println(lp.get(0).getNAME());
        System.out.println(lp.get(0).getDESCRIPTION());
        System.out.println(lp.get(0).getExit("test2").getDescription());
        System.out.println(lp.get(0).getCharacters().get(0).toString());
        System.out.println(lp.get(1).getNAME());
        System.out.println(lp.get(1).getDESCRIPTION());

    }*/
}
