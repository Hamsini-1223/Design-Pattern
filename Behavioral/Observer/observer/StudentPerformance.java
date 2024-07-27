/**
 * The `StudentPerformance` class in Java represents a student's performance with the ability to add,
 * remove observers and notify them of score changes.
 */

package observer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentPerformance {
    private final List<ObserverI> observers;
    private int score;

    public StudentPerformance() {
        this.observers = Collections.synchronizedList(new ArrayList<>());
    }

    public void addObserver(ObserverI observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverI observer) {
        observers.remove(observer);
    }

    public void setScore(int score) { // Can be changed to attendance. -> remains constant.
        this.score = score; 
        notifyObservers();
    }

    private void notifyObservers() {
        synchronized (observers) {
            for (ObserverI observer : observers) {
                observer.update(this);
            }
        }
    }

    public int getScore() {
        return score;
    }
}
