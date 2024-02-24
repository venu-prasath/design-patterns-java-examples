package xyz.venuprasath.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class TextCharacterFactory {
    private Map<String, TextCharacterFlyweight> flyweights = new HashMap<>();

    public TextCharacterFlyweight getCharacter(char character, String fontFamily, int fontSize, String color) {
        String key = "" + character + fontFamily + fontSize + color;
        TextCharacterFlyweight flyweight = flyweights.get(key);
        if (flyweight == null) {
            flyweight = new ConcreteTextCharacter(character, fontFamily, fontSize, color);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
