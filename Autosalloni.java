/*
2.5. Krijoni klasën Autosalloni që ka atributin emri , dhe përmban një  varg ku do të ruhen si limuzina
ashtu edhe SUV.

a)     Ofroni konstruktorin e kësaj klase, i cili pranon emrin si dhe numrin e automjeteve.
b)	Ofroni metodën shtoAutomjetin që e shton një automjet në varg nëse veq nuk ekziston dhe ka vend në varg.
c)	Metoda  shtypShpejtesiaProdhuesi që shtyp automjetet me një numër të shpejtësive deh një prodhues të caktuar.
d)     Metoda tempomatiMeIRi që kthen automjetin e fundit më të ri që ka tempomat.
e)	Ofroni metodën main dhe krijohet një instancë e klasës Autosalloni me emrin “Salloni ABC” që mund të ketë 50 automjete,
dhe shtoni disa limuzina ashtu edhe SUV dhe të testohen të gjitha metodat.
 */
public class Autosalloni {


    private String emri ;
    private Automjeti[] vargu ;
    private int index ;

    public String getEmri() {
        return emri;
    }

    public Autosalloni(String emri , int kapacitetiVargut)throws AutomjetiExecption{
        if (emri.equals("") || emri.trim().isEmpty()){
            throw new AutomjetiExecption("Nje gabim u detektua ne emrin e Autosallonit !!!");
        }
        if (kapacitetiVargut < 0){
            throw new AutomjetiExecption("Nuk munde te jete gjatesia e vargut negative !!!");
        }
        this.emri = emri ;
        vargu = new Automjeti[kapacitetiVargut];
    }
    public boolean ekziston(Automjeti automjeti) throws AutomjetiExecption{
        if (automjeti == null){
            throw new AutomjetiExecption("ka ndodhur nje gabim tek inicializimi i Automjetit ");
        }
        for (int i = 0 ; i< index ; i++){
            if (vargu[i].equals(automjeti)){
                return true;
            }
        }
        return false;
    }

    public void shtoAutomjetin(Automjeti automjeti) throws AutomjetiExecption{
        if (automjeti == null){
            throw new AutomjetiExecption("Nuk mund te jet automjeti null");
        }
        if (index == vargu.length){
            throw new AutomjetiExecption("Nuk ka vende te lira ne varg");
        }
        if (ekziston(automjeti)){
            throw new AutomjetiExecption("Automjeti me nr te shasise "+automjeti.getNrShasise()+" Ekziston");
        }
        vargu[index++] = automjeti;
    }

    public void shtypShpejtesiaProdhuesi(int numriShpejtesive , String prodhuesi) throws AutomjetiExecption{
        if (numriShpejtesive < 5){
            throw new AutomjetiExecption("Nuk ekzsiton makin me me pak se 5 shpejtesi");
        }
        if (prodhuesi.equals("") || prodhuesi.trim().isEmpty()){
            throw new AutomjetiExecption("U Dedektua nje  gabim tek Prodhuesi");
        }
        for (int i = 0 ;i<index ; i++){
            if (vargu[i].numriShpejtesive() == numriShpejtesive && vargu[i].getProdhuesi().equals(prodhuesi)){
                System.out.println(vargu[i]);
            }
        }
    }

    public Automjeti tempomatiMeIRi(){
        Automjeti automjeti = null;
        for (int i =0;i<index ;i++ ){
            if ( automjeti == null ||vargu[i].kaTempomat() == true && vargu[i].getVitiProdhimit() >= automjeti.getVitiProdhimit()){
                automjeti = vargu[i];
            }
        }
        return automjeti;
    }

    public void printAllCars(){
        int count = 1;
        for (int i = 0 ; i < index;i++) {
            System.out.println("Makina e " + count++  + " ne Autosallonin \"ABC\" eshte : " + vargu[i]);
        }
    }

    public static void main(String [] args) throws AutomjetiExecption {


        Autosalloni autosalloni = new Autosalloni("ABC",50);
        Automjeti a1 = new Limuzina(123456,"BMW",2019,"Kuqe");
        Automjeti a2 = new Limuzina(123457,"Mercedes",2012,"Bardhe");
        Automjeti a3 = new Limuzina(123458,"BMW",2019,"Kuqe");
        Automjeti a4 = new Limuzina(123459,"Audi",2019,"Kalter");
        Automjeti a5 = new Limuzina(123455,"BMW",2022,"Bardhe");

        Automjeti a6 = new SUV(123450,"BMW",2020,true);
        Automjeti a7 = new SUV(123451,"Mercedes",2019,true);
        Automjeti a8 = new SUV(123452,"BMW",2013,false);
        Automjeti a9 = new SUV(123453,"Audi",2020,false);
        Automjeti a10 = new SUV(123454,"BMW",2022,true);

        autosalloni.shtoAutomjetin(a1);
        autosalloni.shtoAutomjetin(a2);
        autosalloni.shtoAutomjetin(a3);
        autosalloni.shtoAutomjetin(a4);
        autosalloni.shtoAutomjetin(a5);
        autosalloni.shtoAutomjetin(a6);
        autosalloni.shtoAutomjetin(a7);
        autosalloni.shtoAutomjetin(a8);
        autosalloni.shtoAutomjetin(a9);
        autosalloni.shtoAutomjetin(a10);


        System.out.println("Pershendetje !\nMire se erdhet ne AutoSallonin \""+autosalloni.getEmri()+"\" \nNe ne AutoSallonin \""+autosalloni.getEmri()+"\" posedojme gjithsej "+ autosalloni.index +" vetura");
        System.out.println("------------------------------------------------");
        autosalloni.printAllCars();
        System.out.println("------------------------------------------------");
        autosalloni.shtypShpejtesiaProdhuesi(6,"BMW");
        System.out.println("------------------------------------------------");
        System.out.println("Automjeti me i Ri qe posedon tempomat eshte :");
        System.out.println(autosalloni.tempomatiMeIRi());
        System.out.println("------------------------------------------------");
    }
}
