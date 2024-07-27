/**
 * The `Game` class represents the main game logic, managing the different game states (start, play, end) and the current state of the game.
 *
 * The `Game` class is responsible for:
 * - Initializing the different game states (start, play, end)
 * - Setting the current game state
 * - Providing methods to start, play, and end the game
 */

package State.state;

public class Game {
    private GameState startState;
    private GameState playState;
    private GameState endState;

    private GameState currentState;

    public Game() {
        startState = new StartState(this);
        playState = new PlayState(this);
        endState = new EndState(this);

        currentState = startState;
    }

    public void setState(GameState state) {
        currentState = state;
    }

    public GameState getStartState() {
        return startState;
    }

    public GameState getPlayState() {
        return playState;
    }

    public GameState getEndState() {
        return endState;
    }

    public void startGame() {
        currentState.startGame();
    }

    public void playGame() {
        currentState.playGame();
    }

    public void endGame() {
        currentState.endGame();
    }
}
