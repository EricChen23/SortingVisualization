package model;

import ui.VisualizationPanel;

public abstract class SortingAlgorithm {

    private VisualizationPanel vp;

    public void setVp(VisualizationPanel v) {
        vp = v;
    }

    public VisualizationPanel getVp() {
        return vp;
    }

    public abstract void sort(int[] arr);
}
