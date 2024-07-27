/**
 * The `Student` class in the `Strategy.strategyexample` package allows students to set a teaching
 * strategy and learn using that strategy.
 */

package Strategy.strategy;

public class Student {
    private TeachingStrategy strategy;

    public void setStrategy(TeachingStrategy strategy) {
        this.strategy = strategy;
    }

    public void learn() {
        strategy.teach();
    }
}
