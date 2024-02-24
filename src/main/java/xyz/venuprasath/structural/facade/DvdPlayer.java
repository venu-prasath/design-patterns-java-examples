package xyz.venuprasath.structural.facade;

class DvdPlayer {
    void on() {
        System.out.println("DVD Player is on.");
    }

    void play(String movie) {
        System.out.println("Playing \"" + movie + "\".");
    }

    void stop() {
        System.out.println("DVD Player is stopped.");
    }

    void off() {
        System.out.println("DVD Player is off.");
    }
}