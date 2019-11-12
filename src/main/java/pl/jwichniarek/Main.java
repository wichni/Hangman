package pl.jwichniarek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    private static List<String> words;

    public static void main(String[] args) throws FileNotFoundException {

        initWords();
        String word = getNextWord();
        Set<String> guessedLetters = new HashSet<>();
        int errorCounter = 0;

        Scanner in = new Scanner(System.in);
        String inputLetter;


        System.out.println("Witaj! Wpisz literkę lub napisz 'end', aby zakończyć");
        printWord(word, guessedLetters);

        while (errorCounter < 6 && !(inputLetter = in.nextLine()).equals("end")) {
        System.out.println("Wpisz kolejna literkę lub napisz 'end', aby zakończyć");

        if (!word.toLowerCase().contains(inputLetter.toLowerCase())) {
            errorCounter++;
        }if (!word.toLowerCase().equals(inputLetter.toLowerCase()))

        Display.drawHangman(errorCounter);

        guessedLetters.add(inputLetter);
        printWord(word, guessedLetters);

        System.out.println("Errors: " + errorCounter);

        if (errorCounter > 5) {
                System.out.println("GAME OVER");
                System.out.println("Slowo to " + "'" + word + "'");
        }
        }
    }


    private static void initWords() throws FileNotFoundException {
        words = readFile();
    }

    private static void printWord(String word, Set<String> guessedLetters) {

        //System.out.println(word);
        System.out.println(guessedLetters);
        boolean trueValue = false;


        for (int i = 0; i < word.length(); i++) {

            String letter = word.substring(i, i + 1);

            if (guessedLetters.contains(letter.toLowerCase()) ||
                    guessedLetters.contains(letter.toUpperCase())) {
                System.out.print(letter);
            }else  {
                System.out.print("_");
                trueValue=true;
            }

            System.out.print(" ");

        }
        System.out.println();
        if (trueValue != true){
            System.out.println("\nKoniec gry, udalo Ci sie odgadnac slowo " +"'"+word+"'"+ " Gratulacje");
            System.exit(0);
        }
    }



    private static List<String> readFile() throws FileNotFoundException {

        List<String> words = new ArrayList<>();

        File file = new File("words.txt");
        Scanner in = new Scanner(file);

        while (in.hasNextLine()) {
            words.add(in.nextLine());
        }

        return words;
    }

    private static int getRandom(int start, int end) {
        Random rand = new Random();

        return rand.nextInt((end - start) + 1) + start;
    }

    private static String getNextWord() {
        return words.get(getRandom(0, words.size() - 1));
    }
}
