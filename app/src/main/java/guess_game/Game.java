package guess_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Game {

    int counter = 10;

    String words;
    public Game(WordChoser choser){
       this.words = choser.getRandomWordFromDictionary();

    }


    public String getWordToGuess() {
        StringBuilder builder = new StringBuilder(words.length());

            for (int i = 0; i < words.length(); i++) {
                if (i == 0) {
                    builder.append(words.charAt(0));
                } else {
                    builder.append("_");
                }
            }
        return builder.toString();
    }

    public int getRemainingAttempts(){
        return counter;
    }



}