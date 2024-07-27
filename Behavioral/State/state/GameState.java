/**
 * The `GameState` interface defines the basic operations for a game state in a game application.
 * 
 * The `startGame()` method is called to initialize the game state and prepare the game for play.
 * The `playGame()` method is called to execute the main game logic and update the game state.
 * The `endGame()` method is called to finalize the game state and prepare for the game to end.
 */

package State.state;

public interface GameState {
    void startGame();

    void playGame();

    void endGame();
}
