package xyz.venuprasath.structural.flyweight;

public class TextEditor {

    public static void main(String[] args) {
        TextCharacterFactory factory = new TextCharacterFactory();

        // Simulating characters in a text editor
        factory.getCharacter('a', "Arial", 12, "black").display(10, 10);
        factory.getCharacter('b', "Arial", 12, "black").display(15, 10);
        // Reusing character 'a' flyweight
        factory.getCharacter('a', "Arial", 12, "black").display(20, 10);
        // New character with different properties
        factory.getCharacter('c', "Times New Roman", 14, "blue").display(25, 10);
    }
}
