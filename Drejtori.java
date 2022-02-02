public class Drejtori extends StafiAdministrativ implements Individi{

    private String kualifikimi;

    public Drejtori(String emri, int mosha, String departamenti, String kualifikimi) throws PuntoriExecption {
        super(emri, mosha, departamenti);
        if (kualifikimi == null && kualifikimi.trim().isEmpty()){
            throw new PuntoriExecption("Gabim tek Kualifikimi !!");
        }
        this.kualifikimi = kualifikimi;
    }

    public void setKualifikimi(String kualifikimi) throws PuntoriExecption{
        if (kualifikimi == null && kualifikimi.trim().isEmpty()){
            throw new PuntoriExecption("Gabim tek Kualifikimi !!");
        }
        this.kualifikimi = kualifikimi;
    }

    @Override
    public String getKualifikimi() {
        return kualifikimi;
    }
}
