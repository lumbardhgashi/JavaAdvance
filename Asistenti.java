import groovyjarjarpicocli.CommandLine;

/*
1.4. Klasa konkrete Asistenti është një Mësimdhënës që angazhohet në  “ Ushtrime”
 dhe nuk mund të mentoroj punime diplome , ka atributin shtesë llojiUshtimreve
 dhe  reprezentohet në String në formatin:
Asistenti <emri> : < vitiLindjes > me fushe studimi <fushaStudimit> mban <angazhimi> <llojiUshtrimeve>

 */
public class Asistenti extends Mesimdhenesi{
    private String llojiUshtrimeve;

    public Asistenti(String emri, int vitiLindjes, String fushaStudimit,String llojiUshtrimeve) throws MesimdhenesiExecption {
        super(emri, vitiLindjes, fushaStudimit);
        if (llojiUshtrimeve.equals("") || llojiUshtrimeve.trim().isEmpty()){
            throw new MesimdhenesiExecption("Shenoni nje lloj te Ushtrimve Valide te tipit String !!!");
        }
        this.llojiUshtrimeve =llojiUshtrimeve;

    }

    @Override
    public String getAngazhimi() {
        return "Ushtrime";
    }

    @Override
    public boolean mentoron() {
        return false;
    }
    public String getLlojiUshtrimeve(){
        return llojiUshtrimeve;
    }

    public void setLlojiUshtrimeve(String llojiUshtrimeve) throws MesimdhenesiExecption {
        if (llojiUshtrimeve.equals("") || llojiUshtrimeve.trim().isEmpty()){
            throw  new MesimdhenesiExecption("Shenoni nje lloj te Ushtrimeve Valide te tipit String !!!");
        }
        this.llojiUshtrimeve = llojiUshtrimeve;
    }

    @Override
    public String toString(){
        return "Asistenti "+super.toString()+" mban "+getAngazhimi()+ " "+llojiUshtrimeve;
    }
}
