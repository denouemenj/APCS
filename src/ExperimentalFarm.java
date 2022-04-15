

public class ExperimentalFarm {

    private Plot[][] farmPlots;


    public ExperimentalFarm(Plot[][] p) {

        farmPlots = p;

    }


    /**
     * Returns the plot with the highest yield for a given crop type, as described in part (a).
     */

    public Plot getHighestYield(String c) {
        Plot maxPlot = null;
        int maxYield = 0;
        for (int i = 0; i < farmPlots.length; i++) {
            for (int j = 0; j < farmPlots[i].length; j++) {
                if (farmPlots[i][j].getCropType().equalsIgnoreCase(c) && farmPlots[i][j].getCropYield() > maxYield) {
                    maxYield = farmPlots[i][j].getCropYield();
                    maxPlot = farmPlots[i][j];
                }
            }
        }
        return maxPlot;
    }


    /**
     * Returns true if all plots in a given column in the two-dimensional array farmPlots
     * <p>
     * contain the same type of crop, or false otherwise, as described in part (b).
     */

    public boolean sameCrop(int col) {
        boolean isAllSame = true;
        String cropType = farmPlots[0][col].getCropType();
        for (int i = 0; i < farmPlots.length; i++) {
            if (!cropType.equalsIgnoreCase(farmPlots[i][col].getCropType())) {
                isAllSame = false;
            }
        }
        return isAllSame;
    }

}