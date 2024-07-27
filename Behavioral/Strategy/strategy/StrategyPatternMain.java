/**
 * The `StrategyPatternMain` class demonstrates the use of different teaching strategies with a student
 * object.
 */
package Strategy.strategy;


public class StrategyPatternMain { //
    public static void main(String[] args) {
        Student student = new Student();

        student.setStrategy(new VisualTeachingStrategy());
        student.learn();

        student.setStrategy(new AuditoryTeachingStrategy());
        student.learn();

        student.setStrategy(new KinestheticTeachingStrategy());
        student.learn();
    }
}
