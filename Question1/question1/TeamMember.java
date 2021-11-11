import java.util.ArrayList;

/**
 * This class represents a member of a project team. A member has a name, and can have zero, one or
 * more tasks assigned to them. 
 *
 *
 *
 *
 * This class represents a task to be completed. A task has a name and an effort estimate in days. A task
 * can have a task dependency, meaning another task must be completed before it can be completed. A task 
 * may be assigned to zero, one or multiple team members. A task must have a name and effort estimate. A
 * task dependency is optional and shall be assigned null by default if no task dependency is explicity given. 
 *
 * @author Mattheas Jamieson
 * @see TeamMember
 * @see Test
 * @version 1.0
 * @since 1.0
 */
public class TeamMember {
    // attributes
    private String name;
    //private Task[] assignedTasks;
    private ArrayList<Task> assignedTasks;
    
    // constructor
    public TeamMember(String name) {
        this.name = name;
        assignedTasks = new ArrayList<>();
    }

    // methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




    public ArrayList<Task> getTaskList() {
        return assignedTasks;
    }

    public void addTask(Task task) {
        assignedTasks.add(task);
    }

    public int countTasks() {
        return assignedTasks.size();
    }

    public boolean hasTask(Task task) {
        return assignedTasks.contains(task);
    }

    public void deleteTask(Task task) {
        assignedTasks.remove(task);
    }

}