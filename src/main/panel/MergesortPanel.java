package panel;

public class MergesortPanel extends SortPanel {
    @Override
    public void run() {
        try {
            mergeSort(0, SIZE - 1);
            frame.enableSort();
            frame.getThread().interrupt();
        } catch (InterruptedException e) {
        }
        repaint();
    }

    public void mergeSort(int start, int end) throws InterruptedException {
        if ((end - start) > 0) {
            mergeSort(start, start + (end - start) / 2);
            mergeSort(start + (end - start) / 2 + 1, end);
            merge(start, start + (end - start) / 2, start + (end - start) / 2 + 1, end);
        }
    }

    public void merge(int start1, int end1, int start2, int end2) throws InterruptedException {
        int[] arr = new int[end1 - start1 + 1];
        int[] arr2 = new int[end2 - start2 + 1];
        int[] tmp = new int[arr.length + arr2.length];
        System.arraycopy(this.arr, start1, arr, 0, arr.length);
        System.arraycopy(this.arr, start2, arr2, 0, arr2.length);
        Thread.sleep(1);
        repaint();
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < arr.length && current2 < arr2.length) {
            Thread.sleep(1);
            repaint();
            if (arr[current1] < arr2[current2]) {
                tmp[current3++] = arr[current1++];
            } else {
                tmp[current3++] = arr2[current2++];
            }
            Thread.sleep(1);
            repaint();
        }

        while (current1 < arr.length) {
            tmp[current3++] = arr[current1++];
            Thread.sleep(1);
            repaint();
        }

        while (current2 < arr2.length) {
            tmp[current3++] = arr2[current2++];
            Thread.sleep(1);
            repaint();
        }

        for (int i = 0; i < tmp.length; i++) {
            this.arr[start1 + i] =  tmp[i];
            Thread.sleep(1);
            repaint();
        }
    }
}
