package antivoland.antitango.dance.domain;

public class Leader extends Dancer {
    public static Leader create() {
        Leader leader = new Leader();
        leader.chest = new Chest();
        leader.chest.twist = Twist.STRAIGHT;
        leader.hips = new Hips();
        leader.hips.twist = Twist.STRAIGHT;
        return leader;
    }
}
