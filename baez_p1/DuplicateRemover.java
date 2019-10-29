package baez_p1;


import java.io.*;
import java.util.ArrayList;

public class DuplicateRemover{

    ArrayList<String>  uniqueWords = new ArrayList<>();

    public void remove(String dataFile) throws IOException {
        BufferedReader buffReader = new BufferedReader(new FileReader(dataFile));
        String firstLine = buffReader.readLine();

        while (firstLine != null){
            String temp[] = firstLine.split(" ");
            for(String i:temp)
            {
                if(!uniqueWords.contains(i))   uniqueWords.add(i);
            }
            firstLine = buffReader.readLine();
        }
        buffReader.close();
    }

    public void write(String dataFile) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(dataFile);
        for(String writeWords: uniqueWords){

            printWriter.println(writeWords);
        }
        printWriter.close();
    }
}




