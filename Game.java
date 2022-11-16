import java.io.Console;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Game {
    public static void main(String[] args) {
        System.out.println("Countries Game");
        System.out.println("Type 'exit' to stop the game");
        Console console = System.console();
        BufferedReader br = null;
        int total = 0;
        int correct = 0;
        try {
            br = new BufferedReader(new FileReader("Continents.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");
                String country = cols[0];
                String continent = cols[1];
                String answer = console.readLine("Which continent does " + country + " belong to?");
                if (answer.equalsIgnoreCase(continent)) {
                String answer = console.readLine("Which continent does " + country + " belong to?");
                if (answer.equalsIgnoreCase("Exit")) {
                    break;
                }
                if (answer.equals(continent)) {
                    System.out.println("Correct! you smart");
                    correct++;
                } else {
                    System.out.println("No, the answer is " + continent + " you stupid");
                    total++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}