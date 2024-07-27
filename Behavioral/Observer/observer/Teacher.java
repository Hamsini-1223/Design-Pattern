/**
 * The `Teacher` class implements the `ObserverI` interface and prints out the new score when updated
 * with a `StudentPerformance` object.
 */

package observer;

public class Teacher implements ObserverI {
    @Override
    public void update(StudentPerformance performance) {
        System.out.println("Teacher notified. New score: " + performance.getScore());
    }
}
