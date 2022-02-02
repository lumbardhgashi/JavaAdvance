public class Profesori extends Mesimdhenesi {
    private String thirrjaAkademike;

    public Profesori(String thirrjaAkademike, String emri, int vitiLindjes, String angazhimi) {
        super(emri, vitiLindjes, angazhimi);
        this.thirrjaAkademike = thirrjaAkademike;
    }



    public String getThirrjaAkademike() {
        return thirrjaAkademike;
    }

    public void setThirrjaAkademike(String thA) {
        thirrjaAkademike = thA;
    }

    @Override
    //Mundemi me e thirr edhe si super.toString() ne  menyre qe me thirr toString() te prindit ket rast mesimdhenesi
    /* public String toString(){
       return super.toString() + thirrjaAkademike ;
    }
    OSE MENYRA TJETER :
     */
    public String toString(){
        return "Profesori " + this.getEmri() + " : " +this.getVitiLindjes() + " mban " + this.getAngazhimi() + " , ka thirrje " + thirrjaAkademike ;
    }

}