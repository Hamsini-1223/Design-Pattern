/**
 * The `KinestheticTeachingStrategy` class implements the `TeachingStrategy` interface and defines a
 * teaching method that involves hands-on activities and experiments.
 */
package Strategy.strategy;


public class KinestheticTeachingStrategy implements TeachingStrategy {
    @Override
    public void teach() {
        System.out.println("Teaching with hands-on activities and experiments.");
    }
}
