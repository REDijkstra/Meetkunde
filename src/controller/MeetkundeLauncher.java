package controller;

import model.Cirkel;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Dit is wat het programma doet.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel mijnEersteCirkel = new Cirkel();

        mijnEersteCirkel.straal = 3;
        mijnEersteCirkel.middelpuntX = 3;
        mijnEersteCirkel.middelpuntY = -2;
        mijnEersteCirkel.kleur = "groen";

        System.out.println(mijnEersteCirkel.geefOmtrek());
        System.out.println(mijnEersteCirkel.geefOppervlakete());

    }

}
