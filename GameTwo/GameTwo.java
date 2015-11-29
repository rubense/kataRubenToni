package KataRubenToni.GameTwo;


import KataRubenToni.GameTwo.validator.NumberValidator;
import KataRubenToni.kata.Game;

/**
 * Created by toni on 26/11/15.
 */
public class GameTwo implements Game {

    private GameFigures gameFigures;

    public GameTwo() {
        gameFigures = new GameFigures();
    }

    @Override
    public void play() {
        try {
            gameFigures.play();
        } catch (NumberValidator.BetterCallFirstIsValidMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exit() {

    }

    @Override
    public String toString() {
        return gameFigures.toString();
    }
}
