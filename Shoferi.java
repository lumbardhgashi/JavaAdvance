public class Shoferi extends Puntori{
    private   String regjioni ;

    public Shoferi(String emri, int mosha,String regjioni) throws PuntoriExecption {
        super(emri, mosha);
        if (regjioni == null && regjioni.trim().isEmpty()){
            throw new PuntoriExecption("Gabim tek regjioni !!");
        }
        this.regjioni = regjioni;

    }

    public String getRegjioni() {
        return regjioni;
    }

    @Override
    public boolean angazhimiFullTime() {
        return true;
    }
}
