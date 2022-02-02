/*
1.2.Klasa konkrete Profesori është një Mësimdhënës dhe ka atributin shtesë: thirrjaAkademike
a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme.
b) Një profesor ka angazhimin “Ligjerata” dhe mund të mentoroj punime diplome.
c) Ofroni metodën që reprezenton në String një objekt të klasës Profesori në formatin:
Profesori <emri> : < vitiLindjes > angazhohet ne <angazhimi>, ka thirrje <thirrjaAkademike>

 */
public class Profesori extends Mesimdhenesi{
    private String thirrjAkademike ;

     public Profesori(String emri , int vitilindjes ,String thirrjaAkademike ){
        super(emri, vitilindjes,"Ligjerata");
        this.thirrjAkademike = thirrjaAkademike;
    }
    public  boolean mentoron(){
         return  true;
    }

    public String getThirrjAkademike(){
         return  thirrjAkademike;
    }
    public void setThirrjAkademike(String thirrjAkademike){
         this.thirrjAkademike =thirrjAkademike;
    }
    public String toString(){
         return "Profesori " +super.toString()+" , ka thirrje Akademike " + thirrjAkademike;
    }


}
