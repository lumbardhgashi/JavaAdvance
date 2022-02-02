import java.io.File;

public class GetFileInfo {

    public static void main(String[] args) {
      GetFileInfo getFileInfo = new GetFileInfo();
      getFileInfo.getInfoOfFile("java.txt.txt");
    }


    public void getInfoOfFile(String fileName){
        File info = new File(fileName);
        if (info.exists()){
            System.out.printf("File Name : %s %n",info.getName());
            System.out.printf("Path of File : %s %n",info.getAbsolutePath());
            System.out.printf("Readable : %s %n" ,info.canRead());
            System.out.printf("Writeable : %s %n",info.canWrite());
            System.out.printf("File size is : %s  bytes %n" , info.length());
        }
        else {
            System.out.printf("File nuk ekziston");
        }
    }
}
