/*
2.4. Krijoni klasën SUV që është një Automjet  jo-automatik që vozitet me 5 shpejtesi,
me tempomat dhe ka atributin eshte4x4 dhe  reprezentohet në String në formatin:
SUV <nrShasise> : <prodhuesi> - <vitiProdhimit> : (nuk) eshte 4x4
 */
public class SUV extends Automjeti{
    private boolean eshte4x4;

    public SUV(int nrShasise, String prodhuesi, int vitiProdhimit , boolean eshte4x4) throws AutomjetiExecption {
        super(nrShasise, prodhuesi, vitiProdhimit);

        if (eshte4x4 != true && eshte4x4 != false) {
            throw new AutomjetiExecption("eshte4x4 duhet te jet true ose false");
        }
        this.eshte4x4 = eshte4x4 ;
    }

    public boolean isEshte4x4() {
        return eshte4x4;
    }

    public void setEshte4x4(boolean eshte4x4) throws AutomjetiExecption {
        if (eshte4x4 != true || eshte4x4 != false) {
            throw new AutomjetiExecption("eshte4x4 duhet te jet true ose false");
        }
        this.eshte4x4 = eshte4x4 ;
    }

    @Override
    public boolean eshteAutomatik() {
        return false;
    }

    @Override
    public int numriShpejtesive() {
        return 5;
    }

    @Override
    public boolean kaTempomat() {
        return true;
    }

    @Override
    public String toString() {
        return "SUV " + super.toString()+" : "+(eshte4x4?" ":" Nuk ")+"eshte4x4";
    }
}
