package ui;

import javax.swing.*;
import java.awt.*;

public class VisualizationFrame {
    public static final int WIDTH = 1500;
    public static final int HEIGHT = 800;

    JFrame frame;
    ChoicePanel choice;
    VisualizationPanel visual;

    public VisualizationFrame() {
        frame = new JFrame();
        choice = new ChoicePanel();
        visual = new VisualizationPanel();
        frame.setLayout(new BorderLayout());
        frame.add(choice, BorderLayout.NORTH);
        frame.add(visual, BorderLayout.CENTER);
        choice.setVisual(visual);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
