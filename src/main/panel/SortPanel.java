package panel;

import ui.VisualizationFrame;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Random;

public abstract class SortPanel extends JPanel implements Runnable{
    protected static final int SIZE = 120;
    protected int[] arr;
    protected VisualizationFrame frame;

    public SortPanel() {
        setBorder(new TitledBorder("Visualization"));
        generateArr();
    }

    public void setFrame(VisualizationFrame f) {
        frame = f;
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
        for (int i = 0; i < SIZE; i++) {
            g2.setColor(Color.RED);
            g2.fillRect((getWidth() + 30) / SIZE * (i + 1), VisualizationFrame.HEIGHT - 110, (getWidth() + 30) / SIZE - 1, - arr[i] / 20);
        }

    }

    @Override
    public abstract void run();

}
