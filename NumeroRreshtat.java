import java.io.*;
/*
1. Krijoni klasën NumeroReshtat që pranon dy parametra në konstruktor:
- emrin e input file-it (p.sh. “shk2.txt”) dhe
- emrin e outnput file-it (p.sh. “shk2.out”).
• Ofroni metodën numero që si rezultat kthen sa rreshta në file-in e inputit fillojnë me tekstin e
pranuar si parametër.
• Rezultati të shkruhet nga metoda numeroReshtat e cila e pranon tekstin si parametër
(p.sh. “Exception”) dhe shkruan në file-in e outputit, si vijon:
Numri i rreshtave ne file-in <emri_i_input_file-it> qe fillojne me tekstin <teksti> eshte: <nr_rreshtave>
• Ofroni edhe metodën main() ku krijohet një instancë e NumeroReshtat prej nga thirret metoda
numeroReshtat e kësaj instance.
 */
public class NumeroRreshtat {
    String input ;
    String output ;
    FileReader fileReader= null ;
    BufferedReader bufferedReader = null;
    FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;

    public NumeroRreshtat(String input,String output)throws IOException{
        if (input == null || input.trim().isEmpty()){
            throw new IOException("Dicka seshte ne rregull me input file-in");
        }
        if (output == null || output.trim().isEmpty()){
            throw new IOException("Dicka seshte ne rregull me  output-in");
        }
        this.input=input;
        this.output=output;
        fileReader = new FileReader(input);
        bufferedReader = new BufferedReader(fileReader);
        fileWriter = new FileWriter(output);
        bufferedWriter = new BufferedWriter(fileWriter);
    }

    public int numero(String txt)throws IOException{
        int count = 0 ;
        String rreshti = null ;
        while ((rreshti= bufferedReader.readLine()) !=null){
            if (rreshti.startsWith(txt)){
                count++;
            }
        }
        return count;
    }
    /*
    • Rezultati të shkruhet nga metoda numeroReshtat e cila e pranon tekstin si parametër
(p.sh. “Exception”) dhe shkruan në file-in e outputit, si vijon:
Numri i rreshtave ne file-in <emri_i_input_file-it> qe fillojne me tekstin <teksti> eshte: <nr_rreshtave>
     */

    public void numeroReshtat(String txt) throws IOException {
        String shtypet = "Numri i rreshtave ne file-in \""+input+"\" qe fillojne me tekstin \""+txt+"\" eshte :"+numero(txt);
        fileWriter.write(shtypet);

    }

    public void close() {
        try {
            if (bufferedWriter !=null){
                bufferedWriter.close();
            }
            if (fileWriter !=null){
                fileWriter.close();
            }
            if (fileReader !=null){
                fileReader.close();
            }
            if (bufferedReader !=null){
                bufferedReader.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NumeroRreshtat nr = null;
        try {
            nr = new NumeroRreshtat("shk2.txt.txt","shk2.out.txt");
            nr.numeroReshtat("UBT");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (nr != null){
                nr.close();
            }
        }
    }


}
