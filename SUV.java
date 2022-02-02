/*
2.3.Krijoni klasën konkrete SUV që është një Automjet jo-automatik, dhe ka atributin eshte4x4.
a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
b) Ofroni metodën që reprezenton në String një objekt të klasës SUV në formatin:
SUV <nrShasise> : <prodhuesi> - <vitiProdhimit> : (nuk) eshte 4x4
 */
public class SUV extends  Automjeti {
    private boolean eshte4x4;

    @Override
    public boolean eshteAutomatik() {
        return false;
    }

    public SUV(int nrShasise ,String prodhuesi ,int vitiProdhimit ,boolean eshte4x4){
        super(nrShasise, prodhuesi, vitiProdhimit);
        this.eshte4x4 = eshte4x4;
    }
    public boolean getEshte4x4(){
        return eshte4x4;
    }
    public void setEshte4x4(boolean eshte4x4){
        this.eshte4x4 = eshte4x4;
    }

    @Override
    public String toString(){
        return " SUV " +super.toString()+" " +((eshte4x4)? " " : "nuk ") +"eshte 4x4";
    }
}
