package panel;

public class InsertionSortPanel extends SortPanel {
    @Override
    public void run() {
        try {
            for (int i = 1; i < SIZE; i++) {
                for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                    Thread.sleep(1);
                    repaint();
                    Thread.sleep(1);
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
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
