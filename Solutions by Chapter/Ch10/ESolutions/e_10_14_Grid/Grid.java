package e_10_14_Grid;

import java.util.ArrayList;

/**
 * Implement a class {@code Grid} that stores measurements in a rectangular
 * grid. The grid has a given number of rows and columns, and a description
 * string can be added for any grid location. Supply the following constructor
 * and methods:
 * <p><pre>
 *      public Grid(int numRows, int numColumns)
 *      public void add(int row, int column, String description)
 *      public String getDescription(int row, int column)
 *      public ArrayList&lt;Location&gt; getDescribedLocations()</pre>
 * Here, {@code Location} is an inner class that encapsulates the row and the
 * column of a grid location.
 */
public class Grid
{
    private Location[][] grid;

    /**
     * Constructs a grid object.
     *
     * @param numRows    the number of rows
     * @param numColumns the number of columns
     */
    public Grid(int numRows, int numColumns)
    {
        grid = new Location[numRows][numColumns];
    }

    /**
     * Adds new location object to the grid.
     *
     * @param row         the row of the Location object
     * @param column      the column of the Location object
     * @param description the description of the location
     */
    public void add(int row, int column, String description)
    {
        grid[row][column] = new Location(row, column, description);
    }

    /**
     * Gets the description of the row and column location.
     *
     * @param row    the row
     * @param column the column
     * @return the description of the location
     */
    public String getDescription(int row, int column)
    {
        if (grid[row][column] != null)
        {
            return grid[row][column].getDescription();
        }
        return "location is empty";
    }

    /**
     * Gathers described locations in the Locations list.
     *
     * @return the list of described locations
     */
    public ArrayList<Location> getDescribedLocations()
    {
        ArrayList<Location> describedLocations = new ArrayList<>();
        for (Location[] arr : grid)
        {
            for (Location location : arr)
            {
                if (location != null)
                {
                    describedLocations.add(location);
                }
            }
        }
        return describedLocations;
    }

    /**
     * Inner {@code Location} class.
     */
    class Location
    {
        private int row;
        private int column;
        private String description;

        /**
         * Constructs location object.
         *
         * @param row         the row
         * @param column      the column
         * @param description the description
         */
        Location(int row, int column, String description)
        {
            this.row = row;
            this.column = column;
            this.description = description;
        }

        /**
         * @return the description of the location
         */
        public String getDescription()
        {
            return description;
        }

        /**
         * @return the row number
         */
        public int getRow()
        {
            return row;
        }

        /**
         * @return the column number
         */
        public int getColumn()
        {
            return column;
        }
    }
}
