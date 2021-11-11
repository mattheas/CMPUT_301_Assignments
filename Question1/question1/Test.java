

public class Test {

    // entry into project
    public static void main(String[] args) {
        //System.out.println("hello");
        String taskName = "task1";
        int taskEffort = 3;
        String memberName = "JohnDoe";
        

        // make task and team member
        Task testTask = new Task(taskName, taskEffort);
        TeamMember testMember = new TeamMember(memberName);

        // assert member does not have task
        //assertFalse(testMember.hasTask(testTask));
        if (testMember.hasTask(testTask) == false) {
            System.out.println("member does not have task");
        }
        
        // assign task to team member
        testMember.addTask(testTask);

        if (testMember.hasTask(testTask) == true) {
            System.out.println("member has addded task");
        }

        // check it was all done correctly
        //assertTrue(testMember.hasTask(testTask));
    }
}