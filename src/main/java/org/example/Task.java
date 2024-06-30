package org.example;

public class Task {
    private String name = "";
    private String notes = "";
    private double timeRequired;

    public Task() {}

    public Task(String name, String notes, double timeRequired) {
        this.name = name;
        this.notes = notes;
        this.timeRequired = timeRequired;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

    public double getTimeRequired() {
        return timeRequired;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setTimeRequired(double timeRequired) {
        this.timeRequired = timeRequired;
    }

    public String toString() {
        return name + ": " + notes;
    }
}
