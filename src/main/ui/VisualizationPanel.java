package ui;

import model.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.util.Random;

public class VisualizationPanel extends JPanel {

    public static final int SIZE = 295;
    SortingAlgorithm sa;
    int[] arr;

    public VisualizationPanel() {
        setBorder(new TitledBorder("Visualization"));
        generateArr();
    }

    public void generateArr() {
        arr = new int[SIZE];
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0; i < SIZE; i++) {
            arr[i] = r.nextInt(SIZE * 100);
        }
    }

    public void sort(SortType t) {
        if (t.equals(SortType.BUBBLE)) {
            sa = new BubbleSort();
        } else if (t.equals(SortType.INSERTION)) {
            sa = new InsertionSort();
        } else if (t.equals(SortType.MERGE)) {
            sa = new Mergesort();
        } else if (t.equals(SortType.QUICK)) {
            sa = new Quicksort();
        } else if (t.equals(SortType.SELECTION)) {
            sa = new SelectionSort();
        }
        sa.sort(arr);
    }
}
