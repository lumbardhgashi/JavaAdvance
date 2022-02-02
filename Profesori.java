/*
1.3. Klasa konkrete Profesori është një Mësimdhënës dhe ka atributin shtesë: thirrjaAkademike
a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme.
b) Një profesor ka angazhimin “Ligjerata” dhe mund të mentoroj punime diplome.
c) Ofroni metodën që reprezenton në String një objekt të klasës Profesori në formatin:
Profesori <emri> : < vitiLindjes > me fushe studimi <fushaStudimit>, ka thirrje <thirrjaAkademike>
 */
public class Profesori extends  Mesimdhenesi{
    private String thirrjaAkademike;

    public Profesori(String emri, int vitiLindjes, String fushaStudimit, String thirrjaAkademike) {
        super(emri, vitiLindjes, fushaStudimit);
        this.thirrjaAkademike = thirrjaAkademike;
    }

    public String getThirrjaAkademike() {
        return thirrjaAkademike;
    }

    public void setThirrjaAkademike(String thirrjaAkademike) {
        this.thirrjaAkademike = thirrjaAkademike;
    }

    @Override
    public String getAngazhimi() {
        return "Ligjerata";
    }

    @Override
    public boolean mentoron() {
        return true;
    }
    /*
    Profesori <emri> : < vitiLindjes > me fushe studimi <fushaStudimit>, ka thirrje <thirrjaAkademike>
     */
    public String toString(){
        return "Profesori " +super.toString()+", ka thirrje "+thirrjaAkademike;
    }
}
