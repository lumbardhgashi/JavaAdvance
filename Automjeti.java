/*
2.1. Krijoni  klasën  abstrakte  Automjeti  që  ka  tri  atribute:  nrShasise  [readonly],  prodhuesi  si  dhe
vitiProdhimit
a)     Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet.
b)     Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
c)     Ofroni metodën abstrakte eshteAutomatik që tregon nëse një automjet është automatik
d)     Ofroni metodën që reprezenton në String një objekt të klasës Automjeti në formatin:
<nrShasise> : <prodhuesi> - <vitiProdhimit>
e)     Ofroni metodën për krahasimin e dy objekteve Automjeti.
Vini re: Dy automjete janë të njejtë nëse kanë numrin e shasisë të njejtë.
 */
public abstract class Automjeti implements Vozitet {
    private int nrShasise;
    private String prodhuesi;
    private int vitiProdhimit;

    public Automjeti(int nrShasise,String prodhuesi,int vitiProdhimit)throws AutomjetiExecption{
        if (nrShasise <=0){
            throw new AutomjetiExecption("Numri shasise eshte me i vogel se 0");
        }
        if (vitiProdhimit <=0){
            throw new AutomjetiExecption("Viti Prodhimit eshte me i vogel se 0");
        }
        if (vitiProdhimit < 2012 ){
            throw new AutomjetiExecption("Nuk mund te doganohet ne Republiken e Kosoves");
        }
        if (prodhuesi.equals("") || prodhuesi.trim().isEmpty()){
            throw new AutomjetiExecption("U Dedektua nje  gabim tek Prodhuesi");
        }
        this.nrShasise = nrShasise ;
        this.prodhuesi = prodhuesi ;
        this.vitiProdhimit = vitiProdhimit ;
    }

    public int getNrShasise(){
        return nrShasise;
    }
    public String getProdhuesi(){
        return prodhuesi;
    }
    public void setProdhuesi(String prodhuesi) throws AutomjetiExecption{
        if (prodhuesi.equals("") || prodhuesi.trim().isEmpty()){
            throw new AutomjetiExecption("U Dedektua nje  gabim tek Prodhuesi");
        }
        this.prodhuesi = prodhuesi ;
    }

    public int getVitiProdhimit() {
        return vitiProdhimit;
    }

    public void setVitiProdhimit(int vitiProdhimit) throws AutomjetiExecption{
        if (vitiProdhimit <=0){
            throw new AutomjetiExecption("Viti Prodhimit eshte me i vogel se 0");
        }
        if (vitiProdhimit < 2012 ){
            throw new AutomjetiExecption("Nuk mund te doganohet ne Republiken e Kosoves");
        }
        this.vitiProdhimit = vitiProdhimit;
    }

    public abstract boolean eshteAutomatik();

    @Override
    public String toString(){
        return nrShasise + " : "+ prodhuesi+" - "+vitiProdhimit;
    }

    public boolean equals(Object obj){
        if (obj instanceof Automjeti){
            Automjeti krahasues = (Automjeti) obj;
            if (nrShasise == krahasues.getNrShasise()){
                return true;
            }
        }
        return false;
    }
}

