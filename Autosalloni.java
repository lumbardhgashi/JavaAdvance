/*
2.4.Krijoni klasën Autosalloni që ka emrin dhe automjete të ndryshme
a) Ofroni konstruktorin e kësaj klase, i cili pranon emrin e autosallonit.
b) Klasa e brendshme (ang. Inner class) Minibusi është një Automjet automatik, ka numrin e dyerëve,
reprezentohet në String si:
Minibusi <nrShasise> : <prodhuesi> - <vitiProdhimit> : <nrDyereve>
c) Klasa e ndërthurur (ang. static nested class) Coupe është një Automjet jo automatik, ka numrin e
ulëseve, reprezentohet në String si:
Coupe <nrShasise> : <prodhuesi> - <vitiProdhimit> - me <nrUleseve> ulese
d) Një autosallon mund të ketë 250 automjete (nuk duhet te deklarohet si konstante).
e) Çdo Autosallon e ka një Coupe të vjetër dy vite me dy ulëse
f) Ofroni metodën shtoAutomjetin që e shton një automjet nëse nuk ekziston dhe ka vend në varg.

g) Metoda shtoNjeAutomjet pranon parametrat per një automjet gjenerik, treguesin se a është
automatik apo jo dhe e shton këtë automjet në varg

h) Metoda shtoPrototipin pranon si parametra numrin e shasisë dhe prodhuesin (fillestar) dhe e shton
automjetin prototip në varg. Prototipi është i vitit aktual dhe nuk është automatik. Një autosallon
mund të ketë vetëm një automjet prototip.
i) Ofroni metodën avgNumriUleseve që kthen automjetin e fundit me më pak ulëse se mesatarja.
j) Metoda shtypAutomatik që shtyp automjetet (jo)automatike, varësisht nga parametri i pranuar.
k) Ofroni metodën main ku do të krijohet një instancë e klasës Autosalloni me emrin “Salloni ABC”,
dhe shtoni një prototip dhe nga një automjet të secilit lloj.
l) Të testohen të gjitha metodat
 */

public class Autosalloni {
    private String emriAutosallonit ;
    private Automjeti[] vargu ;
    private int index = 0 ;
    static int kapaciteti ;

    public Autosalloni(String emriAutosallonit){
        this.emriAutosallonit = emriAutosallonit ;
    }
    private class Minibusi extends Automjeti{
        private int nrDyrve ;

        @Override
        public boolean eshteAutomatik() {
            return true;
        }

        public Minibusi(int nrShasise ,String prodhuesi ,int vitiProdhimit ,int nrDyrve){
            super(nrShasise, prodhuesi, vitiProdhimit);
            this.nrDyrve = nrDyrve ;
        }

        public String toString(){
            return " Minibusi " +super.toString() + " : " + nrDyrve;
        }


    }

    private static class Coupe extends  Automjeti{
        private int nrEUleseve ;

        public Coupe(int nrShasise ,String prodhuesi ,int vitiProdhimit ,int nrEUleseve){
            super(nrShasise, prodhuesi, vitiProdhimit);
            this.nrEUleseve = nrEUleseve;
        }

        @Override
        public boolean eshteAutomatik() {
            return true;
        }

        @Override
        public String toString(){
            return " Coupe " +super.toString() + "- me " + nrEUleseve + " ulese ";
        }

    }

    static {
        kapaciteti = 250 ;
    }
    {
        vargu = new Automjeti[kapaciteti];
        Autosalloni.Coupe coupe = new  Autosalloni.Coupe(20,"BMW",2019,2);
        shtoAutomjetin(coupe);
    }

    public boolean ezksiton(Automjeti automjeti){
        for (int i = 0 ; i < index ; i++){
            if (vargu[i].equals(automjeti)){
                return true ;
            }
        }
        return false ;
    }

    public void shtoAutomjetin(Automjeti automjeti){
        if (automjeti == null){
            System.out.println("Automjeti nuk ekziston ");
            return;
        }
        if (index == vargu.length){
            System.out.println("Nuk ka vende te lira ne Autosallon i  kem 250 automjete ");
            return;
        }
        if (ezksiton(automjeti)){
            System.out.println("Automjeti ekziston ne autosallon !");
            return;
        }
        vargu[index++] = automjeti ;
    }




}
