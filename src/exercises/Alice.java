package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("What term would you like to search for?");
        String query = input.nextLine();
        boolean isQueryInAlice = alice.toLowerCase().contains(query.toLowerCase());
        if (isQueryInAlice) {
            int index = alice.toLowerCase().indexOf(query.toLowerCase());
            System.out.println(query + " is at index " + index + " and has length " + query.length() + ".");
            alice = alice.toLowerCase().replaceFirst(query.toLowerCase(), "");
            System.out.println(alice);
        } else {
            System.out.println(query + " is not in the first sentence of Alice in Wonderland");
        }
    }
}
