package guess_game;

import java.util.ArrayList;

public class Game {
    private String word;
    private ArrayList<Character> guessedLetters = new ArrayList<Character>();
    private Integer remainingAttempts = 10;

    public Game(WordChoser chooser){
       this.word = chooser.getRandomWordFromDictionary();
    }

    public String getWordToGuess() {
        StringBuilder builder = new StringBuilder(word.length());

            for (int i = 0; i < word.length(); i++) {
                if (i == 0) {
                    builder.append(word.charAt(0));
                } else {
                    builder.append("_");
                }
            }
        return builder.toString();
    }
    public int getRemainingAttempts(){
        return remainingAttempts;
    }

    public Boolean guessLetter(Character letter) {
        if (this.word.indexOf(letter) != -1) {
            guessedLetters.add(letter);
            return true;
        } else {
            remainingAttempts--;
            return false;
        }
    }

}