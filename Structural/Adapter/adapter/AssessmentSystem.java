/**
 * Defines an interface for an assessment system that can upload student scores.
 * The `uploadResults` method allows uploading a student's score identified by their student ID.
 */
package Adapter.adapter;

public interface AssessmentSystem {
    void uploadResults(String studentId, int score);
}
