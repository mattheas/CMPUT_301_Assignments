

import java.util.ArrayList;

public class Task {
    // attributes
    private String title;
    private int effort;
    private Task taskDependency = null;
    private ArrayList<TeamMember> assignedMembers;


    // constructor
    public Task(String title, int effort) {
        this.title = title;
        this.effort = effort;
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