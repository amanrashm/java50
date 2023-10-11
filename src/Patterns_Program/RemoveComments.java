package Patterns_Program;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveComments {
    public static void main(String[] args) throws IOException {
        String inputFileName = "sourceCodeWithComments.java";
        String outputFileName = "sourceCodeWithoutComments.java";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
            String line;
            boolean inBlockComment = false;
            Pattern blockCommentStart = Pattern.compile(".*?/\\*.*?");
            Pattern blockCommentEnd = Pattern.compile(".*?\\*/.*?");
            Pattern lineComment = Pattern.compile(".*?//.*?");

            while ((line = reader.readLine()) != null) {
                if (inBlockComment) {
                    Matcher endMatcher = blockCommentEnd.matcher(line);
                    if (endMatcher.find()) {
                        inBlockComment = false;
                        line = endMatcher.replaceFirst("");
                    } else {
                        continue; // Skip this line as it's part of a block comment
                    }
                }

                // Remove line comments
                Matcher lineCommentMatcher = lineComment.matcher(line);
                line = lineCommentMatcher.replaceAll("");

                // Check for block comments
                Matcher startMatcher = blockCommentStart.matcher(line);
                if (startMatcher.find()) {
                    inBlockComment = true;
                    line = startMatcher.replaceFirst("");
                }

                writer.println(line);
            }
        }
    }
}