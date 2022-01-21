import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("text");
        if (file.delete()) {
            System.out.println("File deleted successfully");
        }else{
            System.out.println("Could not deleted file");
        }
    }
}
