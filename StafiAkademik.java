public abstract  class StafiAkademik {
    private  String emri ;
    private int vitiLindjes;
    private boolean irregullt;

    public StafiAkademik(String emri ,int vitiLindjes,boolean irregullt){
        this.emri =emri;
        this.vitiLindjes = vitiLindjes;
        this.irregullt = irregullt;
    }

    public String getEmri() {
        return emri;
    }

    public int getVitiLindjes() {
        return vitiLindjes;
    }

    public void setVitiLindjes(int vitiLindjes) {
        this.vitiLindjes = vitiLindjes;
    }

    public boolean getIRregullt() {
        return irregullt;
    }

    public void setIrregullt(boolean irregullt) {
        this.irregullt = irregullt;
    }
    public String toString(){
        return emri + " : " + vitiLindjes + " staf " + (irregullt?"":"jo") + "i rregullt" ;
    }
    public boolean equals(Object obj){
        if (obj instanceof StafiAkademik){
            StafiAkademik krahasues = (StafiAkademik) obj ;
            if (emri.equals(krahasues.getEmri()) && vitiLindjes == krahasues.getVitiLindjes()){
                return true;
            }
        }
        return false ;
    }
}
