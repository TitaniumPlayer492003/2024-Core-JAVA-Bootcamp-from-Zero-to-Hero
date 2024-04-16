import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

class temp {
    public static void main(String... avi) {
        /*char character = '\u0000';
        int i = 1;

        // Open a BufferedWriter to write to the file "temp.txt" using UTF-16 encoding
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("temp.txt"), "UTF-16"))) {
            // Continue loop while i is less than or equal to 65536
            while (i <= 65536) {
                // Write the current index and character to the file
                writer.write(i + " " + character + " ");

                if (i % 4 == 0) {
                    // Add a newline character after each line of output
                    writer.newLine();
                }
                // Increment the character and index
                character++;
                i++;
            }
        } catch (IOException e) {
            // Handle any IOException that might occur
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Inform the user that the operation has completed
        System.out.println("Output has been written to temp.txt.");*/
        System.out.println("\u2655");
    }
}
