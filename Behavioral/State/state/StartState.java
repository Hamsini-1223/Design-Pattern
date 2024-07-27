/**
 * The `StartState` class implements the `GameState` interface and represents the initial state of the game.
 * When the game starts, the `startGame()` method is called, which prints a message and transitions the game to the `PlayState`.
 * The `playGame()` and `endGame()` methods print messages indicating that the game has not started yet.
 */
package State.state;


public class StartState implements GameState {
    private Game game;

    public StartState(Game game) {
        this.game = game;
    }

    @Override
    public void startGame() {
        System.out.println("Game is starting...");
        game.setState(game.getPlayState());
    }

    @Override
    public void playGame() {
        System.out.println("Game hasn't started yet.");
    }

    @Override
    public void endGame() {
        System.out.println("Game hasn't started yet.");
    }
}
