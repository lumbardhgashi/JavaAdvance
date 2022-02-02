/*
1.4. Klasa konkrete Asistenti është një Mësimdhënës dhe ka atributin shtesë: llojiUshtimreve
a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme.
b) Një asistent ka angazhimin “Ushtrime” dhe nuk mund të mentoroj punime diplome.
c) Ofroni metodën që reprezenton në String një objekt të klasës Asistenti në formatin:
Asistenti <emri> : < vitiLindjes > me fushe studimi <fushaStudimit> <llojiUshtrimeve>

 */
public class Asistenti extends Mesimdhenesi{
    private String llojiUshtrimeve ;

    public Asistenti(String emri, int vitiLindjes, String fushaStudimit, String llojiUshtrimeve) {
        super(emri, vitiLindjes, fushaStudimit);
        this.llojiUshtrimeve = llojiUshtrimeve;
    }

    public String getLlojiUshtrimeve() {
        return llojiUshtrimeve;
    }

    public void setLlojiUshtrimeve(String llojiUashtrimeve) {
        this.llojiUshtrimeve = llojiUashtrimeve;
    }

    @Override
    public String getAngazhimi() {
        return "Ushtrime";
    }

    @Override
    public boolean mentoron() {
        return false;
    }
    /*
    Asistenti <emri> : < vitiLindjes > me fushe studimi <fushaStudimit> <llojiUshtrimeve>
     */
    public String toString(){
        return "Asistenti "+super.toString()+" " + llojiUshtrimeve ;
    }


}
