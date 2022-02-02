/*
2.3. Krijoni klasën Limuzina që është një Automjet automatik që vozitet me 6 shpejtesi, pa tempomat,
dhe ka atributin ngjyra dhe reprezentohet në String në formatin:
Limuzina <nrShasise> : <prodhuesi> - <vitiProdhimit> : <ngjyra>

 */
public class Limuzina extends Automjeti{
    private String ngjyra;

    public Limuzina(int nrShasise, String prodhuesi, int vitiProdhimit, String ngjyra) {
        super(nrShasise, prodhuesi, vitiProdhimit);
        this.ngjyra = ngjyra;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    @Override
    public String toString() {
        return "Limuzina " +super.toString()+" : " +ngjyra ;
    }

    @Override
    public boolean eshteAutomatik() {
        return false;
    }

    @Override
    public int numriShpejtsive() {
        return 6;
    }

    @Override
    public boolean kaTempomat() {
        return false;
    }
}
