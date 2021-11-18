package guess_game;

public class Game {
    int counter = 10;
    String words;

    public Game(WordChoser chooser){
       this.words = chooser.getRandomWordFromDictionary();
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