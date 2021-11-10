package controller;

import model.Figuur;
import model.Rechthoek;
import model.Cirkel;
import model.Punt;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Deze launcher laadt figuren en manipuleert deze waar nodig.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {

        /*System.out.println(Rechthoek.geefDefinitie());
        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];
        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2, 5), "blauw");
        mijnRechthoekArray[1] = new Rechthoek();
        mijnRechthoekArray[2] = new Rechthoek(25, 10);

        for (int arrayTeller = 0; arrayTeller < mijnRechthoekArray.length; arrayTeller++) {
            System.out.println(mijnRechthoekArray[arrayTeller]);
            System.out.println(mijnRechthoekArray[arrayTeller].vertelOverGrootte());
        }*/

        Cirkel mijnCirkel = new Cirkel(3, new Punt(2, 5), "groen");
        toonInformatie(mijnCirkel);
        System.out.println();
        Rechthoek mijnRechthoek = new Rechthoek(3, 4, new Punt(-2, 6),
                "blauw");
        toonInformatie(mijnRechthoek);

        Figuur[] figuren = new Figuur[3];
        figuren[0] = mijnCirkel;
        figuren[1] = mijnRechthoek;
        figuren[2] = new Cirkel(10, new Punt(-1, -3), "karmozijn");
        for (int figuurTeller = 0; figuurTeller < 3; figuurTeller++) {
            System.out.println(figuren[figuurTeller]);
            System.out.println();
        }

        int integer1 = 3;
        Integer integer2 = Integer.valueOf(3);

        Integer integer3 = 3;
        int integer4 = Integer.valueOf(3);

        System.out.println(integer1 + "\n"
                + integer2.toString() + "\n"
                + integer3 + "\n"
                + Integer.valueOf(integer4).toString());



    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
    }
}

