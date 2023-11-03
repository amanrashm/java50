package fileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileData {
    public static void main(String[] args) {
        String filename = "data.txt";
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("An error occurred while closing the file: " + e.getMessage());
                }
            }
        }
    }
}
