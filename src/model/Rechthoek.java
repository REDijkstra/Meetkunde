package model;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Deze klasse omschrijft de eigenschappen van een rechthoek.
 */
public class Rechthoek {

    //constanten & variabelen
    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;
    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;
    private String kleur;

    //constructors
    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
        this.kleur = kleur;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), "wit");

    }

    public Rechthoek() {
        this(2,1);
    }

    // methoden
    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken";
    }

    public double geefOmtrek() {
        return lengte * 2 + breedte * 2;
    }

    public double geefOppervlakte(){
        return lengte * breedte;
    }

    public String vertelOverGrootte(){
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR){
            return "Ik ben groot!!!";
        } else {
            return  "Ik ben klein!!!";
        }
    }

    // getters & setters

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public Punt getHoekpuntLinksBoven() {
        return hoekpuntLinksBoven;
    }

    public void setHoekpuntLinksBoven(Punt hoekpuntLinksBoven) {
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}

