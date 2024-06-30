package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskSelectorPanel extends JPanel implements ActionListener, TaskChangeObserver {
    private JComboBox selector;
    private TaskChangeObservable notifier;

    public TaskSelectorPanel(TaskChangeObservable notifier) {
        this.notifier = notifier;
        createGui();
    }

    public void createGui() {
        selector = new JComboBox();
        selector.addActionListener(this);
        add(selector);
    }

    public void actionPerformed(ActionEvent evt) {
        notifier.selectTask((Task) selector.getSelectedItem());
    }

    public void setTaskChangeObservable(TaskChangeObservable notifier) {
        this.notifier = notifier;
    }

    public void taskAdded(Task task) {
        selector.addItem(task);
    }

    public void taskChanged(Task task) {}
    public void taskSelected(Task task) {}
}
