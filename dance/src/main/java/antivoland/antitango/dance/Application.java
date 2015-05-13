package antivoland.antitango.dance;

import antivoland.antitango.dance.domain.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    private static final int COUPLES = 30;

    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);

        log.info("ANTITANGO DANCE");
        Room room = Room.create(COUPLES);
        log.info("ROOM WITH " + room.couples.size() + " COUPLES CREATED");
    }
}
