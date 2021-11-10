package model;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Deze klasse omschrijft een cirkel
 */
public class Cirkel {
    public double straal;
    public double middelpuntX;
    public double middelpuntY;
    public String kleur;

    public double geefOmtrek(){
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakete(){
        return Math.PI * straal * straal;
    }

}
