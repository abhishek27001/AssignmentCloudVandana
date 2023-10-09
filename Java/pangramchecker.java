import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class PangramChecker {
    public static boolean isPangram(String str) {
        // Create a set to store the unique letters in the input string
        Set<Character> letterSet = new HashSet<>();
        // Iterate through the characters in the string
        for (char ch : str.toCharArray()) {
            // Convert the character to lowercase to handle both uppercase and lowercase letters
            char lowercaseChar = Character.toLowerCase(ch);
            // Check if the character is a letter ('a' to 'z') and add it to the set
            if (lowercaseChar >= 'a' && lowercaseChar <= 'z') {
                letterSet.add(lowercaseChar);
            }
        }
        // Check if the set size is equal to 26 (number of letters in the English alphabet)
        return letterSet.size() == 26;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        scanner.close();
    }
}
