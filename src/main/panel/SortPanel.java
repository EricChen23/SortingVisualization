package panel;

import ui.VisualizationFrame;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Random;

public abstract class SortPanel extends JPanel implements Runnable{
    protected static final int SIZE = 120;
    protected int[] arr;

    public SortPanel() {
        setBorder(new TitledBorder("Visualization"));
        generateArr();
    }

    private void generateArr() {
        arr = new int[SIZE];
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0; i < SIZE; i++) {
            arr[i] = r.nextInt(SIZE * 100);
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        for (int i = 0; i < SIZE; i++) {
            g2.fillRect((getWidth() + 30) / SIZE * (i + 1), VisualizationFrame.HEIGHT - 110, (getWidth() + 30) / SIZE - 1, - arr[i] / 20);
        }

    }

    @Override
    public abstract void run();

    public abstract void reset();

}
