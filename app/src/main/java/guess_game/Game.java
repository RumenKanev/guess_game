package guess_game;


public class Game {
    String words;
    Game(String word){
       words = word;
        System.out.println(words);
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


}