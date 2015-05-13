package ru.antivoland.antitango.domain;

// todo: distance between leader's and follower's chests
// todo: leader's twist angle
// todo: distance from start point along the circle of dance
public class Couple {
    public static class Position {
        public Double distance; // radial coordinate
        public Double angle; // angular coordinate
    }

    public Style style;
    public Leader leader;
    public Follower follower;
    public Embrace embrace;
    public Lift lift;
    public Position position;

    public static Couple create(Position position) {
        Couple couple = new Couple();
        couple.style = Style.CLASSIC;
        couple.leader = Leader.create();
        couple.follower = Follower.create();
        couple.embrace = Embrace.OPEN;
        couple.lift = Lift.STRAIGHT;
        couple.position = position;
        return couple;
    }
}
