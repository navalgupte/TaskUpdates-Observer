package org.example;

import java.util.ArrayList;

public class TaskChangeObservable {
    private ArrayList observers = new ArrayList();

    public void addTaskChangeObserver(TaskChangeObserver observer) {
        if(!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void removeTaskChangeObserver(TaskChangeObserver observer) {
        observers.remove(observer);
    }

    public void selectTask(Task task) {
        for (Object observer : observers) {
            ((TaskChangeObserver) observer).taskSelected(task);
        }
    }

    public void addTask(Task task) {
        for (Object observer : observers) {
            ((TaskChangeObserver) observer).taskAdded(task);
        }
    }

    public void updateTask(Task task) {
        for (Object observer : observers) {
            ((TaskChangeObserver) observer).taskChanged(task);
        }
    }
}
