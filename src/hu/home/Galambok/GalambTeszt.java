package hu.home.Galambok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GalambTeszt {

    public static void run() {
        Ter t = new Ter();
        t.show();
        t.getEmberPoz();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            boolean done = false;
            int x = 0;
            int y = 0;
            while(!done) {
                System.out.println("Mozgassuk az embert");

                System.out.print("x pozicio: ");
                try {
                    x = Integer.parseInt(reader.readLine());
                } catch(NumberFormatException nfe) {
                    System.err.println("Invalid Format!");
                }

                System.out.print("y pozicio: ");
                try {
                    y = Integer.parseInt(reader.readLine());
                } catch(NumberFormatException nfe) {
                    System.err.println("Invalid Format!");
                }

                if (x == 0 && y == 0) {
                    done = true;
                }

                t.move(x, y);
                t.show();
                t.getEmberPoz();
            }

            reader.close();
        } catch(IOException e) {
            System.out.println(e.toString());
        }



    }

    public static void embertMozgat() {

    }
}
