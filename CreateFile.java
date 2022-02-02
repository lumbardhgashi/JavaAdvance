import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        CreateFile createFile = new CreateFile();
        createFile.krijoFile("ABC.txt");
        createFile.krijoFile("ABCD.txt");
        createFile.krijoFile("ubt.txt");
        createFile.krijoFile("Gashi");
    }

    public void krijoFile(String fileName){
        try {
            File fileRi = new File(fileName);
            if (fileRi.createNewFile()){
                System.out.printf("File : %S u krijua me Sukses !",fileRi.getName());
            }
            else {
                System.out.printf("File : %S nuk u krijua",fileRi.getName());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
