/*
1.1. Krijoni klasën abstrakte Mesimdhenesi që atributet: emri[readonly], vitiLindjes si dhe
fushaStudimit
a) Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet.
b) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
c) Reprezentimi në String i një Mesimdhenesi ka formatin:
<emri> : < vitiLindjes > me fushe studimi <fushaStudimit>
d) Ofroni metodën për krahasimin e dy objekteve Mesimdhenesi për barazi.
Vini re: Dy mësimdhënës janë të njëjtë nëse kanë emrin dhe vitin e lindjes të njëjtë.

 */
public abstract class Mesimdhenesi implements Angazhohet {
    private String emri ;
    private int vitiLindjes ;
    private String fushaStudimit ;

    public Mesimdhenesi(String emri , int vitiLindjes , String fushaStudimit){
        this.emri = emri;
        this.vitiLindjes = vitiLindjes ;
        this.fushaStudimit = fushaStudimit ;
    }
    public String getEmri() {
        return emri;
    }

    public String getFushaStudimit() {
        return fushaStudimit;
    }

    public void setFushaStudimit(String fushaStudimit) {
        this.fushaStudimit = fushaStudimit;
    }
    public int getVitiLindjes() {
        return vitiLindjes;
    }

    public void setVitiLindjes(int vitiLindjes) {
        this.vitiLindjes = vitiLindjes;
    }

    @Override
    public String toString(){
        return emri +" : " +vitiLindjes + " me fushe studimi "+ fushaStudimit;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Mesimdhenesi){
            Mesimdhenesi krahasues = (Mesimdhenesi) obj;
            if (emri.equals(krahasues.getEmri()) && vitiLindjes == krahasues.getVitiLindjes()){
                return true;
            }
        }
        return false ;
    }
}
