package ui;

import panel.*;
import type.SortType;

import javax.swing.*;
import java.awt.*;

public class VisualizationFrame {
    public static final int WIDTH = 1500;
    public static final int HEIGHT = 800;

    private Thread thread;
    private JFrame frame;
    private ChoicePanel choice;
    private SortPanel sort;


    public VisualizationFrame() {
        frame = new JFrame();
        choice = new ChoicePanel();
        choice.setFrame(this);
        frame.setLayout(new BorderLayout());
        frame.add(choice, BorderLayout.NORTH);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void start(SortType t) {
        if (t.equals(SortType.BUBBLE)) {
            sort = new BubbleSortPanel();
        } else if (t.equals(SortType.INSERTION)) {
            sort = new InsertionSortPanel();
        } else if (t.equals(SortType.MERGE)) {
            sort = new MergesortPanel();
        } else if (t.equals(SortType.QUICK)) {
            sort = new QuicksortPanel();
        } else if (t.equals(SortType.SELECTION)) {
            sort = new SelectionSortPanel();
        }
        sort.setFrame(this);
        frame.add(sort, BorderLayout.CENTER);
        update();
        thread = new Thread(sort);
        choice.setSort(false);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    public void enableSort() {
        choice.setSort(true);
    }

    private void update() {
        frame.revalidate();
        frame.repaint();
    }

}
