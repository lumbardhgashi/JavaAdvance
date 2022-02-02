/*
2.5.Klasa MUV që është një UtilityVehicle automatik, nuk është 4x4, dhe ka atributin kaGPS.
e) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
f) Ofroni metodën që reprezenton në String një objekt të klasës MUV në formatin:
Multi Utility Vehicle <nrShasise> : <prodhuesi> - <vitiProdhimit> : (nuk) eshte 4x4, (me/pa) GPS
 */
public class MUV extends UtilityVehicle{
    private boolean kaGPS;

    public MUV(int nrShasise, String prodhuesi, int vitiProdhimit, boolean kaGPS) {
        super(nrShasise, prodhuesi, vitiProdhimit);
        this.kaGPS = kaGPS;
    }

    public boolean isKaGPS() {
        return kaGPS;
    }

    public void setKaGPS(boolean kaGPS) {
        this.kaGPS = kaGPS;
    }

    @Override
    public boolean eshteAutomatik() {
        return true;
    }

    @Override
    public boolean eshte4x4() {
        return false;
    }

    @Override
    public String toString() {
        return "Multi Utility Vehicle " + super.toString();
    }
}
