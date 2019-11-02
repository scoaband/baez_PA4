package baez_p1;


import java.io.IOException;

public class Application extends DuplicateRemover {
    public static void main(String[] arg) throws IOException {

        DuplicateRemover duplicateRemover = new DuplicateRemover();
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_words.txt");

        System.out.println("\n Duplicate Remover Operation successfully done");
    }
}

