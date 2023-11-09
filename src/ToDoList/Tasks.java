package ToDoList;
import java.util.ArrayList;
import java.util.Scanner;

public class Tasks{
    private String taskName;
    private String taskDescription;
    private boolean completed;

    public Tasks(String taskName, String taskDescription){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.completed = false;
    }
    //Getter and Setter methods
    public String getTaskName(){
        return taskName;
    }
    public String getTaskDescription(){
        return taskDescription;
    }
    public boolean isCompleted(){
        return completed;
    }
    public void setCompleted(boolean completed){
        this.completed = completed;
    }
}
