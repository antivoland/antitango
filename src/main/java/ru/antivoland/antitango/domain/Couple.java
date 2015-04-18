package ru.antivoland.antitango.domain;

// todo: distance between leader's and follower's chests
// todo: leader's twist angle
// todo: distance from start point along the circle of dance
public class Couple {
    public static class Position {
        Double distance; // radial coordinate
        Double angle; // angular coordinate
    }

    Style style;
    Leader leader;
    Follower follower;
    Embrace embrace;
    Lift lift;
    Position position;
}
