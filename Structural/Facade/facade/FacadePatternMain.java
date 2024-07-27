/**
 * The FacadePatternMain class demonstrates the usage of the EducationalFacade,
 * which provides a simplified interface to the underlying educational
 * subsystems.
 *
 * This class creates an instance of the EducationalFacade and uses it to
 * track student performance, manage educational content, and send
 * communications to students.
 */
package Facade.facade;

public class FacadePatternMain {
    public static void main(String[] args) {
        EducationalFacade facade = new EducationalFacade();

        facade.trackStudentPerformance("12345");
        facade.manageEducationalContent("ABC123");
        facade.sendCommunication("Welcome to the new semester!");
    }
}
