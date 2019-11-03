package baez_p2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class DuplicateCounter {

    Map<String, Integer> counter = new HashMap<String, Integer>();

    public void count(String dataFile) throws IOException {

        BufferedReader r1 = new BufferedReader(new FileReader(dataFile));
        String line1 = r1.readLine();
        while (line1 != null) {

            String words[] = line1.split(" ");
            for (String w : words) {

                if (!counter.containsKey(w)) {

                    counter.put(w, 1);
                } else {

                    int count = counter.get(w);
                    counter.put(w, count + 1);
                }
            }

            line1 = r1.readLine();
        }
        r1.close();
    }

    public void write(String dataFile) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter(dataFile);
        for (Map.Entry<String, Integer> entry: counter.entrySet()) {

            pw.println(entry.getKey() + ": " + entry.getValue());
        }
        pw.close();
    }
}
