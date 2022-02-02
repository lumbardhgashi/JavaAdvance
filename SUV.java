package Ushtrimi2;

public class SUV extends Automjeti {
    private boolean esht4x4 ;

    public SUV(boolean esht4x4,int nrShasise ,String prodhuesi ,int vitiProdhimit){
        super(nrShasise,prodhuesi,vitiProdhimit);
        this.esht4x4=esht4x4;
    }

    public boolean isEsht4x4() {
        return esht4x4;
    }

    public void setEsht4x4(boolean esht4x4) {
        this.esht4x4 = esht4x4;
    }
    @Override
    public String toString(){
        return "SUV "+this.getNrShasis() + " : "+this.getProdhuesi()+" - "+this.getVitiProdhimit()+":"+ (esht4x4 ? "Eshte 4x4":"Nuk eshte 4x4");
    }
}
