package controller;

import model.Cirkel;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Dit is wat het programma doet.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        /*Cirkel mijnDefaultCirkel = new Cirkel();
        System.out.println(mijnDefaultCirkel.getStraal());
        System.out.println(mijnDefaultCirkel.geefOmtrek());
        System.out.println(mijnDefaultCirkel.geefOppervlakte());

        mijnDefaultCirkel.setStraal(3);
        System.out.println(mijnDefaultCirkel.getStraal());
        System.out.println(mijnDefaultCirkel.geefOmtrek());
        System.out.println(mijnDefaultCirkel.geefOppervlakte());*/

        /*Cirkel[] mijnCirkelArray = new Cirkel[1];
        mijnCirkelArray[0].setStraal(4);*/


        Cirkel testCirkel = new Cirkel();
        testCirkel.setStraal(-3);

        System.out.println(testCirkel.getStraal());
        //System.out.println(mijnCirkelArray[0].getStraal());
    }

}
