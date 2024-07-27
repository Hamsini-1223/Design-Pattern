/**
 * The `Parent` class implements the `ObserverI` interface and prints a notification with the new score
 * when updated with a `StudentPerformance` object.
 */

package observer;

public class Parent implements ObserverI {
    @Override
    public void update(StudentPerformance performance) {
        System.out.println("Parent notified. New score: " + performance.getScore());
    }
}
