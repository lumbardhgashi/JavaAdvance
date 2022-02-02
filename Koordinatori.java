public class Koordinatori extends Puntori{
    private int numriShofereve ;

    public Koordinatori(String emri, int mosha,int numriShofereve) throws PuntoriExecption {
        super(emri, mosha);
        if (numriShofereve < 0){
            throw new PuntoriExecption("NumriShoferevee duhet te jet pozitive");
        }
        this.numriShofereve =numriShofereve;
    }

    public int getNumriShofereve() {
        return numriShofereve;
    }

    @Override
    public boolean angazhimiFullTime() {
        return true;
    }
}
