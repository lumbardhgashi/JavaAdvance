import java.io.*;
import java.nio.CharBuffer;

/*
3. Krijoni klasën LineStartX që merr si parametër emrin e file-it në konstruktor, p.sh. “java.txt” .
• Ofroni metodën evenXLine që si rezultat kthen cili rresht me radhë është më i gjati me gjatësi çift
që fillon me X. Rreshti i parë paraqitet në pozitën 1.
• Rezultati të shkruhet nga metoda write e cila shkruan në file-in java.out, si vijon:
Rreshti me i gjate me gjatesi cift qe fillon me X eshte: <rreshti>
• Ofroni edhe metodën main() ku krijohet një instancë e LineStartX dhe të thirret metoda write e
kësaj instance
 */
public class LineStartX {
    String input ;
    String output;
    FileWriter fw = null ;
    FileReader fr = null;
    BufferedReader br = null ;
    BufferedWriter bw = null ;

    public LineStartX(String input,String output)throws IOException{
        if (input == null || input.trim().isEmpty()){
            throw new IOException("Dicka seshte ne rregull me input filen ");
        }
        if (output == null || output.trim().isEmpty()){
            throw new IOException("Dicka nuk eshte ne rregull me output filen ");
        }
        this.input = input ;
        this.output = output ;
        fw = new FileWriter(output);
        bw = new BufferedWriter(fw);
        fr =new FileReader(input);
        br = new BufferedReader(fr);
    }
    /*
    • Ofroni metodën evenXLine që si rezultat kthen cili rresht me radhë është më i gjati me gjatësi çift
që fillon me X. Rreshti i parë paraqitet në pozitën 1.
            */
    public  String evenXLine() throws IOException {
        String rreshti = null ;
        String meIGjati = null ;
        while ((rreshti = br.readLine()) !=null) {
            if (rreshti.length() % 2 == 0 && rreshti.toUpperCase().startsWith("X")) {
                if (meIGjati == null || rreshti.length() > meIGjati.length()){
                    meIGjati = rreshti ;
                }
            }
        }
        return meIGjati;
    }
    /*
    • Rezultati të shkruhet nga metoda write e cila shkruan në file-in java.out, si vijon:
Rreshti me i gjate me gjatesi cift qe fillon me X eshte: <rreshti>
     */
    public void write()throws IOException{
        String shtype = "Rreshti me i gjate me gjatesi cift qe fillon me \"X\" eshte : " +evenXLine();

        bw.write(shtype);
        bw.flush();
    }

    public void closeR(){
        try {
            if (br != null){
                br.close();
            }
            if (bw != null){
                bw.close();
            }
            if (fr != null){
                fr.close();
            }
            if (fw != null){
                fw.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LineStartX ls = null;
        try {
            ls = new LineStartX("java.txt.txt","java.out.txt");
            ls.write();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (ls != null){
                ls.closeR();
            }
        }
    }



}
