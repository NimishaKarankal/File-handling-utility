import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileHandlerGUI extends JFrame {

    private JTextField fileNameField;
    private JTextArea fileContentArea;
    private JTextArea appendContentArea;
    private JButton writeButton, readButton, modifyButton;

    public FileHandlerGUI() {
        setTitle("File Handling Utility");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel: File name input
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(new JLabel("File Name:"));
        fileNameField = new JTextField(30);
        topPanel.add(fileNameField);
        add(topPanel, BorderLayout.NORTH);

        // Center Panel: Content Area
        JPanel centerPanel = new JPanel(new GridLayout(2, 1));

        fileContentArea = new JTextArea(10, 50);
        fileContentArea.setBorder(BorderFactory.createTitledBorder("Content to Write / Current File Content"));
        centerPanel.add(new JScrollPane(fileContentArea));

        appendContentArea = new JTextArea(5, 50);
        appendContentArea.setBorder(BorderFactory.createTitledBorder("Content to Append"));
        centerPanel.add(new JScrollPane(appendContentArea));

        add(centerPanel, BorderLayout.CENTER);

        // Bottom Panel: Buttons
        JPanel bottomPanel = new JPanel();
        writeButton = new JButton("Write to File");
        readButton = new JButton("Read File");
        modifyButton = new JButton("Append to File");

        bottomPanel.add(writeButton);
        bottomPanel.add(readButton);
        bottomPanel.add(modifyButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // Action Listeners
        writeButton.addActionListener(e -> writeFile());
        readButton.addActionListener(e -> readFile());
        modifyButton.addActionListener(e -> modifyFile());

        setVisible(true);
    }

    private void writeFile() {
        String fileName = fileNameField.getText().trim();
        String content = fileContentArea.getText();

        if (fileName.isEmpty()) {
            showMessage("Please enter a valid file name.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            showMessage("File written successfully!");
        } catch (IOException e) {
            showMessage("Error writing to file: " + e.getMessage());
        }
    }

    private void readFile() {
        String fileName = fileNameField.getText().trim();

        if (fileName.isEmpty()) {
            showMessage("Please enter a valid file name.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            fileContentArea.setText("");
            String line;
            while ((line = reader.readLine()) != null) {
                fileContentArea.append(line + "\n");
            }
            showMessage("File read successfully!");
        } catch (IOException e) {
            showMessage("Error reading file: " + e.getMessage());
        }
    }

    private void modifyFile() {
        String fileName = fileNameField.getText().trim();
        String newContent = appendContentArea.getText();

        if (fileName.isEmpty()) {
            showMessage("Please enter a valid file name.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("\n" + newContent);
            showMessage("File modified successfully!");
        } catch (IOException e) {
            showMessage("Error modifying file: " + e.getMessage());
        }
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FileHandlerGUI::new);
    }
}
