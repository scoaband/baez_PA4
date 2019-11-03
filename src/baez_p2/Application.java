package baez_p2;

import java.io.IOException;

public abstract  class Application {
    public static void main(String[] args) throws IOException {

        DuplicateCounter duplicateCounter = new DuplicateCounter();

        duplicateCounter.count("problem2.txt");
        duplicateCounter.write("unique_word_counts.txt");
        System.out.println("\n Duplicate Remover Operation successfully done");
    }
}
