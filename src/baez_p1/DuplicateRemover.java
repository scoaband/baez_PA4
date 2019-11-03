package baez_p1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class DuplicateRemover {

    List<String> uniqueWords = new ArrayList<>();

    public void remove(String dataFile) {
        try {

            // Buffer and read the file line by line.
            BufferedReader buffReader = new BufferedReader(new FileReader(dataFile));
            String firstLine = buffReader.readLine();

            while (firstLine != null) {
                String[] temp = firstLine.split(" ");
                for (String i : temp) {

                    if (!uniqueWords.contains(i)) {
                        uniqueWords.add(i);
                    }
                }
                firstLine = buffReader.readLine();
            }
            buffReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String dataFile) throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter(new File(dataFile));
        for (String writeWords : uniqueWords) {
            printWriter.println(writeWords);
        }
        // Testing Console output!
        System.out.print(uniqueWords);
        printWriter.close();
    }
}





