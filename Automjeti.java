/*
2.1. Krijoni klasën abstrakte Automjeti që ka tri atribute: nrShasise [readonly], prodhuesi si dhe
vitiProdhimit
a) Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet.
b) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
c) Ofroni metodën abstrakte eshteAutomatik që tregon nëse një automjet është automatik
d) Ofroni metodën që reprezenton në String një objekt të klasës Automjeti në formatin:
<nrShasise> : <prodhuesi> - <vitiProdhimit>
e) Ofroni metodën për krahasimin e dy objekteve Automjeti.
Vini re: Dy automjete janë të njejtë nëse kanë numrin e shasisë të njejtë
 */
public abstract class Automjeti implements Vozitet{
    private int nrShasise ;
    private String prodhuesi ;
    private int vitiProdhimit ;

    public Automjeti(int nrShasise , String prodhuesi , int vitiProdhimit){
        this.nrShasise = nrShasise;
        this.vitiProdhimit = vitiProdhimit ;
        this.prodhuesi = prodhuesi ;
    }

    public int getNrShasise(){
        return nrShasise ;
    }
    public String getProdhuesi(){
        return prodhuesi;
    }
    public void setProdhuesi(String prodhuesi){
        this.prodhuesi =  prodhuesi ;
    }

    public int getVitiProdhimit() {
        return vitiProdhimit;
    }
    public void setVitiProdhimit(int vitiProdhimit){
        this.vitiProdhimit = vitiProdhimit ;
    }

    public abstract boolean eshteAutomatik();

    @Override
    public String toString(){
        return nrShasise + " : " + prodhuesi + " - " +vitiProdhimit;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Automjeti){
            Automjeti krahasues = (Automjeti) obj ;
            if (nrShasise == krahasues.getNrShasise()){
                return true ;
            }
        }
        return false ;
    }

}
