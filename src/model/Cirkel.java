package model;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Deze klasse omschrijft een cirkel
 */
public class Cirkel {
    private final static double GRENSWAARDE_GROOT_FIGUUR =  100.0;
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
        this(straal, 0, 0, "wit");
    }

    public Cirkel() {
        this(1);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    public  String VertelOverGrootte(){
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return  "Ik ben klein!!!";
        }
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
