package ui;

import model.SortType;

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

    private VisualizationPanel visual;

    public ChoicePanel() {
        initButtons();
        addButtons();
        setupListener();
        setBorder(new TitledBorder("Sorting Algorithms"));
    }

    public void setVisual(VisualizationPanel v) {
        visual = v;
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
                visual.sort(SortType.BUBBLE);
            } else if (insertion.isSelected()) {
                visual.sort(SortType.INSERTION);
            } else if (merge.isSelected()) {
                visual.sort(SortType.MERGE);
            } else if (quick.isSelected()) {
                visual.sort(SortType.QUICK);
            } else if (selection.isSelected()) {
                visual.sort(SortType.SELECTION);
            }
        });
        reset.addActionListener(e -> {
            visual.reset();
        });
    }
}
