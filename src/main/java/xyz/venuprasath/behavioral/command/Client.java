package xyz.venuprasath.behavioral.command;

public class Client {

    public static void main(String[] args) {
        Light light = new Light();

        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        RemoteControl control = new RemoteControl();

        control.setCommand(lightsOn);
        control.pressButton();

        control.setCommand(lightsOff);
        control.pressButton();
    }
}
