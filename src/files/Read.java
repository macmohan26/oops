package files;

import java.io.*;


public class Read {

    public static void main(String[] args) {
     // 1. Define the file (path) that we want to read.

        String filename = "C:/Users/SONU/IdeaProjects/files/FileToRead.txt";
        String text = null;

        // 2. Create the file in Java.

        File file = new File(filename);


        try {
            // 3. Open the file
           BufferedReader br = new BufferedReader(new FileReader(file));

            // 4. Read the file
            text = br.readLine();

            // Close the Resources.
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found: " +filename);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR: Could not read the data: " + filename);
            e.printStackTrace();
        }finally {
            System.out.println("Finished reading the file");
        }

        System.out.println(text);
    }
}
