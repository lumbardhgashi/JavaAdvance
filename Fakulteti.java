public class Fakulteti {
    private String drejtimi;
    private Mesimdhenesi[] vargu;
    private int index = 0;

    public Fakulteti(String drejtimi, int kapaciteti) {
        this.drejtimi = drejtimi;
        vargu = new Mesimdhenesi[kapaciteti];
    }

    public boolean ekziston(Mesimdhenesi m) {
        for (int i = 0; i < index; i++) {
            if (vargu[i].equals(m)) {
                return true;
            }
        }
        return false;
    }

    public void shtoMesimdhenesin(Mesimdhenesi m) {
        if (ekziston(m)) {
            System.out.printf("Mesimdhenesi me emrin %s -> Ekziston ne Varg ", m.getEmri());
            return;
        }
        if (index >= vargu.length) {
            System.out.println("Nuk ka vende te lira ne varg");
            return;
        }
        vargu[index++] = m;
    }

    public Mesimdhenesi profesoriMeIRi() {
        Mesimdhenesi profiMeIRi = null;
        for (int i = 0; i < index; i++) {
            if (profiMeIRi == null){
                profiMeIRi = vargu[0];
            }
            if (vargu[i] instanceof Profesori && vargu[i].getVitiLindjes() <= profiMeIRi.getVitiLindjes() ) {
                profiMeIRi = vargu[i];
            }
        }
        return profiMeIRi;
    }

    public Mesimdhenesi[] shtypLlojinEUshtrimeve(String ushtrimi) {
        int count = 0; // per inicializimin e vargut
        for (int i = 0; i < index; i++) {
            if (vargu[i] instanceof Asistenti && ((Asistenti) vargu[i]).getLlojiUshtrimeve().equals(ushtrimi)) {
                count++;
            }
        }
        int temp = 0; // per iterimin e rregullt dhe insertimin me rend ne vargun temporaryVarg
        Mesimdhenesi[] temporaryVarg = new Mesimdhenesi[count];

        for (int i = 0; i < index; i++) {
            if (vargu[i] instanceof Asistenti && ((Asistenti) vargu[i]).getLlojiUshtrimeve().equals(ushtrimi)) {
                temporaryVarg[temp++] = vargu[i];
            }
        }
        return temporaryVarg;
    }

    public static void main(String[] args) {
        Fakulteti f1 = new Fakulteti("Shkenca Kompjuterike", 15);
        Profesori p1 = new Profesori("Profesor i rregullt ", "Blerim Zylfiu", 1990, "Ligjerata");
        Profesori p2 = new Profesori("Profesor i rregullt ", "Agon Gashi", 1991, "Ushtrime");
        Profesori p3 = new Profesori("Profesor i asocuar ", "Blerta Krasniqi", 1992, "Ligjerata");
        Profesori p4 = new Profesori("Profesor i asocuar ", "Filan Fisteku", 1993, "Ushtrime");
        Profesori p5 = new Profesori("Profesor asistent ", "Arber Zeka", 1994, "Ligjerata");
        f1.shtoMesimdhenesin(p1);
        f1.shtoMesimdhenesin(p2);
        f1.shtoMesimdhenesin(p3);
        f1.shtoMesimdhenesin(p4);
        f1.shtoMesimdhenesin(p5);

        Asistenti a1 = new Asistenti("Numerike", "Agron thaqi", 1985, "Ushtrime");
        Asistenti a2 = new Asistenti("Laboratorike", "Arber thaqi", 1988, "Ushtrime");
        Asistenti a3 = new Asistenti("Numerike", "Alban Kryeziu", 1989, "Ushtrime");
        Asistenti a4 = new Asistenti("Laboratorike", "Beqir Myrtezaj", 1987, "Ushtrime");
        Asistenti a5 = new Asistenti("Numerike", "Tigran Gashi", 1986, "Ushtrime");

        f1.shtoMesimdhenesin(a1);
        f1.shtoMesimdhenesin(a2);
        f1.shtoMesimdhenesin(a3);
        f1.shtoMesimdhenesin(a4);
        f1.shtoMesimdhenesin(a5);

        System.out.println(f1.profesoriMeIRi());
        for (int i = 0; i < f1.index; i++) {
            if (f1.vargu[i] instanceof Asistenti && ((Asistenti) f1.vargu[i]).getLlojiUshtrimeve().equals("Numerike")){
                System.out.println(f1.shtypLlojinEUshtrimeve("Numerike"));
            }

        }


    }
}
