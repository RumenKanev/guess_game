package guess_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WordChoser{

    static final ArrayList<String> DICTIONARY = new ArrayList<>(Arrays.asList("MAKERS", "CANDIES", "DEVELOPER", "LONDON"));

    public String getRandomWordFromDictionary(){
        Random randNumber = new Random();
        return DICTIONARY.get(randNumber.nextInt(DICTIONARY.size()));
    }
}