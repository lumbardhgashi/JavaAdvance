public class Ndermarrja {
    private Puntori[] vargu ;
    private int index = 0;

    public Ndermarrja(int kapaciteti){
        vargu = new Puntori[kapaciteti];

    }

    public boolean ekziston (Puntori puntori){
        for (int i = 0 ; i<index ;i++){
            if (vargu[i].equals(puntori)){
                return true;
            }
        }
        return false;
    }

    public void shtoPunetorin(Puntori puntori) throws PuntoriExecption{
        if (puntori == null){
            throw new PuntoriExecption("Puntori nuk duhet te jete  null");
        }
        if (index == vargu.length){
            throw new PuntoriExecption("Nuk ka vend te lire ne varg");
        }
        if (ekziston(puntori)){
            throw new PuntoriExecption("Puntori ekziston ne varg");
        }
        vargu[index++]=puntori;
    }

    public void getKualifikimet(){
        for (int i = 0 ;i <index ; i++){
            if (vargu[i] instanceof Individi){
                System.out.println(vargu[i]);
            }
        }
    }

    public boolean kaTeGjithaLlojet(){
        int countShoferi = 0 ;
        int countKoordinatori = 0 ;
        int countMenaxheri =0 ;
        for (int i =0 ; i < index ;i++){
            if (vargu[i] instanceof Shoferi){
                countShoferi++;
            }
            if (vargu[i] instanceof Koordinatori){
                countKoordinatori++;
            }
            if (vargu[i] instanceof  Menaxheri){
                countMenaxheri++;
            }
        }
        if (countShoferi == 0){
            return false;
        }
        if (countKoordinatori == 0){
            return false;
        }
        if (countMenaxheri == 0){
            return false;
        }
        return  true;
    }

    public  void shfaq(){
        for (int i =0 ;i <index ;i++){
            System.out.println(vargu[i].getEmri()+"-"+vargu[i].getMosha());

        }
    }

    public static void main(String[] args) {
        Ndermarrja ndermarrja = new Ndermarrja(10);
        try {
            Shoferi sh1 = new Shoferi("Blerim",18,"Gjilan");
            Menaxheri m1 = new Menaxheri("Lumbardhi",19,2,"Menaxheri");
            ndermarrja.getKualifikimet();
        }catch (Exception e){
            e.getMessage();
        }


    }

}
