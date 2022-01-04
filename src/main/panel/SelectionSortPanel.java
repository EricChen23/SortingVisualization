package panel;

public class SelectionSortPanel extends SortPanel {
    @Override
    public void run() {
        try {
            for (int i = 0; i < SIZE - 1; i++) {
                int currentMinIndex = i;
                for (int j = i + 1; j < SIZE; j++) {
                    repaint();
                    Thread.sleep(1);
                    if (arr[currentMinIndex] > arr[j]) {
                        currentMinIndex = j;
                        repaint();
                    }
                }

                if (currentMinIndex != i) {
                    int tmp = arr[currentMinIndex];
                    arr[currentMinIndex] = arr[i];
                    arr[i] = tmp;
                    repaint();
                    Thread.sleep(1);
                }
                repaint();
            }
            frame.enableSort();
            frame.getThread().interrupt();
        } catch (InterruptedException e) {
        }
        repaint();
    }
}
