package hu.home.Galambok;

public class Pozicio {
    protected int x;
    protected int y;

    public Pozicio(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Pozicio p1, Pozicio p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }


}
