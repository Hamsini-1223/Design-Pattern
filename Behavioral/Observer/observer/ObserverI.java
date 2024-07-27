// This code snippet is defining an interface named `ObserverI` in the `observer` package. The
// interface has a single method `update` that takes a `StudentPerformance` object as a parameter.
// Classes that implement this interface will need to provide an implementation for the `update`
// method, which will be called when there are updates to a student's performance.

package observer;

public interface ObserverI {
    void update(StudentPerformance performance);
}
