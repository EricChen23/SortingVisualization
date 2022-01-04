package ui;

import panel.BubbleSortPanel;
import panel.ChoicePanel;
import panel.SortPanel;
import type.SortType;

import javax.swing.*;
import java.awt.*;

public class VisualizationFrame {
    public static final int WIDTH = 1500;
    public static final int HEIGHT = 800;

    JFrame frame;
    ChoicePanel choice;
    SortPanel sort;

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
            frame.add(sort, BorderLayout.CENTER);
            update();
            Thread thread = new Thread(sort);
            thread.start();
        }
    }

    private void update() {
        frame.revalidate();
        frame.repaint();
    }

}
