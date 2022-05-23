package main;

import java.util.Random;
import java.util.Scanner;

public class TorpedoJatek {

    public static void main(String[] args) {
        System.out.println("Torpedó játék");
        Hajo hajo = new Hajo(new int[]{2, 3, 4});
        int hajoEletero = 3;
        int jatekosLoves = 0;

        do {
            System.out.println("Kérem adja meg hogy hova szeretne lőni: ");
            jatekosLoves = lovesHelye();
            if (hajo.talalat(jatekosLoves).equals("Talált")) {
                System.out.println("Talált");
                hajoEletero--;
            } else {
                System.out.println("Nem Talált");
            }
        } while (!(elsullyedt(hajoEletero)));

        if (elsullyedt(hajoEletero)) {
            System.out.println("Nyertél");
        }

    }

    public static boolean elsullyedt(int eletero) {
        if (eletero <= 0) {
            return true;

        } else {
            return false;
        }

    }

    public static int lovesHelye() {
        Scanner sc = new Scanner(System.in);
        int JatekosLoves = sc.nextInt();

        return JatekosLoves;
    }

}
