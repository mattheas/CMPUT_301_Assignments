import java.util.ArrayList;

/**
 * This class represents a task to be completed. A task has a name and an effort estimate in days. A task
 * can have a task dependency, meaning another task must be completed before it can be completed. A task 
 * may be assigned to zero, one or multiple team members. A task must have a name and effort estimate. A
 * task dependency is optional and shall be assigned null by default if no task dependency is explicity given. 
 * This class has an association relationship with the TeamMember class. 
 *
 * @author Mattheas Jamieson
 * @see TeamMember
 * @see Test
 * @version 1.0
 * @since 1.0
 */
public class Task {
    // attributes
    private String title;
    private int effort;
    private Task taskDependency = null;
    private ArrayList<TeamMember> assignedMembers;

    // constructors
    public Task(String title, int effort) {
        this.title = title;
        this.effort = effort;
        this.taskDependency = null;
        assignedMembers = new ArrayList<>();
    }

    public Task(String title, int effort, Task task) {
        this.title = title;
        this.effort = effort;
        this.taskDependency = task;
        assignedMembers = new ArrayList<>();
    }

    // methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public boolean isTaskDependencyNull() {
        if (taskDependency == null) {
            return true;
        } else {
            return false;
        }
    }

    public Task getTaskDependency() {
        return taskDependency;
    }

    public void setTaskDependency(Task task) {
        taskDependency = task;
    }

    public ArrayList<TeamMember> getMemberList() {
        return assignedMembers;
    }

    public void addMember(TeamMember member) {
        assignedMembers.add(member);
    }

    public int countMembers() {
        return assignedMembers.size();
    }

    public boolean hasMember(TeamMember member) {
        return assignedMembers.contains(member);
    }

    public void deleteMember(TeamMember member) {
        assignedMembers.remove(member);
    }
}