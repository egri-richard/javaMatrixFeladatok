package hu.home.Galambok;

public class Galamb {
    protected Pozicio galambPoz;

    public Galamb(Pozicio galambPoz) {
        this.galambPoz = galambPoz;
    }

    public void walk(Pozicio emberPoz) {
       this.galambPoz.x = (int)this.galambPoz.distance(emberPoz) + 5;
    }

    public void fly(Pozicio emberPoz) {
        this.galambPoz.x = (int)this.galambPoz.distance(emberPoz) + 2;
    }
}
