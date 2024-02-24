package xyz.venuprasath.structural.facade;

class HomeTheaterFacade {
    private Projector projector;
    private DvdPlayer dvdPlayer;
    private SoundSystem soundSystem;

    HomeTheaterFacade(Projector projector, DvdPlayer dvdPlayer, SoundSystem soundSystem) {
        this.projector = projector;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
    }

    void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        soundSystem.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    void endMovie() {
        System.out.println("Shutting down movie theater...");
        dvdPlayer.stop();
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
    }
}
