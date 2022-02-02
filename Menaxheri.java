public class Menaxheri extends Puntori implements Individi{
    private int sektori ;
    private String kualifikimi ;

    public Menaxheri(String emri, int mosha,int sektori,String kualifikimi) throws PuntoriExecption {
        super(emri, mosha);
        if (sektori < 0){
            throw new PuntoriExecption("sektori duhet te jet pozitive");
        }
        if (kualifikimi == null && kualifikimi.trim().isEmpty()){
            throw new PuntoriExecption("Gabim tek kualifikimi !!");
        }
        this.sektori = sektori ;
        this.kualifikimi = kualifikimi ;

    }

    public int getSektori() {
        return sektori;
    }

    @Override
    public String getKualifikimi() {
        return kualifikimi;
    }

    @Override
    public boolean angazhimiFullTime() {
        return true;
    }
}
