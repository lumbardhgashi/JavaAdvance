package Ushtrimi2;

public class Automjeti {
    private int nrShasis ; // read only
    private String prodhuesi ;
    private int vitiProdhimit ;

    public Automjeti(int nrShasis , String prodhuesi , int vitiProdhimit){
        this.nrShasis=nrShasis;
        this.prodhuesi=prodhuesi;
        this.vitiProdhimit=vitiProdhimit;
    }

    public int getNrShasis() {
        return nrShasis;
    }

    public String getProdhuesi() {
        return prodhuesi;
    }

    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi = prodhuesi;
    }

    public int getVitiProdhimit() {
        return vitiProdhimit;
    }

    public void setVitiProdhimit(int vitiProdhimit) {
        this.vitiProdhimit = vitiProdhimit;
    }
    public String toString(){
        return nrShasis + " : " + prodhuesi + " - " + vitiProdhimit;
    }
    public boolean equals(Object obj){
        if (obj instanceof Automjeti){
            Automjeti krahasues = (Automjeti) obj ;
            if (nrShasis == krahasues.getNrShasis()){
                return true;
            }
        }
        return false;
    }

}
