/*
2.2.Krijoni klasën konkrete Limuzina që është një Automjet automatik, dhe ka atributin ngjyra.
a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
b) Ofroni metodën që reprezenton në String një objekt të klasës Limuzina në formatin:
Limuzina <nrShasise> : <prodhuesi> - <vitiProdhimit> : <ngjyra>
 */
public class Limuzina extends Automjeti {
    private String ngjyra ;

    @Override
    public boolean eshteAutomatik(){
        return true;
    }

    public Limuzina(int nrShasise,String prodhuesi , int vitiProdhimit , String ngjyra){
        super(nrShasise, prodhuesi, vitiProdhimit);
        this.ngjyra = ngjyra ;
    }

    public String getNgjyra(){
        return  ngjyra;
    }
    public void setNgjyra(String ngjyra){
        this.ngjyra = ngjyra ;
    }

    @Override
    public String toString(){
        return " Limuzina " + super.toString()+" : "+ ngjyra;
    }

}

