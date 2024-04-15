package com.example.edith.models;

import com.example.edith.controllers.SchedulerController;

import java.time.ZonedDateTime;

public class Task extends CalendarEntity {
    private boolean isCompleted;
    private boolean isOverdue;
    private String deadline;
    public Task() {
        super(null,null,null);
    }

    public Task(String taskTitle, String startTime, String endTime) {
        super(taskTitle, startTime, endTime);
    }
    public String getDeadline() {
        return deadline;
    }
    @Override
    public String getType() {
        return "Task";
    }
    @Override
    public boolean isReschedulable() {
        return SchedulerController.checkIfTaskIsReschedulable(this);
    }


    public boolean isCompleted() {
        return isCompleted;
    }

    public boolean isOverdue() {
        return isOverdue;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public void setOverdue(boolean isOverdue) {
        this.isOverdue = isOverdue;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
