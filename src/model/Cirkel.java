package model;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Deze klasse omschrijft een cirkel
 */
public class Cirkel {
    private double straal;
    private double middelpuntX;
    private double middelpuntY;
    private String kleur;

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        setStraal(straal);
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
    }

    public Cirkel(double straal) {
        setStraal(straal);
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "wit";
    }

    public Cirkel() {
        this.straal = 1;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "wit";
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    public double geefOmtrek(){
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte(){
        return Math.PI * straal * straal;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        if (straal <= 0){
            System.out.println("de straal moet positief zijn. De straal wordt op 1 gezet");
            this.straal = 1.0;
        } else {
            this.straal = straal;
        }
    }
}
