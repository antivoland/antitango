package ru.antivoland.antitango.domain;

public class Follower extends Dancer {
    public static Follower create() {
        Follower follower = new Follower();
        follower.chest = new Chest();
        follower.chest.twist = Twist.STRAIGHT;
        follower.hips = new Hips();
        follower.hips.twist = Twist.STRAIGHT;
        return follower;
    }
}
