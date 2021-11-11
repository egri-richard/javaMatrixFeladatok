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
            Galamb g = new Galamb(new Pozicio((int)Math.round(Math.random()*50), (int)Math.round(Math.random()*50)));

            while (galambok.contains(g)) {
                g = new Galamb(new Pozicio((int)Math.round(Math.random()*50), (int)Math.round(Math.random()*50)));
            }

            galambok.add(g);
        }

        fill();
    }

    public void move (int x, int y) {
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

    private void fill() {
        for (int i = 0; i < ter.length; i++) {
            for (int j = 0; j < ter[0].length; j++) {
                boolean ember = false;
                boolean galamb = false;

                if (i == emberLoc.y && j == emberLoc.x) {
                    ter[i][j] = 2;
                    ember = true;
                }

                for (Galamb g : galambok) {
                    if (g.galambPoz.y == i && g.galambPoz.x == j) {
                        ter[i][j] = 1;
                        galamb = true;
                        break;
                    }
                }

                if (!galamb && !ember) {
                    ter[i][j] = 0;
                }
            }
            System.out.print("\n");
        }
    }

    public void show() {
        for (int i = 0; i < ter.length; i++) {
            for (int j = 0; j < ter[0].length; j++) {
                System.out.printf("%d ", ter[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void getEmberPoz() {
        System.out.printf("Az ember itt van: %d sor, %d oszlop", this.emberLoc.y, this.emberLoc.x);
    }
}
