public class Asistenti extends Mesimdhenesi{
    private  String llojiUshtrimeve ;

    public Asistenti(String llojiUshtrimeve ,String emri ,int vitiLindjes , String angazhimi){
        super(emri,vitiLindjes,angazhimi);
        this.llojiUshtrimeve = llojiUshtrimeve;
    }
    public String getLlojiUshtrimeve(){
        return llojiUshtrimeve;
    }
    public void setLlojiUshtrimeve(String llojiUshtrimeve){
        this.llojiUshtrimeve = llojiUshtrimeve ;
    }

    @Override
    public String toString(){
        return "Asistenti " + this.getEmri() + " : " +this.getVitiLindjes() + " mban " + this.getAngazhimi() + llojiUshtrimeve ;
    }
}
/*
Ushtrimi ishte nje inheritanc(trashegimi) hieararkike 
per arsye se asistenti dhe profesori trashegojshin nga classa Mesimdhenesi 
 */