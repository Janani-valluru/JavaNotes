import java.nio.file.*;
import java.io.IOException;

public class CopyFile5 {

    public static void main(String[] args) {
        try {
            Path original = Paths.get("D:\\eclipse\\cdac\\FileHandling\\source.txt");
            Path destination = Paths.get("D:\\eclipse\\cdac\\FileHandling\\destination.txt");

            // Check if the source file exists before copying
            if (!Files.exists(original)) {
                System.out.println("Source file does not exist: " + original);
                return;
            }

            // Copy the file and replace if destination exists
            Files.copy(original, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully from " + original + " to " + destination);
        } catch (IOException e) {
            System.err.println("Error during file copy: " + e.getMessage());
        }
    }
}
