import javax.swing.*;

/*
1.4.Krijoni klasën Fakulteti që ka drejtimin dhe mësimdhënës të ndryshëm.
a) Ofroni konstruktorin e kësaj klase, i cili pranon drejtimin e fakultetit.
b) Klasa e brendshme (ang. Inner class) Tutori është një Mësimdhënës, ka vitin e studimeve, nuk
mund të mentoroj, ka angazhimin “Tutorime”, dhe reprezentohet në String si:
Tutori i vitit <vitiStudimeve>: <emri> : < vitiLindjes > angazhohet ne <angazhimi>

Deri qetu e bonem !!!!!!!!!!!!!!!!!!!!!

c) Klasa e ndërthurur (ang. static nested class) Vizituesi është një Mësimdhënës, ka numrin e orëve,
mund të mentoroj, me angazhim të ndryshëmm, dhe reprezentohet në String si:
Mesimdhenesi vizitues <emri> : < vitiLindjes > angazhohet ne <angazhimi> me <nrOreve> ore

d) Një fakultet mund të ketë 25 mësimdhënës (nuk duhet te deklarohet si konstante).
e) Çdo fakultet ka një mësimdhënës vizitues me 10 orë mësimore për semestër

f) Ofroni metodën shtoMesimdhenesin që e shton një mësimdhënës nëse ai nuk ekziston.

g) Metoda shtypSipasEmrit shtyp mësimdhënësit emri i të cilëve përfundon me tekst të caktuar.

h) Metoda avgVitiLindjes kthen mësimdhënësin e fundit me vit të lindjes më të hershëm se
mesatarja e viteve të lindjes së të gjithë mësimdhënësve.

i) Ofroni metodën main ku do të krijohet një instancë e klasës Fakulteti me drejtim “Shkenca
Kompjuterike”, shtoni mësimdhënës të ndryshëm dhe testoni të gjitha metodat.
 */
public class Fakulteti {
    private String drejtimi;
    private Mesimdhenesi[] vargu;
    private int index;
    static int kapaciteti;

    public Fakulteti(String drejtimi) {
        this.drejtimi = drejtimi;
    }

    static {
        kapaciteti = 9;
    }

    {
        vargu = new Mesimdhenesi[kapaciteti];
        Fakulteti.Vizituesi v = new Fakulteti.Vizituesi("Gashi", 2000, "Ligjerata", 10);
        shtoMesimdhenesin(v);
    }

    public class Tutori extends Mesimdhenesi {
        private int vitiStudimeve;

        @Override
        public boolean mentoron() {
            return false;
        }

        public Tutori(String emri, int vitiLindjes, int vitiStudimeve) {
            super(emri, vitiLindjes, "Tutorime");
            this.vitiStudimeve = vitiStudimeve;
        }

        public String toString() {
            return "Tutori i vitit " + vitiStudimeve + super.toString();
        }
    }

    /*
    c) Klasa e ndërthurur (ang. static nested class) Vizituesi është një Mësimdhënës, ka numrin e orëve,
mund të mentoroj, me angazhim të ndryshëmm, dhe reprezentohet në String si:
Mesimdhenesi vizitues <emri> : < vitiLindjes > angazhohet ne <angazhimi> me <nrOreve> ore
     */
    public static class Vizituesi extends Mesimdhenesi {
        private int nrOreve;

        @Override
        public boolean mentoron() {
            return true;
        }

        public Vizituesi(String emri, int vitilindjes, String angazhimi, int nrOreve) {
            super(emri, vitilindjes, angazhimi);
            this.nrOreve = nrOreve;
        }

        public String toString() {
            return "Mesimdhenesi vizitues " + super.toString() + " me " + nrOreve + " ore";
        }
    }

    public boolean ekziston(Mesimdhenesi mesimdhenesi) {
        for (int i = 0; i < index; i++) {
            if (vargu[i].equals(mesimdhenesi)) {
                return true;
            }
        }
        return false;
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

    public void shtypSipasEmrit(String texti) {
        for (int i = 0; i < index; i++) {
            if (vargu[i].getEmri().endsWith(texti)) {
                System.out.println(vargu[i]);
            }
        }
    }

    /*
    h) Metoda avgVitiLindjes kthen mësimdhënësin e fundit me vit të lindjes më të hershëm se
    mesatarja e viteve të lindjes së të gjithë mësimdhënësve.
     */
    public Mesimdhenesi avgVitiLindjes() {
        int count = 0;
        int sum = 0;
        Mesimdhenesi mesimdhenesi = null;
        for (int i = 0; i < index; i++) {
            sum += ((Mesimdhenesi) vargu[i]).getVitilindjes();
            count++;
        }
        double mesatarja = (double) sum / (double) count;
        // System.out.printf("Mosha mesatare e te gjithe mesimdheneseve eshte %d" , mesatarja);
        for (int i = 0; i < index; i++) {
            if (vargu[i].getVitilindjes() >= mesatarja) {
                mesimdhenesi = vargu[i];
            }
        }
        return mesimdhenesi;

    }

    public void printAll() {
        for (int i = 0; i < index; i++) {
            System.out.printf("Mesimdhenesi numer %d eshte : %s %n", i + 1, vargu[i]);
        }
    }

    /*
    i) Ofroni metodën main ku do të krijohet një instancë e klasës Fakulteti me drejtim “Shkenca
    Kompjuterike”, shtoni mësimdhënës të ndryshëm dhe testoni të gjitha metodat.
     */
    public void profesoriMeEmrinMeTeKeq() {

    }


    public static void main(String[] args) {
        Fakulteti f1 = new Fakulteti("Shkenca Kompjuterike");

        Mesimdhenesi m1 = new Vizituesi("Agron", 1997, "Ushtrime", 12);
        Mesimdhenesi m2 = new Vizituesi("Agim", 2003, "Ligjerata", 16);

        Mesimdhenesi m3 = new Asistenti("Tigran", 1998, "Numerike");
        Mesimdhenesi m4 = new Asistenti("Gezim", 1996, "Laboratorike");

        Mesimdhenesi m5 = f1.new Tutori(" Arber", 1999, 2);
        Mesimdhenesi m6 = f1.new Tutori(" Benis", 1992, 1);

        Mesimdhenesi m7 = new Profesori("Egzon", 2002, "i rregullt");
        Mesimdhenesi m8 = new Profesori("Lumbardh", 2002, "i rregullt");

        f1.shtoMesimdhenesin(m1);
        f1.shtoMesimdhenesin(m2);
        f1.shtoMesimdhenesin(m3);
        f1.shtoMesimdhenesin(m4);
        f1.shtoMesimdhenesin(m5);
        f1.shtoMesimdhenesin(m6);
        f1.shtoMesimdhenesin(m7);
        f1.shtoMesimdhenesin(m8);

        System.out.println("--------------------------------------------------------");
        System.out.println(f1.avgVitiLindjes());
        System.out.println("--------------------------------------------------------");
        f1.shtypSipasEmrit("bardh");
        f1.shtypSipasEmrit("gzon");
        System.out.println("--------------------------------------------------------");
        f1.printAll();
        System.out.println("--------------------------------------------------------");

        // Kjo zgjedh Mesimdhenes random nga vargu jone !!!
        System.out.print("Mesimdhenesi me i lodht :  ");
        Mesimdhenesi randomValue = f1.vargu [(int)Math.floor (Math.random () * f1.vargu.length)];
        System.out.println(randomValue);

    }
}
