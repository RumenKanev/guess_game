package guess_game;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GameTest {
    @Test public void testGetsWordToGuess() {
        WordChoser mockedChoser = mock(WordChoser.class);
        Game game = new Game(mockedChoser);
        assertNotNull(game.getWordToGuess());
    }
    @Test public void testGetInitialRemainingAttempts() {   WordChoser mockedChoser = mock(WordChoser.class);
        Game game = new Game(mockedChoser);
        assertEquals( game.getRemainingAttempts(), 10);
    }


    @Test public  void testWordChooser(){
        WordChoser chooser = new WordChoser();
        assertNotNull(chooser.getRandomWordFromDictionary() );
    }

    @Test
    public void testGetsWordToGuessWithRandomWord() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChoser);

        assertEquals(game.getWordToGuess(), "D________");
    }
}

