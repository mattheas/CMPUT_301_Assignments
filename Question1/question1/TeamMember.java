

import java.util.ArrayList;

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

    public static void main(String[] args) {
        System.out.println("hello");
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