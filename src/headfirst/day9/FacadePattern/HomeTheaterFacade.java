package headfirst.day9.FacadePattern;

/**
 * 家庭影院----外观类
 */
public class HomeTheaterFacade {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amp(), new DVD(), new Light(), new Popper(), new Projector());
        homeTheaterFacade.watchMovie("speed 8");
        homeTheaterFacade.endMovie();
    }


    public void watchMovie(String movie) {
        System.out.println("Get Ready to watch movie");
        popper.on();
        popper.pop();
        light.dim(10);
        projector.on();
        projector.wideScreemMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolum(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down");

        popper.off();
        amp.off();
        dvd.off();
        light.off();
        popper.off();
        projector.off();
    }

    Amp amp;
    DVD dvd;
    Light light;
    Popper popper;
    Projector projector;

    public HomeTheaterFacade(Amp amp, DVD dvd, Light light, Popper popper, Projector projector) {
        this.amp = amp;
        this.dvd = dvd;
        this.light = light;
        this.popper = popper;
        this.projector = projector;
    }
}
