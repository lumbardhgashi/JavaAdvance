public abstract class Puntori {
    private String emri ;
    private int mosha ;

    public Puntori(String emri , int mosha)throws PuntoriExecption{
        if (emri == null && emri.trim().isEmpty()){
            throw new PuntoriExecption("Gabim tek emri !!");
        }
        if (mosha < 0){
            throw new PuntoriExecption("Mosha duhet te jet pozitive");
        }
        this.emri=emri;
        this.mosha=mosha;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) throws PuntoriExecption{
        if (emri == null && emri.trim().isEmpty()){
            throw new PuntoriExecption("Gabim tek emri !!");
        }
        this.emri = emri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha)throws PuntoriExecption {
        if (mosha < 0){
            throw new PuntoriExecption("Mosha duhet te jet pozitive");
        }
        this.mosha = mosha;
    }

    public abstract boolean angazhimiFullTime();
}
