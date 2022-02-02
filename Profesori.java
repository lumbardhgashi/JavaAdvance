/*
1.3. Klasa konkrete Profesori është një Mësimdhënës që angazhohet në  “Ligjerata”  dhe mund
të mentoroj punime diplome, ka atributin shtesë thirrjaAkademike dhe  reprezentohet në String në formatin:
Profesori <emri> : < vitiLindjes > me fushe studimi <fushaStudimit>, mban <angazhimi>, ka thirrje <thirrjaAkademike>

 */
public class Profesori extends Mesimdhenesi{
    private String thirrjaAkademike;

    public Profesori(String emri, int vitiLindjes, String fushaStudimit,String thirrjaAkademike) throws MesimdhenesiExecption {
        super(emri, vitiLindjes, fushaStudimit);
        if (thirrjaAkademike.equals("") || thirrjaAkademike.trim().isEmpty()){
            throw new MesimdhenesiExecption("Shenoni nje thirrje Akademike valide te tipit Strign");
        }
            this.thirrjaAkademike = thirrjaAkademike;
    }

    public String getThirrjaAkademike() {
        return thirrjaAkademike;
    }

    public void setThirrjaAkademike(String thirrjaAkademike) throws MesimdhenesiExecption{
        if (thirrjaAkademike.equals("") || thirrjaAkademike.trim().isEmpty()){
            throw new MesimdhenesiExecption("Shenoni nje thirrje Akademike valide te tipit Strign");
        }
        this.thirrjaAkademike = thirrjaAkademike;
    }

    @Override
    public String getAngazhimi() {
        return "Ligjerata";
    }

    @Override
    public boolean mentoron() {
        return true;
    }

   @Override
    public String toString(){
        return "Profesori " + super.toString()+" ,mban "+ getAngazhimi() +", ka thirrje "+thirrjaAkademike;
    }
}
