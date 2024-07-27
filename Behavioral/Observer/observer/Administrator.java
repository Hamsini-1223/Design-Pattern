/**
 * The Administrator class implements the ObserverI interface and prints out the new score when notified
 * of a student's performance update.
 */
package observer;

public class Administrator implements ObserverI { //administrator includes the management.
    @Override
    public void update(StudentPerformance performance) {
        System.out.println("Administrator notified. New score: " + performance.getScore());
    }
}
