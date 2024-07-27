/**
 * The `ObserverPatternMain` class demonstrates the observer pattern by setting a student's
 * score and notifying observers (teacher, parent, administrator) of the change.
 */

package observer;

public class ObserverPatternMain {
    public static void main(String[] args) {
        StudentPerformance performance = new StudentPerformance();
        performance.addObserver(new Teacher());
        performance.addObserver(new Parent());
        performance.addObserver(new Administrator());

        performance.setScore(95);
    }
}
