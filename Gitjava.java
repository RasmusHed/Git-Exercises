import java.io.Console;

public class Gitjava {
    public static void main(String[] args) {
        Console console = System.console();
        String answer = console.readLine("Which continent does Sweden belong to? ");
        String continent= "Asia";
        if (answer.equals(continent)) {
            System.out.println("Correct!");
        } else {
            System.out.println("No, the answer is " + continent);
        }
    }
}
