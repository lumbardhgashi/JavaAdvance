public class StafiAdministrativ extends Puntori{
    private String departamenti ;

    public StafiAdministrativ(String emri, int mosha, String departamenti) throws PuntoriExecption {
        super(emri, mosha);
        if (departamenti == null && departamenti.trim().isEmpty()){
            throw new PuntoriExecption("Gabim tek Departamenti !!");
        }
        this.departamenti = departamenti ;
    }

    public String getDepartamenti() {
        return departamenti;
    }

    public void setDepartamenti(String departamenti) throws PuntoriExecption{
        if (departamenti == null && departamenti.trim().isEmpty()){
            throw new PuntoriExecption("Gabim tek Departamenti !!");
        }
        this.departamenti = departamenti;
    }

    @Override
    public boolean angazhimiFullTime() {
        return true;
    }

}
