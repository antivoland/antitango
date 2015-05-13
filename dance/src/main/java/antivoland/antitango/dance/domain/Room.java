package antivoland.antitango.dance.domain;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private static double DISTANCE = 5.0;

    public Music music;
    public List<Couple> couples;

    public static Room create(int couples) {
        Room room = new Room();
        room.music = Music.CLASSIC;
        room.couples = new ArrayList<>();
        for (int i = 0; i < couples; ++i) {
            Couple.Position position = new Couple.Position();
            position.distance = DISTANCE;
            position.angle = 2 * Math.PI * i / couples;
            room.couples.add(Couple.create(position));
        }
        return room;
    }
}
