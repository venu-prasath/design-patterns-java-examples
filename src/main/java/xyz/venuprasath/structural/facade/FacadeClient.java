package xyz.venuprasath.structural.facade;

public class FacadeClient {

    public static void main(String[] args) {
        Projector projector = new Projector();
        DvdPlayer dvdPlayer = new DvdPlayer();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, dvdPlayer, soundSystem);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
