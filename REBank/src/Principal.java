import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("Teste1.csv"));
        scanner.useDelimiter(";");

        while (scanner.hasNext()) {

            System.out.println(scanner.next());
            System.out.println("Eygon");

        }

        scanner.close();

    }


}