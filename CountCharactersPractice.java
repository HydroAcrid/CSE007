import java.util.Arrays;
import java.util.Scanner;
public class CountCharactersPractice {
public static void main(String[] args) {
    System.out.println("Welcome to the Letter Count program.");
    System.out.println("Please enter some lines of text followed by a period and a return.");

    List<String> input = requestInput(new Scanner(System.in), new ArrayList<>());

    int[] occurrences = occurrences(input);

    int indexOfA = 'a';

    int indexOfZ = 'z';

    for (int letter = 'a'; letter <= indexOfZ; letter++) {
        int index = letter - indexOfA;

        int occurrencesOfLetter = occurrences[index];

        if (occurrencesOfLetter == 0) {
            continue;
        }
        System.out.println(String.format("%s: %s", (char) letter, occurrencesOfLetter));
    }
}

private static List<String> requestInput(Scanner scanner, List<String> input) {
    String line = scanner.nextLine();

    input.add(line);

    if (line.contains(".")) {
        return input;
    }

    return requestInput(scanner, input);
}

private static int[] occurrences(List<String> input) {
    int[] occurrences = new int[26];

    for (String line : input) {
        int[] occurrencesInLine = occurrences(line);

        for (int index = 0; index < occurrencesInLine.length; index++) {
            occurrences[index] += occurrencesInLine[index];
        }
    }
    return occurrences;
}

private static int[] occurrences(String line) {
    int[] occurrences = new int[26];

    char[] chars = line.toCharArray();

    for (char character : chars) {
        char characterLowercase = Character.toLowerCase(character);

        int index = index(characterLowercase);

        if (index < 0 || index > occurrences.length - 1) {
            continue;
        }
        occurrences[index]++;
    }
    return occurrences;
}

private static int index(char character) {
    return character - 'a';
}

}