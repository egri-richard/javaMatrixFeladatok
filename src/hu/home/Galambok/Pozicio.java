package hu.home.Galambok;

public class Pozicio {
    protected int x;
    protected int y;

    public Pozicio(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Pozicio p2) {
        return Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));
    }


}
