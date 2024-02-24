package xyz.venuprasath.structural.flyweight;

class ConcreteTextCharacter implements TextCharacterFlyweight {
    private char character;
    private String fontFamily;
    private int fontSize;
    private String color;

    public ConcreteTextCharacter(char character, String fontFamily, int fontSize, String color) {
        this.character = character;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.color = color;
    }

    @Override
    public void display(int positionX, int positionY) {
        System.out.println("Displaying '" + character + "' at (" + positionX + "," + positionY + ") [" + fontFamily + "-" + fontSize + "-" + color + "]");
    }
}
