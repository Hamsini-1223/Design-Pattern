/**
 * The `StatePatternDemo` class demonstrates the usage of the State design pattern in a game context.
 * It creates a `Game` object and simulates the different states of the game, such as starting, playing, and ending the game.
 */

package State.state;

public class StatePatternMain {
    public static void main(String[] args) {
        Game game = new Game();

        game.startGame();
        game.playGame();
        game.endGame();

        game.startGame();
    }
}
