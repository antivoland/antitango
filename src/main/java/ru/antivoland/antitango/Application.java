package ru.antivoland.antitango;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.antivoland.antitango.domain.Room;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    private static final int COUPLES = 30;

    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);

        Room room = Room.create(COUPLES);
        log.info("ROOM WITH " + room.couples.size() + " COUPLES CREATED");
    }
}
