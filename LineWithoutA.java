import java.io.*;


/*
2. Krijoni klasën LineWithoutA që merr si parametër emrin e file-it në konstruktor, p.sh. “shk2.txt.
• Ofroni metodën longestNonALine që si rezultat kthen rreshtin e fundit më të gjatë që nuk
përmban shkronjën A.
• Rezultati të shkruhet nga metoda shkruaj e cila shkruan në file-in ubt.out, si vijon:
Rreshti i fundit me i gjate qe nuk permban shkronjen A eshte:
<rreshti>
• Ofroni edhe metodën main() ku krijohet një instancë e LineWithoutA dhe të thirret metoda
shkruaj e kësaj instance.
 */
public class LineWithoutA {
    String input;
    String output;
    FileReader fr =null;
    BufferedReader br = null ;
    FileWriter fw = null;
    BufferedWriter bw = null ;

    public LineWithoutA(String input , String output)throws IOException{
        if (input == null || input.trim().isEmpty()){
            throw new IOException("Dicka nuk eshte ne rregull me input filen ");
        }
        if (output == null || output.trim().isEmpty()){
            throw new IOException("Dicka seshte ne rregull me  output-in");
        }
        this.input=input;
        this.output=output;
        fr = new FileReader(input);
        br = new BufferedReader(fr);
        fw = new FileWriter(output);
        bw = new BufferedWriter(fw);
    }
    public String longestNonALine()throws IOException{
        String rreshti = null ;
        String rreshtiMeiMadh= null ;
        while ((rreshti = br.readLine()) != null){
            if (rreshtiMeiMadh == null || !(rreshti.toUpperCase().contains("A")) && rreshti.length() > rreshtiMeiMadh.length()){
                rreshtiMeiMadh = rreshti;
            }
        }
       return rreshtiMeiMadh;
    }

    public void shkruaj()throws IOException{
       String shtype = "Rreshti i fundit me i gjate qe nuk permban shkronjen A eshte " + longestNonALine();
       fw.write(shtype);
    }

    public void close() {
        try {
            if (bw !=null){
                bw.close();
            }
            if (fw !=null){
                fw.close();
            }
            if (fr !=null){
                fr.close();
            }
            if (br !=null){
                br.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LineWithoutA lineWithoutA = null;
        try {
            lineWithoutA = new LineWithoutA("shk2.txt..txt","ubt.out.txt");
            lineWithoutA.shkruaj();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            lineWithoutA.close();
        }
    }
}
