package panel;

import type.SortType;
import ui.VisualizationFrame;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ChoicePanel extends JPanel {

    private ButtonGroup group;

    private JRadioButton bubble;
    private JRadioButton insertion;
    private JRadioButton merge;
    private JRadioButton quick;
    private JRadioButton selection;

    private JButton sort;
    private JButton reset;

    private VisualizationFrame frame;

    public ChoicePanel() {
        initButtons();
        addButtons();
        setupListener();
        setBorder(new TitledBorder("Sorting Algorithms"));
    }

    public void setFrame(VisualizationFrame frame) {
        this.frame = frame;
    }

    public void initButtons() {
        bubble = new JRadioButton("Bubble Sort", true);
        insertion = new JRadioButton("Insertion Sort", false);
        merge = new JRadioButton("Mergesort", false);
        quick = new JRadioButton("Quicksort", false);
        selection = new JRadioButton("Selection Sort", false);
        sort = new JButton("sort");
        reset = new JButton("reset");
        group = new ButtonGroup();
        group.add(bubble);
        group.add(insertion);
        group.add(merge);
        group.add(quick);
        group.add(selection);
    }

    public void addButtons() {
        add(bubble);
        add(insertion);
        add(merge);
        add(quick);
        add(selection);
        add(sort);
        add(reset);
    }

    public void setupListener() {
        sort.addActionListener(e -> {
            if (bubble.isSelected()) {
                frame.start(SortType.BUBBLE);
            } else if (insertion.isSelected()) {

            } else if (merge.isSelected()) {

            } else if (quick.isSelected()) {

            } else if (selection.isSelected()) {

            }
        });
        reset.addActionListener(e -> {

        });
    }
}
