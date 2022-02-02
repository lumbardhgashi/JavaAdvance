/*
1.3.Klasa konkrete Asistenti është një Mësimdhënës dhe ka atributin shtesë: llojiUshtimreve
a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme.
b) Një asistent ka angazhimin “Ushtrime” dhe nuk mund të mentoroj punime diplome.
c) Një asistent Ofroni metodën që reprezenton në String një objekt të klasës Asistenti në
formatin:
Asistenti <emri> : < vitiLindjes > angazhohet ne <angazhimi> <llojiUshtrimeve>
 */
public class Asistenti extends  Mesimdhenesi {
    private String llojiUshtrimeve;

    public Asistenti(String emri, int vitilindjes, String llojiUshtrimeve) {
        super(emri, vitilindjes, "Ushtrime");
        this.llojiUshtrimeve = llojiUshtrimeve;
    }
    @Override
    public boolean mentoron() {
        return false;
    }

    public String getLlojiUshtrimeve(){
        return llojiUshtrimeve;
    }
    public void setLlojiUshtrimeve(String llojiUshtrimeve){
        this.llojiUshtrimeve = llojiUshtrimeve ;
    }
    public String toString(){
        return "Asistenti "+ super.toString() + " " + llojiUshtrimeve;
    }

}
