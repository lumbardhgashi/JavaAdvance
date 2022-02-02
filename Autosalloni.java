/*
2.5. Krijoni klasën Autosalloni që ka atributin emri , dhe përmban një varg ku do të ruhen si limuzina
ashtu edhe SUV.
a) Ofroni konstruktorin e kësaj klase, i cili pranon emrin si dhe numrin e automjeteve.
b) Ofroni metodën shtoAutomjetin që e shton një automjet në varg nëse veq nuk ekziston dhe ka
vend në varg.
c) Metoda shtypNumriShpejtesive që shtyp automjetet me një numër te caktuar te shpejtësive,
varësisht nga parametri i pranuar.
d) Metoda ktheMeTempomat që kthen automjetet me/pa tempomat, varësisht nga parametri i
pranuar.
e) Ofroni metodën main dhe krijohet një instancë e klasës Autosalloni me emrin “Salloni ABC” që
mund të ketë 50 automjete, dhe shtoni disa limuzina ashtu edhe SUV.
f) Të testohen të gjitha metodat.
 */
public class Autosalloni {
    private String emri ;
    private Automjeti[] vargu ;
    private int index = 0 ;


    public Autosalloni(String emri,int kapacitetiVargut) {
        this.emri = emri;
        vargu = new Automjeti[kapacitetiVargut];
    }


    public boolean ekziston(Automjeti automjeti){
        for (int i =0 ;i < index ; i++){
            if (vargu[i].equals(automjeti)){
                return true;
            }
        }
        return false;
    }

    public void shtoAutomjetin(Automjeti automjeti){
        if (automjeti == null){
            System.out.println("Automjeti eshte null");
            return;
        }
        if (index == vargu.length){
            System.out.println("Nuk ka vende te lira ne varg");
            return;
        }
        if (ekziston(automjeti)){
            System.out.println("Automjeti ekziston");
            return;
        }
        vargu[index++] = automjeti;
    }

    public void shtypNumriShpejtesive(int nrShpejtsive){
        for (int i = 0 ; i < index ; i++){
            if (vargu[i].numriShpejtsive() == nrShpejtsive){
                System.out.println(vargu[i]);
            }
        }
    }

    public Automjeti[] ktheMeTempomat(boolean kaTempomat){
        int count = 0 ;
        for (int i = 0 ; i < index ; i++){
            if (vargu[i].kaTempomat() == kaTempomat){
                count++;
            }
        }
        int temp = 0 ;
        Automjeti [] temporaryVarg = new Automjeti[count];
        for (int i = 0 ; i < index ; i++){
            if (vargu[i].kaTempomat() == kaTempomat){
                temporaryVarg[temp++]=vargu[i];
            }
        }
        return temporaryVarg ;

    }

    public static void main(String[] args) {
        Autosalloni autosalloni = new Autosalloni("Salloni ABC" ,50);

        Automjeti a1 = new Limuzina(525252,"BMW",2019,"E Bardhe");
        Automjeti a2 = new Limuzina(525253,"Mercedes",2020,"E Zeze");
        Automjeti a3 = new Limuzina(525254,"Audi",2009,"E Bardhe");
        Automjeti a4 = new Limuzina(525442,"BMW",2021,"E Kuqe");

        Automjeti a5 = new SUV(112233,"BMW",2012,true);
        Automjeti a6 = new SUV(112244,"Mercedes",2021,false);
        Automjeti a7 = new SUV(112255,"Audi",2019,true);
        Automjeti a8 = new SUV(112266,"BMW",2015,false);

        autosalloni.shtoAutomjetin(a1);
        autosalloni.shtoAutomjetin(a2);
        autosalloni.shtoAutomjetin(a3);
        autosalloni.shtoAutomjetin(a4);
        autosalloni.shtoAutomjetin(a5);
        autosalloni.shtoAutomjetin(a6);
        autosalloni.shtoAutomjetin(a7);
        autosalloni.shtoAutomjetin(a8);

        System.out.println("-----------------------------------------");
        autosalloni.shtypNumriShpejtesive(5);

        System.out.println("-----------------------------------------");
        Automjeti [] kthe =autosalloni.ktheMeTempomat(false);
        for (int i = 0 ; i < kthe.length ; i++){
            System.out.println(kthe[i]);
        }



    }


}
