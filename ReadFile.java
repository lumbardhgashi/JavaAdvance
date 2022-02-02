import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ReadFile {
    public static void main(String[] args) {
       ReadFile readFile = new ReadFile();
       readFile.lexoFilen("shk2.txt.txt");
    }

    public void lexoFilen(String fileName){
        try {
            File lexo = new File(fileName);
            Scanner scan = new Scanner(lexo);
            while (scan.hasNextLine()){
                String rreshti = scan.nextLine();
                System.out.println(rreshti);
            }
        }catch (FileNotFoundException f){
            f.printStackTrace();
        }
    }



}
