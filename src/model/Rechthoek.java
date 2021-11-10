package model;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Deze klasse omschrijft de eigenschappen van een rechthoek.
 */
public class Rechthoek extends Figuur {

    //constanten & variabelen
    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;

    //constructors
    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
        this.kleur = kleur;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), DEFAULTWAARDE_KLEUR);

    }

    public Rechthoek() {
        this(2, 1);
    }

    // methoden
    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken";
    }

    @Override
    public double geefOmtrek() {
        return lengte * 2 + breedte * 2;
    }

    @Override
    public double geefOppervlakte() {
        return lengte * breedte;
    }

    public String toString() {
        return super.toString() + "\nLengte: " + lengte +
                "\nBreedte: " + breedte +
                "\nHoekpunt: " + hoekpuntLinksBoven.toString();
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

}

