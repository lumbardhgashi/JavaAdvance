import java.io.*;

/*
6. Krijoni klasën CountFiles që merr si parametër emrin e folder-it në konstruktor, p.sh. “ubt” .
• Ofroni metodën int count(int size) që numëron të gjithë file-at (jo edhe folder-ët) të cilët kanë
madhësinë më të vogël ose edhe të barabartë me parametrin e dhënë size (në byte).
• Rezultati të shkruhet nga metoda write e cila shkruan në file-in file.out si vijon:
Total file ishin <sa_kane_qene>
Total file qe e plotesonin kushtin ishin <sa_e_kane_plotesu_kushtin>
• Ofroni edhe metodën main() ku krijohet një instancë e CountFiles dhe ku thirret metoda write e
kësaj instance
 */
public class CountFiles {
    String input ;
    String output ;
    FileWriter fw = null;

    public CountFiles(String input , String output)throws IOException{
        if (input == null || input.trim().isEmpty()) {
            throw new IOException("Dicka nuk eshte ne rregull me input filen ");
        }
        if (output == null || output.trim().isEmpty()) {
            throw new IOException("Dicka seshte ne rregull me  output-in");
        }
        this.input = input ;
        this.output = output;
        fw = new FileWriter(output);
    }



    public int count( int size) throws IOException {
        File dir = new File(input);
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return dir.exists();
            }
        });
        int countFiles = 0 ;
        for (int i = 0; i < files.length; i++) {
            if (files[i].length() < size) {
                countFiles++;
            }
        }
        return countFiles ;
    }
    public void write()throws IOException{
        String shtype = "total file ishin : "+count(90);

        fw.write(shtype);
    }

    public void closeR() {
        try {
            if (fw != null) {
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        CountFiles countFiles = null ;
        try {
            countFiles = new CountFiles("C:\\Users\\lumib\\Desktop\\UBT Study\\VITI 2\\SEMESTRI 3\\SHKENCA KOMPJUTERIKE 2\\LO09", "ABC.txt");
            countFiles.write();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            countFiles.closeR();
        }
    }


}
