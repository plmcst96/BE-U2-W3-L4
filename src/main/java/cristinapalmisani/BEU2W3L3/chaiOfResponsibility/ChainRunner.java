package cristinapalmisani.BEU2W3L3.chaiOfResponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Ufficiale capitano = new GradoUfficiale("Capitano", 1000);
        Ufficiale maggiore = new GradoUfficiale("Maggiore", 2000);
        Ufficiale tenente = new GradoUfficiale("Tenente", 3000);
        Ufficiale colonnello = new GradoUfficiale("Colonnello", 4000);
        Ufficiale generale = new GradoUfficiale("Generale", 5000);

        Ufficiale catena = Ufficiale.link(capitano, maggiore, tenente, colonnello, generale);

        catena.check(1000);
    }
}
