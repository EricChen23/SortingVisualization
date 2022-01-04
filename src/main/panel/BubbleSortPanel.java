package panel;

public class BubbleSortPanel extends SortPanel{

    @Override
    public void run() {
        try {
            for (int i = 1; i < SIZE; i++) {
                for (int j = 0; j < SIZE - i; j++) {
                    repaint();
                    Thread.sleep(1);
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        repaint();
                        Thread.sleep(1);
                    }
                }
            }
            frame.enableSort();
            frame.getThread().interrupt();
        } catch (InterruptedException e) {
        }
        repaint();
    }

}
