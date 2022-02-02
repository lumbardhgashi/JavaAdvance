/*
1.5. Krijoni klasën Fakulteti që ka drejtimin dhe mësimdhënës të ndryshëm.
a)   Ofroni konstruktorin e kësaj klase, i cili pranon drejtimin si dhe numrin e mësimdhënësve.
b)   Ofroni metodën shtoMesimdhenesin që e shton një mësimdhënës nëse ai nuk ekziston
c)   Metoda   shtypAngazhimiFusha që shtyp mësimdhënësit me një angazhim dhe një fushe studimi të caktuar.
d)   Metoda mentoriMeIVjeter që kthen mësimdhënësit e fundit më të vjetër që mentoron.
e)   Ofroni metodën main ku do të krijohet një instancë e klasës Fakulteti me drejtim “Shkenca
Kompjuterike”, shtoni mësimdhënës të ndryshëm dhe testoni të gjitha metodat.
 */
public class Fakulteti {
    private String drejtimi;
    private Mesimdhenesi[] vargu ;
    private int index = 0 ;

    public Fakulteti(String drejtimi , int kapacitetiVargut) throws MesimdhenesiExecption{
        if (drejtimi.equals("") || drejtimi.trim().isEmpty()){
            throw new MesimdhenesiExecption("Ndryshoni Drejtimin e shenuar dhe shenoni nje tjeter valid te tipit String");
        }
        if (kapacitetiVargut <0){
            throw new MesimdhenesiExecption("Gjatesia e vargut nuk mund te jete me e vogel se 0");
        }
        this.drejtimi = drejtimi ;
        vargu = new Mesimdhenesi[kapacitetiVargut];
    }

    public boolean ekziston(Mesimdhenesi mesimdhenesi) throws MesimdhenesiExecption{
        if (mesimdhenesi == null){
            throw new MesimdhenesiExecption("Nuk mund te jet nje mesimdhenes null ");
        }
        for (int i=0;i<index ;i++){
            if (vargu[i].equals(mesimdhenesi)){
                return true;
            }
        }
        return false;
    }

    public void shtoMesimdhenesin(Mesimdhenesi mesimdhenesi)throws MesimdhenesiExecption{
        if (mesimdhenesi == null){
            throw new MesimdhenesiExecption("Mesimdhenesi nuk duhet jet null");
        }
        if (index == vargu.length) {
            throw new MesimdhenesiExecption("Nuk ka vende te lira ne varg");
        }
        if (ekziston(mesimdhenesi)){
            throw new MesimdhenesiExecption("Mesimdhenesi: "+mesimdhenesi.getEmri()+"Ekziston");
        }
        vargu[index++]=mesimdhenesi;
    }

    public void shtypAngazhimiFusha(String angazhimi , String fushaStudimit) throws MesimdhenesiExecption{
        if (angazhimi.equals("") || angazhimi.trim().isEmpty()){
            throw new MesimdhenesiExecption("Angazhimi duhet te jet valid i tipit String !!!");
        }

        if (fushaStudimit.equals("") || fushaStudimit.trim().isEmpty()){
            throw new MesimdhenesiExecption("fushaStudimit duhet te jet valid i tipit String !!!");
        }
        for (int i =0;i<index ;i++){
            if (vargu[i].getAngazhimi().equals(angazhimi) && vargu[i].getFushaStudimit().equals(fushaStudimit)){
                System.out.println(vargu[i]);
            }
        }
    }

    public Mesimdhenesi mentoriMeIVjeter(){

        Mesimdhenesi meIVjeter = null ;

        for (int i = 0 ;i<index ;i++){
            if (meIVjeter == null || vargu[i].mentoron() == true && vargu[i].getVitiLindjes() < meIVjeter.getVitiLindjes()){
                meIVjeter = vargu[i];
            }
        }
        return meIVjeter;
    }

    public static void main(String[] args) throws MesimdhenesiExecption {

        Fakulteti fakulteti = new Fakulteti("Shkenca kompjuterike",20);

        Mesimdhenesi m1 = new Profesori("Blerim Zylfiu",1992,"Shkenca Kompjuterike","i rregullt");
        Mesimdhenesi m2 = new Profesori("Lumbardh Gashi",2002,"Shkenca Kompjuterike","i rregullt");
        Mesimdhenesi m3 = new Profesori("Nami  Gashi",1992,"Kimi","i asocuar");
        Mesimdhenesi m4 = new Profesori("Aron Krasinqi",1992,"Ekonomi","i i asocuar");
        Mesimdhenesi m5 = new Profesori("Egzon Pajaziti",2002,"Shkenca Kompjuterike","i rregullt");

        Mesimdhenesi m6 = new Asistenti("Tigran Gashi",2002,"Shkenca Kompjuterike","Laboratorike");
        Mesimdhenesi m7 = new Asistenti("Arber Zeka",2000,"Ekonomi","Numerike");
        Mesimdhenesi m8 = new Asistenti("Egzon Mustafa",2002,"Shkenca Kompjuterike","Numerike");
        Mesimdhenesi m9 = new Asistenti("Ramiz Dina",2002,"Shkenca Kompjuterike","Numerike");
        Mesimdhenesi m10 = new Asistenti("Mergim Dina",2002,"Shkenca Kompjuterike","Laboratorike");

        fakulteti.shtoMesimdhenesin(m1);
        fakulteti.shtoMesimdhenesin(m2);
        fakulteti.shtoMesimdhenesin(m3);
        fakulteti.shtoMesimdhenesin(m4);
        fakulteti.shtoMesimdhenesin(m5);
        fakulteti.shtoMesimdhenesin(m6);
        fakulteti.shtoMesimdhenesin(m7);
        fakulteti.shtoMesimdhenesin(m8);
        fakulteti.shtoMesimdhenesin(m9);
        fakulteti.shtoMesimdhenesin(m10);

        System.out.println("------------------------------------------");

        fakulteti.shtypAngazhimiFusha("Ligjerata","Shkenca Kompjuterike");

        System.out.println("-------------------------------------------");

        System.out.println(fakulteti.mentoriMeIVjeter());

        System.out.println("------------------------------------------");

    }
}
