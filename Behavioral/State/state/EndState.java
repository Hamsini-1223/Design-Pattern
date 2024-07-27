/**
 * The EndState class represents the game state when the game has ended. It provides methods to handle the game state when the game is over.
 */

package State.state;

public class EndState implements GameState {
    private Game game;

    public EndState(Game game) {
        this.game = game;
    }

    @Override
    public void startGame() {
        System.out.println("Game is over. Restarting...");
        game.setState(game.getStartState());
    }

    @Override
    public void playGame() {
        System.out.println("Game is over. Restart to play.");
    }

    @Override
    public void endGame() {
        System.out.println("Game is already over.");
    }
}
