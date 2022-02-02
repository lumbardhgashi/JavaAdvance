package Ushtrimi2;

public class Limuzina extends Automjeti {
    private String ngjyra ;

    public Limuzina(String ngjyra , int nrShasise ,String prodhuesi ,int vitiProdhimit){
        super(nrShasise,prodhuesi,vitiProdhimit);
        this.ngjyra=ngjyra;
    }
    public String getNgjyra(){
        return ngjyra;
    }
    @Override
    public  String toString(){
        return "Limuzina " + this.getNrShasis() + " : " + this.getProdhuesi()+" - "+this.getVitiProdhimit() +" : " + ngjyra ;
    }

}
