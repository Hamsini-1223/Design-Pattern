/**
 * The `PlayState` class implements the `GameState` interface and represents the state of playing the
 * game in a game application.
 */

package State.state;

public class PlayState implements GameState {
    private Game game;

    public PlayState(Game game) {
        this.game = game;
    }

    @Override
    public void startGame() {
        System.out.println("Game is already started.");
    }

    @Override
    public void playGame() {
        System.out.println("Playing the game...");
        game.setState(game.getEndState());
    }

    @Override
    public void endGame() {
        System.out.println("Can't end game while playing.");
    }
}
