package panel;

public class QuicksortPanel extends SortPanel {
    @Override
    public void run() {
        try {
            quicksort(0, SIZE - 1);
            frame.enableSort();
            frame.getThread().interrupt();
        } catch (InterruptedException e) {}
        repaint();
    }

    private void quicksort(int low, int high) throws InterruptedException {
        int i = low;
        int j = high;
        Thread.sleep(1);
        repaint();
        int pivot = arr[low + (high - low) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
                Thread.sleep(3);
                repaint();
            }
            while (arr[j] > pivot) {
                j--;
                Thread.sleep(3);
                repaint();
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                Thread.sleep(3);
                repaint();
                i++;
                j--;
            }
        }
        if (low < j) {
            quicksort(low, j);
        }
        if (i < high) {
            quicksort(i, high);
        }
        repaint();
    }

}
