import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteFile {
    public static void main(String[] args) {
        File folder = new File("folder");
        File file = new File("folder\\myFirstFile.txt");
        try{
            boolean folderCreated = folder.mkdir(); // create directories
            boolean fileCreated = file.createNewFile(); // create files
            // clase para escribir archivos, recibe como parametro el archivo a modificar.
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("learning to manipulate files");
            fileWriter.close();

            if(folderCreated && fileCreated) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("The file already exist.");
            }
        } catch (IOException e) {
            System.out.println("File exception:" + e);
        }

    }

}
