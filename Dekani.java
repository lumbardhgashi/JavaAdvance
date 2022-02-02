public class Dekani extends StafiAkademik {
    private String gradaAkademike ;

    public Dekani(String emri, int vitiLindjes, boolean irregullt, String gradaAkademike) {
        super(emri, vitiLindjes, irregullt);
        this.gradaAkademike = gradaAkademike;
    }

    public String getGradaAkademike() {
        return gradaAkademike;
    }

    public void setGradaAkademike(String gradaAkademike) {
        this.gradaAkademike = gradaAkademike;
    }
    public String toString(){
        return "Dekani"+gradaAkademike+ "" +super.toString();
    }

}
