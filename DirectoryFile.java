import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class DirectoryFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. List all files in a specified directory
        System.out.println("Enter the directory path to list files:");
        String dirPath = sc.nextLine();
        listFilesInDirectory(dirPath);

        // 2. Create a new directory
        System.out.println("Enter a name for the new directory:");
        String newDirName = sc.nextLine();
        Path newDir = createDirectory(dirPath, newDirName);

        // 3. Move a specified file into the newly created directory
        System.out.println("Enter the name of the file to move:");
        String fileNameToMove = sc.nextLine();
        moveFile(dirPath, fileNameToMove, newDir.toString());

        // 4. Create a new file
        System.out.println("Enter a name for the new file:");
        String newFileName = sc.nextLine();
        createNewFile(dirPath, newFileName);

        // 5. Rename a file
        System.out.println("Enter the name of the file to rename:");
        String fileToRename = sc.nextLine();
        System.out.println("Enter the new name:");
        String newFileNameAfterRename = sc.nextLine();
        renameFile(dirPath, fileToRename, newFileNameAfterRename);

        // 6. Delete a file
        System.out.println("Enter the name of the file to delete:");
        String fileToDelete = sc.nextLine();
        deleteFile(dirPath, fileToDelete);
        
        sc.close();
    }

    // 1. List all files in a specified directory
    public static void listFilesInDirectory(String dirPath) {
        try (Stream<Path> paths = Files.list(Paths.get(dirPath))) {
            paths.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Could not list files: " + e.getMessage());
        }
    }

    // 2. Create a new directory
    public static Path createDirectory(String dirPath, String newDirName) {
        Path newDir = Paths.get(dirPath, newDirName);
        try {
            Files.createDirectory(newDir);
            System.out.println("Directory created: " + newDir.toString());
        } catch (IOException e) {
            System.out.println("Could not create directory: " + e.getMessage());
        }
        return newDir;
    }

    // 3. Move a specified file into the newly created directory
    public static void moveFile(String dirPath, String fileName, String newDirPath) {
        Path source = Paths.get(dirPath, fileName);
        Path target = Paths.get(newDirPath, fileName);
        try {
            Files.move(source, target);
            System.out.println("File moved to " + target.toString());
        } catch (IOException e) {
            System.out.println("Could not move file: " + e.getMessage());
        }
    }

    // 4. Create a new file
    public static void createNewFile(String dirPath, String fileName) {
        Path newFilePath = Paths.get(dirPath, fileName);
        try {
            Files.createFile(newFilePath);
            System.out.println("File created: " + newFilePath.toString());
        } catch (IOException e) {
            System.out.println("Could not create file: " + e.getMessage());
        }
    }

    // 5. Rename a file
    public static void renameFile(String dirPath, String oldFileName, String newFileName) {
        Path oldFilePath = Paths.get(dirPath, oldFileName);
        Path newFilePath = Paths.get(dirPath, newFileName);
        try {
            Files.move(oldFilePath, newFilePath);
            System.out.println("File renamed to: " + newFilePath.toString());
        } catch (IOException e) {
            System.out.println("Could not rename file: " + e.getMessage());
        }
    }

    // 6. Delete a file
    public static void deleteFile(String dirPath, String fileName) {
        Path filePath = Paths.get(dirPath, fileName);
        try {
            Files.delete(filePath);
            System.out.println("File deleted: " + filePath.toString());
        } catch (IOException e) {
            System.out.println("Could not delete file: " + e.getMessage());
        }
    }
}
