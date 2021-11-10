package controller;

import model.Cirkel;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Dit is wat het programma doet.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel mijnAllArgsCirkel = new Cirkel(3, 1, 4, "groen");
        System.out.println(mijnAllArgsCirkel.geefOmtrek());
        System.out.println(mijnAllArgsCirkel.geefOppervlakte());

        Cirkel mijnDefaultCirkel = new Cirkel();
        System.out.println(mijnDefaultCirkel.geefOmtrek());
        System.out.println(mijnDefaultCirkel.geefOppervlakte());

        Cirkel mijnStraalCirkel = new Cirkel();
        System.out.println(mijnStraalCirkel.geefOmtrek());
        System.out.println(mijnStraalCirkel.geefOppervlakte());




    }

}
