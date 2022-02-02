package Ushtrimi2;

public class Autosalloni {
    private String emri ;
    private Automjeti[] vargu ;
    private int index = 0 ;

    public Autosalloni(String emri , int kapaciteti){
        this.emri=emri;
        vargu=new Automjeti[kapaciteti];
    }
    public boolean ekziston(Automjeti automjeti){
        for (int i=0;i<index ;i++){
            if (vargu[i].equals(automjeti)) {
                return true;
            }
        }
        return false;
    }
    public void shtoAutomjetin(Automjeti automjeti){
        if (ekziston(automjeti)){
            System.out.printf("Autonjeti %s ekziston ne varg ! ",automjeti);
            return;
        }
        if (index>= vargu.length){
            System.out.println("Nuk ka vende te lira ne varg");
            return;
        }
        if (automjeti==null){
            System.out.println("Automjet i pakuptimt !");
            return;
        }
        vargu[index++]=automjeti;
    }
    public void shtypNgjyrat(String ngjyra){
        for (int i =0;i<index;i++){
            if (vargu[i] instanceof Limuzina && ((Limuzina) vargu[i]).getNgjyra().equals(ngjyra) ){
                System.out.println(vargu[i]);
            }
        }
        return;
    }
    public Automjeti suvMeIVjeter(){
        Automjeti suv = null ;
        for (int i =0;i<index ;i++){
            if (vargu[i] instanceof SUV && vargu[i].getVitiProdhimit() < suv.getVitiProdhimit() || suv == null ){
                suv = vargu[i];
            }
        }
        return suv ;
    }

    public static void main(String[] args) {
        Autosalloni autosalloni = new Autosalloni("Salloni \"Gashi\"",50);
        Limuzina l1 = new Limuzina("Kuqe",12345,"BMW",2009);
        Limuzina l2 = new Limuzina("Zeze",1234,"Mercedes",2010);
        Limuzina l3 = new Limuzina("Kalter",1345,"BMW",2011);
        Limuzina l4 = new Limuzina("Verdh",345,"Audi",2015);
        Limuzina l5 = new Limuzina("Kuqe",1235,"Mercedes",2009);
        autosalloni.shtoAutomjetin(l1);
        autosalloni.shtoAutomjetin(l2);
        autosalloni.shtoAutomjetin(l3);
        autosalloni.shtoAutomjetin(l4);
        autosalloni.shtoAutomjetin(l5);
        SUV s1 = new SUV(false,56789,"Range Rover",2005);
        SUV s2 = new SUV(true,5678,"BMW",2006);
        SUV s3 = new SUV(false,5679,"Range Rover",2008);
        SUV s4 = new SUV(false,5689,"Mercedes",2005);
        SUV s5 = new SUV(true,5789,"BMW",2007);
        autosalloni.shtoAutomjetin(s1);
        autosalloni.shtoAutomjetin(s2);
        autosalloni.shtoAutomjetin(s3);
        autosalloni.shtoAutomjetin(s4);
        autosalloni.shtoAutomjetin(s5);

        System.out.println(autosalloni.ekziston(l2));
        System.out.print("Suv-i me i vjeter eshte => ");
        System.out.println(autosalloni.suvMeIVjeter());
       autosalloni.shtypNgjyrat("Kalter");
    }
}
