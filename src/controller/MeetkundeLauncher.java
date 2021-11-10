package controller;

import model.Rechthoek;
import model.Cirkel;
import model.Punt;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Deze launcher laadt figuren en manipuleert deze waar nodig.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {

        System.out.println(Rechthoek.geefDefinitie());
        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];
        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2, 5), "blauw");
        mijnRechthoekArray[1] = new Rechthoek();
        mijnRechthoekArray[2] = new Rechthoek(25, 10);

        for (int arrayTeller = 0; arrayTeller < mijnRechthoekArray.length; arrayTeller++) {
            System.out.println(mijnRechthoekArray[arrayTeller].geefOmtrek());
            System.out.println(mijnRechthoekArray[arrayTeller].geefOppervlakte());
            System.out.println(mijnRechthoekArray[arrayTeller].getHoekpuntLinksBoven().getxCoordinaat());
            System.out.println(mijnRechthoekArray[arrayTeller].getHoekpuntLinksBoven().getyCoordinaat());
            System.out.println(mijnRechthoekArray[arrayTeller].vertelOverGrootte());
        }

        /*Cirkel[] mijnCirkelArray = new Cirkel[3];
        mijnCirkelArray[0] = new Cirkel(1);
        mijnCirkelArray[1] = new Cirkel(2);
        mijnCirkelArray[2] = new Cirkel(3);

        for (int arrayTeller = 0; arrayTeller < 3; arrayTeller++) {
            System.out.println(mijnCirkelArray[arrayTeller].geefOmtrek());
            System.out.println(mijnCirkelArray[arrayTeller].geefOppervlakte());
            System.out.println(mijnCirkelArray[arrayTeller].getMiddelpunt().getxCoordinaat());
            System.out.println(mijnCirkelArray[arrayTeller].getMiddelpunt().getyCoordinaat());
            System.out.println(mijnCirkelArray[arrayTeller].vertelOverGrootte());
        }*/
    }
}

