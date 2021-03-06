package model;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Deze klasse omschrijft geeft het punt van de op gegeven coordinaten.
 */
public class Punt {

    private double xCoordinaat = 0;
    private double yCoordinaat = 0;

    public Punt() {
    }

    public Punt(double xCoordinaat, double yCoordinaat) {
        this.xCoordinaat = xCoordinaat;
        this.yCoordinaat = yCoordinaat;
    }
    // todo checken string formatting met of zonder haakjes
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", xCoordinaat,yCoordinaat);
    }

    public double getxCoordinaat() {
        return xCoordinaat;
    }

    public double getyCoordinaat() {
        return yCoordinaat;
    }
}
