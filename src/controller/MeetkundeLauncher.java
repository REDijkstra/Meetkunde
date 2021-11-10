package controller;

import model.Cirkel;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Dit is wat het programma doet.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel mijnDefaultCirkel = new Cirkel();
        System.out.println(mijnDefaultCirkel.getStraal());
        System.out.println(mijnDefaultCirkel.geefOppervlakte());
        System.out.println(mijnDefaultCirkel.VertelOverGrootte());

        mijnDefaultCirkel.setStraal(3);
        System.out.println(mijnDefaultCirkel.geefOppervlakte());
        System.out.println(mijnDefaultCirkel.VertelOverGrootte());

        mijnDefaultCirkel.setStraal(6);
        System.out.println(mijnDefaultCirkel.geefOppervlakte());
        System.out.println(mijnDefaultCirkel.VertelOverGrootte());
    }

}
