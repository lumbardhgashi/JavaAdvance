/*
1.1.Krijoni klasën Mesimdhenesi që ka tri atribute: emri[readonly], vitiLindjes si dhe angazhimi
a) Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet.
b) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
c) Ofroni metodën abstrakte mentoron që kthen nëse një mësimdhënës mund të mentoroj
punime
d) Reprezentimi në String i një Mesimdhenesi ka formatin:
<emri> : < vitiLindjes > angazhohet ne <angazhimi>
e) Ofroni metodën për krahasimin e dy objekteve Mesimdhenesi për barazi.
ni re: Dy mësimdhënës janë të njëjtë nëse kanë emrin dhe vitin e lindjes të njëjtë.
 */
public abstract class Mesimdhenesi {
    private String emri ;
    private int vitilindjes ;
    private String angazhimi ;

    public Mesimdhenesi(String emri , int vitilindjes ,String angazhimi){
        this.emri = emri ;
        this.vitilindjes = vitilindjes;
        this.angazhimi = angazhimi ;
    }

    public String getEmri(){
        return emri ;
    }
    public int getVitilindjes(){
        return vitilindjes;
    }
    public void setVitilindjes(int vitilindjes){
        this.vitilindjes = vitilindjes ;
    }
    public String getAngazhimi(){
        return angazhimi;
    }
    public void setAngazhimi(String angazhimi){
        this.angazhimi = angazhimi ;
    }

    public abstract  boolean mentoron();

    public String toString(){
        return emri +" : " +vitilindjes+" - " +"angazhohet me " +angazhimi;
    }

    public boolean equals(Object obj){
        if (obj instanceof Mesimdhenesi){
            Mesimdhenesi krahasues = (Mesimdhenesi) obj;
            if (emri.equals(krahasues.getEmri()) && vitilindjes == krahasues.getVitilindjes()){
                return true ;
            }
        }
        return false ;
    }


}
