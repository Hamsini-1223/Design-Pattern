/**
 * The EducationalFacade class provides a simplified interface for managing educational
 * functionality, including tracking student performance, managing educational content,
 * and sending communications.
 *
 * This class acts as a Facade, hiding the complexity of the underlying subsystems
 * (PerformanceTracker, ContentManager, and CommunicationTool) and providing a
 * high-level API for common educational tasks.
 */
package Facade.facade;

public class EducationalFacade {
    private PerformanceTracker performanceTracker;
    private ContentManager contentManager;
    private CommunicationTool communicationTool;

    public EducationalFacade() {
        performanceTracker = new PerformanceTracker();
        contentManager = new ContentManager();
        communicationTool = new CommunicationTool();
    }

    public void trackStudentPerformance(String studentId) {
        performanceTracker.trackPerformance(studentId);
    }

    public void manageEducationalContent(String contentId) {
        contentManager.manageContent(contentId);
    }

    public void sendCommunication(String message) {
        communicationTool.sendMessage(message);
    }
}
