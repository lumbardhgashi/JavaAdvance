/*
1.5. Krijoni klasën Fakulteti që ka drejtimin dhe mësimdhënës të ndryshëm.
a) Ofroni konstruktorin e kësaj klase, i cili pranon drejtimin si dhe numrin e mësimdhënësve.
b) Ofroni metodën shtoMesimdhenesin që e shton një mësimdhënës nëse ai nuk ekziston
c) Metoda shtypFushaStudimit që shtyp mësimdhënësit e një fushe studimi të caktuar.
d) Metoda ktheAngazhimin që kthen mësimdhënësit me një angazhim të caktuar.
e) Ofroni metodën main ku do të krijohet një instancë e klasës Fakulteti me drejtim “Shkenca
Kompjuterike”, shtoni mësimdhënës të ndryshëm dhe testoni të gjitha metodat.
 */
public class Fakulteti {
    private String drejtimi ;
    private Mesimdhenesi[] vargu ;
    private int index = 0 ;

    public Fakulteti(String drejtimi ,int kapaciteitVargut){
        this.drejtimi = drejtimi ;
        vargu = new Mesimdhenesi[kapaciteitVargut];
    }
    public boolean ekziston(Mesimdhenesi mesimdhenesi){
        for (int i = 0 ; i <index ; i++){
            if (vargu[i].equals(mesimdhenesi)){
                return true;
            }
        }
        return false ;
    }

    public void shtoMesimdhenesin(Mesimdhenesi mesimdhenesi) {
        if (mesimdhenesi == null) {
            System.out.println("Mesimdhenesi esht null");
            return;
        }
        if (index == vargu.length) {
            System.out.println("Nuk ka vende te lira ne varg ");
            return;
        }
        if (ekziston(mesimdhenesi)) {
            System.out.println("Mesimdhenesi ekziston ");
            return;
        }
        vargu[index++] = mesimdhenesi;
    }

    public void shtypFushaStudimit(String fushaStudimit){
        for (int i = 0; i< index ;i++){
            if (vargu[i].getFushaStudimit().equals(fushaStudimit)){
                System.out.println(vargu[i]);
            }
        }
    }

    public Mesimdhenesi[] ktheAngazhimin (String angazhimi){
        int count = 0 ;
        for (int i = 0; i <index ;i++){
            if (vargu[i].getAngazhimi().equals(angazhimi)){
                count++;
            }
        }
        int temp = 0 ;
        Mesimdhenesi [] temporaryVarg = new  Mesimdhenesi[ count];

        for (int i = 0; i <index ;i++){
            if (vargu[i].getAngazhimi().equals(angazhimi)){
                temporaryVarg[temp++]=vargu[i];
            }
        }
        return temporaryVarg;
    }
    /*
    e) Ofroni metodën main ku do të krijohet një instancë e klasës Fakulteti me drejtim “Shkenca
Kompjuterike”, shtoni mësimdhënës të ndryshëm dhe testoni të gjitha metodat.
     */
    public static void main(String[] args) {
        Fakulteti ubt = new Fakulteti("Shkenca kompjuterike" ,50);

        Mesimdhenesi m1 = new Profesori("Blerim",1990,"Shkenca kompjuterike","i rregullt");
        Mesimdhenesi m2 =new Profesori("Agron",2000,"Sisteme digjitale","i asocuar");

        Mesimdhenesi m3 =new Asistenti("Agim",1995,"Sisteme digjitale","Numerike");
        Mesimdhenesi m4 = new Asistenti("Egzon",2000,"Shkenca kompjuterike","Numerike");

        ubt.shtoMesimdhenesin(m1);
        ubt.shtoMesimdhenesin(m2);
        ubt.shtoMesimdhenesin(m3);
        ubt.shtoMesimdhenesin(m4);

        System.out.println("---------------------------------------------");
        ubt.shtypFushaStudimit("Sisteme digjitale");
        System.out.println("---------------------------------------------");
        Mesimdhenesi [] ktheM = ubt.ktheAngazhimin("Ligjerata");
        for (int i = 0 ; i < ktheM.length ; i++){
            System.out.println(ktheM[i]);
        }
        System.out.println("---------------------------------------------");


    }


}
