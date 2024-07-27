/**
 * The `AuditoryTeachingStrategy` class implements the `TeachingStrategy` interface and defines a
 * teaching strategy that involves lectures and discussions.
 */
package Strategy.strategy;


public class AuditoryTeachingStrategy implements TeachingStrategy {
    @Override
    public void teach() {
        System.out.println("Teaching with lectures and discussions.");
    }
}

