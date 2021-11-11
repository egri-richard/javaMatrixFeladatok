package hu.home.Galambok;

import java.util.ArrayList;

public class Ter {
    protected int[][] ter;
    protected ArrayList<Galamb> galambok;
    protected Pozicio emberLoc;

    public Ter() {
        this.ter = new int[50][50];
        this.galambok = new ArrayList<>(500);
        this.emberLoc = new Pozicio((int)Math.round(Math.random()*50), (int)Math.round(Math.random()*50));

        for (int i = 0; i < 500; i++) {
            boolean gen = true;
            Galamb g;
            do {
                g = new Galamb(new Pozicio((int)Math.round(Math.random()*50), (int)Math.round(Math.random()*50)));
                for (Galamb galamb : galambok) {
                    if (galamb == g) gen = false;
                }
            } while (gen);
            galambok.add(g);
        }
    }

    public void mozog (int x, int y) {
        this.emberLoc.x = x;
        this.emberLoc.y = y;

        for (Galamb g : galambok) {
            if (emberLoc.distance(g.galambPoz) < 2) {
                g.fly(emberLoc);
            } else if (emberLoc.distance(g.galambPoz) < 4) {
                g.walk(emberLoc);
            }
        }
    }

    public void show() {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                boolean ember = false;
                boolean galamb = false;

                if (i == emberLoc.y && j == emberLoc.x) {
                    System.out.print("0 ");
                    ember = true;
                }

                for (Galamb g : galambok) {
                    if (g.galambPoz.y == i && g.galambPoz.x == j) {
                        System.out.print("1 ");
                        galamb = true;
                        break;
                    }
                }

                if (!galamb && !ember) {
                    System.out.print("x ");
                }
            }
            System.out.print("\n");
        }
    }
}
