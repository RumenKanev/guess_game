package guess_game;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GameTest {
    @Test public void testGetsWordToGuess() {
        WordChoser mockedChooser = mock(WordChoser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        Game game = new Game(mockedChooser);
        assertNotNull(game.getWordToGuess());

    }
    @Test public void testGetInitialRemainingAttempts() {   
        WordChoser mockedChooser = mock(WordChoser.class);
        Game game = new Game(mockedChooser);
        assertEquals( game.getRemainingAttempts(), 10);
    }


    @Test public  void testWordChooser(){
        WordChoser chooser = new WordChoser();
        assertNotNull(chooser.getRandomWordFromDictionary() );
    }

    @Test
    public void testGetsWordToGuessWithRandomWord() {
        WordChoser mockedChooser = mock(WordChoser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChooser);

        assertEquals(game.getWordToGuess(), "D________");
    }
}

