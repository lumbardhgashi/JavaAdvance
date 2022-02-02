import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;


public class DeleteFile {
    String foldername;
    String output ;
    FileWriter fw =  null ;


    public DeleteFile(String foldername, String output)throws IOException {
        if (foldername == null || foldername.trim().isEmpty()) {
            throw new IOException("Dicka nuk eshte ne rregull me input filen ");
        }
        if (output == null || output.trim().isEmpty()) {
            throw new IOException("Dicka nuk eshte ne rregull me output filen ");
        }
        this.foldername  = foldername ;
        this.output = output ;
        fw = new FileWriter(output);
    }



    public void fshijFile(String fileName) throws IOException {
        File deleteFile = new File(fileName);
        if (deleteFile.delete()){
            fw.write("File : "+deleteFile.getName()+" u fshi me sukses");
        }
        else {
            fw.write("File : "+deleteFile.getName()+" nuk u fshi");
        }
        System.out.println();
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
        DeleteFile file = null ;
        try {
            file = new DeleteFile("C:\\Users\\lumib\\Desktop\\UBT Study\\VITI 2\\SEMESTRI 3\\SHKENCA KOMPJUTERIKE 2\\LO09", "ABC.txt");
            file.fshijFile("ABCD.txt");

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            file.closeR();
        }
    }
}
