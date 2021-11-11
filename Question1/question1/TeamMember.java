import java.util.ArrayList;

/**
 * This class represents a member of a project team. A member has a name and can be assigned tasks. 
 *
 * @author Mattheas Jamieson
 * @see Task
 * @see Test
 * @version 1.0
 * @since 1.0
 */
public class TeamMember {
    // attributes
    private String name;
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