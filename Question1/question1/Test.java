/**
 * This class is used to test the functionality of Task & TeamMember. First an instance of Task and TeamMember is created. 
 * The instance of Task has no task dependency. Then the instantiaed task is assigned to the instance of TeamMember. Then 
 * use API of classes to check if test was performed correctly. I used if-statements instead of JUnit Assert statements
 * for sake of time and simplicity.
 *
 * @author Mattheas Jamieson
 * @see Task
 * @see TeamMember
 * @version 1.0
 * @since 1.0
 */
public class Test {

    public static void main(String[] args) {
        String taskName = "task1";
        int taskEffort = 3;
        String memberName = "JohnDoe";
        
        // instantiate task and team member
        Task testTask = new Task(taskName, taskEffort);
        TeamMember testMember = new TeamMember(memberName);

        // assert member does not have task
        if (testMember.hasTask(testTask) == false) {
            System.out.println("member does not have task");
        }
        
        // assign task to team member
        testMember.addTask(testTask);

        // assert member now has task
        if (testMember.hasTask(testTask) == true) {
            System.out.println("member has added task");
        } 
    }
}