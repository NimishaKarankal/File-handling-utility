import java.io.*;
import java.util.Scanner;

public class FileHandler {

    // Method to create and write to a text file
    public static void writeFile(String fileName, String content) {
        if (fileName.trim().isEmpty()) {
        System.out.println("File name cannot be blank.");
        return;
    }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to read and display the contents of a text file
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // Method to modify a text file by appending new content
    public static void modifyFile(String fileName, String newContent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(newContent);
            System.out.println("\nFile modified successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file: " + e.getMessage());
        }
      }
       private static boolean isValidFileName(String fileName) {
        return fileName != null && !fileName.trim().isEmpty();
    }

    // Main method to demonstrate file operations
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the File Handling Utility ===");
        System.out.println("This program lets you create, read, and modify text files.\n");
        
        // Get file name from user
        System.out.print("Enter the name of the file you would like to work on (eg:-Example.txt): ");
        String fileName = scanner.nextLine();

        if (!isValidFileName(fileName)) {
            System.out.println("Error: Invalid file name. Please restart the program with a valid file name.");
            scanner.close();
            return;
        }

        // Write to file
        System.out.print("Enter the content to write to the file: ");
        String content = scanner.nextLine();
        writeFile(fileName, content);

        // Read the file
        System.out.println("The content of the file is:");
        readFile(fileName);

        // Modify the file
        System.out.print("\n Do you want to enter new content in the file? Enter it here: ");
        String newContent = scanner.nextLine();
        modifyFile(fileName, "\n" + newContent);

        // Read the modified file
        System.out.println("The updated content of the file is:");
        readFile(fileName);

        scanner.close();
    }
}
