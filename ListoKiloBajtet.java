/*
Krijoni klasën ListoKiloBajtet që merr si parametër emrin e folder-it në konstruktor, (p.sh. “ubt”).
• Ofroni metodën void listoKB(String ext, long kb) që shfleton të gjithë file-at me extension <ext>,
(p.sh. “.docx”) dhe që kanë madhësinë së paku <kb> KiloBajteshe (p.sh. 30).
• Rezultati duhet të shkruhet në file-in ubt.out, si vijon:
File-a me extension “<ext>”, me madhesi > <kb> KB ne folderin <emri_i_folderit>:
<emri_i_file-it_1> - <madhesia> KB

• Ofroni edhe metodën main() ku krijohet një instancë e ListoKiloBajtet dhe ku thirret metoda
listoKB e kësaj instance.

 */
import java.io.*;

public class ListoKiloBajtet {
    String input;
    String output;
    FileWriter fw = null;
    BufferedWriter bw = null;


    public ListoKiloBajtet(String input, String output) throws IOException {
        if (input == null || input.trim().isEmpty()) {
            throw new IOException("Dicka nuk eshte ne rregull me input filen ");
        }
        if (output == null || output.trim().isEmpty()) {
            throw new IOException("Dicka seshte ne rregull me  output-in");
        }
        this.input = input;
        this.output = output;
        fw = new FileWriter(output);
        bw = new BufferedWriter(fw);

    }

    public void listoKiloBajtet(String ext, long kb) throws IOException {
        File dir = new File(input);
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(ext);
            }
        });
        for (int i = 0; i < files.length; i++) {
            if (files[i].length() > kb) {
                String shtype = "File-a me extension " + ext + ", me madhesi me te madhe se " + kb / 1024 + "KB ne folderin " + input + ":\n" +
                        "emri file-a : " + files[i].getName() + " - " + files[i].length() / 1024f + " madhesia KB";
                fw.write(shtype);
            }
        }
    }

    public void closeR() {
        try {

            if (bw != null) {
                bw.close();
            }
            if (fw != null) {
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ListoKiloBajtet kiloBajtet = null;
        try {
            kiloBajtet = new ListoKiloBajtet("C:\\Users\\lumib\\Desktop\\UBT Study\\VITI 2\\SEMESTRI 3\\SHKENCA KOMPJUTERIKE 2\\LO09", "ABC.txt");
            kiloBajtet.listoKiloBajtet(".txt", 80);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            kiloBajtet.closeR();
        }
    }

}
