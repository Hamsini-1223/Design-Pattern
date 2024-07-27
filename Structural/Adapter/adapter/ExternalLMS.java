/**
 * Submits a student's score to an external Learning Management System (LMS).
 *
 *  studentIdentifier the unique identifier for the student
 *  score the score to be submitted for the student
 */
package Adapter.adapter;

public class ExternalLMS {
    public void submitScore(String studentIdentifier, int score) {
        System.out.println("Score submitted to LMS for student " + studentIdentifier +" with score " + score);
    }
}
