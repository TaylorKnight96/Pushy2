package com.example.largeproject.pushy;

import java.util.*;

class Project{

    public String name;
    public String color;
    public ArrayList<Task> tasks;

    public Project() {}
    public Project(String name, String color)
    {
        Project project1 = new Project();
        tasks = new ArrayList<>();
        this.name = name;
        this.color = color;
    }

    public Task getTask(String taskName)
    {
        for(int i = 0; i < tasks.size(); i++)
        {
            if(tasks.get(i).name == taskName) return tasks.get(i);
        }
        return null;
    }


}

class Task{
    public String name;
    public int priority;

    public Task() {}
    public Task(String name, int priority)
    {
        Task task1 = new Task();
        this.name = name;
        this.priority = priority;
    }
}

class TrackTime{

}

public class User {

    public ArrayList<Project> projects;

    public void main(String[] args)
    {
        User userData = new User();
        projects = new ArrayList<>();

    }

    public Project getProject(String projectName)
    {
        for(int i = 0; i < projects.size(); i++)
        {
            if(projects.get(i).name == projectName) return projects.get(i);
        }
        return null;
    }
}
