import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("newfile.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // File information
            if (file.exists()) {
                System.out.println("File name: " + file.getName());
                System.out.println("Absolute path: " + file.getAbsolutePath());
                System.out.println("Writable: " + file.canWrite());
                System.out.println("Readable: " + file.canRead());
                System.out.println("File size: " + file.length() + " bytes");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
