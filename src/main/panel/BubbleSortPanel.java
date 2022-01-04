package panel;

public class BubbleSortPanel extends SortPanel{

    @Override
    public void run() {
        try {
            boolean needNextPass = true;
            for (int k = 1; k < arr.length && needNextPass; k++) {
                needNextPass = false;
                for (int i = 0; i < arr.length - k; i++) {
                    repaint();
                    Thread.sleep(1);
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        repaint();
                        Thread.sleep(1);
                        needNextPass = true;
                    }
                }
            }
        } catch (InterruptedException e) {
        }
        repaint();
    }

    @Override
    public void reset() {

    }
}
