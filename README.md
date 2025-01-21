# File-handling-utility

Project Details:
**Name**: Nimisha Karankal
**Company Name**: CODTECH IT SOLUTIONS
**Intern ID**: CT08GJI
**Domain**: Java Programming 
**Mentor**: Neela Santhosh
**Batch Duration**: 25th December 2024 to 25th January 2025

#### Overview:
The **File Handling Utility** is a straightforward yet practical Java program that allows users to perform essential operations on text files. It simplifies the process of creating, reading, and modifying files through a command-line interface. The program is particularly useful for developers or students learning file handling in Java, as it demonstrates how to use built-in classes like `FileWriter`, `FileReader`, `BufferedWriter`, and `BufferedReader` effectively.

The utility is interactive, asking users for inputs step by step to perform specific actions. Whether you want to create a new file, view its content, or add new data, this program has you covered. It’s designed to handle common errors gracefully, ensuring that users have a seamless experience. 

---

#### Features:

1. **File Creation and Writing:**
   - The program allows you to create a new `.txt` file and write content to it. 
   - When you specify the file name, the program ensures it’s valid (not blank or null) and overwrites any existing file with the same name. 
   - This feature is handy when you need to create a fresh file or replace an outdated one quickly.

2. **File Reading:**
   - If you’re curious about the content of an existing file, this utility can read and display it for you line by line.
   - It’s particularly useful for verifying data or reviewing information stored in the file.
   - The program also handles situations where the file doesn’t exist, providing an error message instead of crashing.

3. **File Modification:**
   - Appending new content to an existing file is a breeze with this utility.
   - Instead of overwriting the file’s current content, the program seamlessly adds new data at the end. This feature ensures that no valuable information is lost during updates.
   - It’s perfect for scenarios like maintaining logs, updating records, or simply expanding the data in a file.

4. **Error Handling:**
   - Robust error handling is one of the program’s strengths. It catches and manages issues like invalid file names, missing files, or input/output errors.
   - For instance, if you try to read a non-existent file, the program will inform you rather than throwing an exception and terminating abruptly.

5. **Interactive and User-Friendly:**
   - The command-line interface is intuitive and designed for ease of use. 
   - Prompts guide you at each step, ensuring you know exactly what to do next.
   - Messages like "File written successfully" or "An error occurred" keep you informed about the status of each operation.

6. **Code Modularity:**
   - The program’s structure is clean and modular. Each operation—whether it’s writing, reading, or modifying—is encapsulated in its method. This design makes the code easy to read and maintain.
   - There’s also a helper method for validating file names, ensuring that errors are caught early.

---

#### Potential Extensions:
While the program is fully functional as-is, it has room for enhancements. Here are a few ideas for extending its functionality:
- **Search Functionality:** Add a feature to search for specific keywords or phrases within a file.
- **File Deletion:** Provide an option to delete unwanted files directly from the interface.
- **Advanced Editing:** Allow users to replace specific lines or words in a file.
- **GUI Integration:** Transform the command-line utility into a graphical application for a more modern user experience.
- **File Encryption:** Add an option to encrypt and decrypt files for secure storage.

---

#### Conclusion:
The File Handling Utility is a small but powerful Java program that highlights the importance of file management in software development. Its simplicity makes it accessible to beginners, while its robust design demonstrates best practices in programming. Whether you’re learning Java or need a quick utility for basic file tasks, this program is a valuable resource. Give it a try—you’ll not only accomplish your tasks but also deepen your understanding of file handling in Java.
