/*
2.3.Krijoni klasën abstrakte UtilityVehicle që është një Automjet, dhe ka metodën abstrakte eshte4x4.
a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
b) Ofroni metodën që reprezenton në String një objekt të klasës UtilityVehicle në formatin:
Utility Vehicle <nrShasise> : <prodhuesi> - <vitiProdhimit> : (nuk) eshte 4x4
 */
public abstract class UtilityVehicle extends Automjeti{



    public UtilityVehicle(int nrShasise, String prodhuesi, int vitiProdhimit) {
        super(nrShasise, prodhuesi, vitiProdhimit);
    }

    public abstract boolean eshte4x4();

    public String toString(){
        return "Utility Vehicle " + super.toString() + (eshte4x4()? " " :" nuk ") + "eshte4x4";
    }
}
