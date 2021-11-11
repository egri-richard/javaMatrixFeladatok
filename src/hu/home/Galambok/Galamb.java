package hu.home.Galambok;

public class Galamb {
    protected Pozicio galambPoz;

    public Galamb(Pozicio galambPoz) {
        this.galambPoz = galambPoz;
    }

    public void walk(Pozicio emberPoz) {
        int potentialY = (int)this.galambPoz.distance(emberPoz) + 5;
        if (potentialY > 49) {
            int diff = 49 - this.galambPoz.y;
            this.galambPoz.x = this.galambPoz.x + (5 - diff);
        } else {
            this.galambPoz.y = (int)this.galambPoz.distance(emberPoz) + 5;
        }
    }

    public void fly(Pozicio emberPoz) {
        int potentialY = (int)this.galambPoz.distance(emberPoz) + 2;
        if (potentialY > 49) {
            int diff = 49 - this.galambPoz.y;
            this.galambPoz.x = this.galambPoz.x + (2 - diff);
        } else {
            this.galambPoz.y = (int)this.galambPoz.distance(emberPoz) + 2;
        }
    }
}
