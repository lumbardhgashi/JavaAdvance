/*
2.6.Krijoni klasën Autosalloni që ka atributin emri , dhe përmban një varg ku do të ruhen automjete të
ndryshme.
a) Ofroni konstruktorin e kësaj klase, i cili pranon emrin si dhe numrin e automjeteve.
b) Ofroni metodën shtoAutomjetin që e shton një automjet në varg nëse veq nuk ekziston dhe ka
vend në varg.
c) Ofroni metodën utility4x4 që i kthen utility vehicles që (nuk) janë 4x4 varësisht nga parametri që
i dërgohet metodës.
d) Ofroni metodën shtypLimuzinaNgjyra që i shtyp limuzinat që kanë një ngjyrë të caktuar. Ngjyra i
dërgohet metodës si parametër.
e) Ofroni metodën GPSMeIVjeter që kthen automjetin e fundit më të vjetër në autosallon që (nuk)
ka GPS varësisht nga parametri që i dërgohet metodës.
f) Ofroni metodën allTerrainProdhuesi që kthen automjetet e një prodhuesi që (nuk) janë
AllTerrain varësisht nga parametrat që i dërgohen metodës.
g) Ofroni metodën main dhe krijohet një instancë e klasës Autosalloni me emrin “Salloni ABC” që
mund të ketë 50 automjete, dhe shtoni automjete të ndryshme dhe testoni të gjitha metodat.
 */
public class AutoSalloni {
    private String emri ;
    private Automjeti [] vargu ;
    private int index ;

    public AutoSalloni(String emri ,int kapaciteti){
        this.emri = emri ;
        vargu = new Automjeti[kapaciteti];
    }

    public boolean ekziston(Automjeti automjeti){
        for (int i =0 ; i<index ;i++){
            if (vargu[i].equals(automjeti)){
                return true ;
            }
        }
        return false;
    }

    public void shtoAutomjetin(Automjeti automjeti){
        if (index >= vargu.length){
            System.out.println("Nuk ka vende te lira ne varg");
            return;
        }

            vargu[index++] = automjeti;
    }
    /*
    c) Ofroni metodën utility4x4 që i kthen utility vehicles që (nuk) janë 4x4 varësisht nga parametri që
i dërgohet metodës.
     */
    public Automjeti[] utility4x4(boolean eshte4x4){
        int count = 0 ;
        for (int i =0 ; i< index ; i++){
            if (vargu[i] instanceof UtilityVehicle && ((UtilityVehicle) vargu[i]).eshte4x4() == eshte4x4){
                count++;
            }
        }

        int temp = 0;
        Automjeti [] varguTemp = new Automjeti[count];
        for (int i = 0 ;i<index ; i++){
            if (vargu[i] instanceof UtilityVehicle && ((UtilityVehicle) vargu[i]).eshte4x4() == eshte4x4){
                varguTemp[temp++]=vargu[i];
            }
        }
        return varguTemp;
    }
    /*

     */
    public void shtypLimuzinaNgjyra(String ngjyra){

            for (int i = 0 ; i < index ; i++){
                if (vargu[i] instanceof Limuzina && ((Limuzina) vargu[i]).getNgjyra().equals(ngjyra)){
                    System.out.println(vargu[i]);
                }
            }
        }
    /*
    e) Ofroni metodën GPSMeIVjeter që kthen automjetin e fundit më të vjetër në autosallon që (nuk)
ka GPS varësisht nga parametri që i dërgohet metodës.
     */
    public Automjeti GPSMeiVjeter(boolean GPS){
        Automjeti automjeti = vargu[-0] ;
        for (int i = 0 ; i < index ; i++){
            if (vargu[i] instanceof MUV && (((MUV) vargu[i]).isKaGPS() == GPS) && vargu[i].getVitiProdhimit() > automjeti.getVitiProdhimit()){
                automjeti = (MUV) vargu[i];
            }
        }
        return automjeti ;
    }
    /*
    f) Ofroni metodën allTerrainProdhuesi që kthen automjetet e një prodhuesi që (nuk) janë
AllTerrain varësisht nga parametrat që i dërgohen metodës.
     */
    public Automjeti[] allTerrainProdhuesi(String prodhuesi,boolean AllTerrain){
        int count = 0 ;
        for (int i =0 ; i< index ; i++){
            if (vargu[i] instanceof SUV && ((SUV) vargu[i]).isEshteAllTerrain() == AllTerrain && vargu[i].getProdhuesi().equals(prodhuesi) ){
                count++;
            }
        }

        int temp = 0;
        Automjeti [] varguTemp = new Automjeti[count];
        for (int i =0 ; i< index ; i++){
            if (vargu[i] instanceof SUV && ((SUV) vargu[i]).isEshteAllTerrain() == AllTerrain && vargu[i].getProdhuesi().equals(prodhuesi) ){
                count++;
            }
        }
        return varguTemp;
    }
/*
g) Ofroni metodën main dhe krijohet një instancë e klasës Autosalloni me emrin “Salloni ABC” që
mund të ketë 50 automjete, dhe shtoni automjete të ndryshme dhe testoni të gjitha metodat.
 */
    public static void main(String[] args) {
        AutoSalloni autoSalloni = new AutoSalloni("Salloni LET ",50);

        Automjeti a1 = new Limuzina(20211,"BMW",2002,"KUQE");
        Automjeti a2 = new Limuzina(20212,"AUDI",2004,"ZEZE");
        Automjeti a3 = new Limuzina(20213,"BMW",2003,"KUQE");

        Automjeti a4 = new SUV(20214,"MERCEDES",2005,true);
        Automjeti a5 = new SUV(20215,"AUDI",2015,false);
        Automjeti a6 = new SUV(20216,"MERCEDES",2007,true);

        Automjeti a7 = new MUV(20217,"BMW",2018,true);
        Automjeti a8 = new MUV(20218,"AUDI",2019,false);
        Automjeti a9 = new MUV(20219,"BMW",2021,true);

        autoSalloni.shtoAutomjetin(a1);
        autoSalloni.shtoAutomjetin(a2);
        autoSalloni.shtoAutomjetin(a3);
        autoSalloni.shtoAutomjetin(a4);
        autoSalloni.shtoAutomjetin(a5);
        autoSalloni.shtoAutomjetin(a6);
        autoSalloni.shtoAutomjetin(a7);
        autoSalloni.shtoAutomjetin(a8);
        autoSalloni.shtoAutomjetin(a9);

        System.out.println("----------------------------------------------------------");
        System.out.println("UTILITY qe jane 4x4 jane : ");
        Automjeti [] a = autoSalloni.utility4x4(true);
        if (a != null) {
            for (Automjeti b:
                 a) {
                System.out.println(a);
            }
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Limuzinat me ngjyre te kuqe ne autosallonin tone jane : ");
        autoSalloni.shtypLimuzinaNgjyra("KUQE");
        System.out.println("----------------------------------------------------------");
        System.out.println("Automjeti qe ka GPS dhe eshte me i vjetri ne autosallonin tone eshte :");
        System.out.println(autoSalloni.GPSMeiVjeter(true));
        System.out.println("----------------------------------------------------------");
        Automjeti [] b =autoSalloni.allTerrainProdhuesi("BMW",true);
        for (int i = 0 ; i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println("----------------------------------------------------------");


    }
}
