package baez_p1;

public class Application {
    public static void main(String[] arg) throws FileNotFoundException {

        DuplicateRemover duplicateRemover = new DuplicateRemover();

        try {

            duplicateRemover.remove("problem1.txt");
        } catch (IOException e) {

            e.printStackTrace();
        }
            duplicateRemover.write("unique_words.txt");
            System.out.println("Duplicate Remover Operation successfully done");
    }

}
// Working on Abstracting to be Continue