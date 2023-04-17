package e_10_14_Grid;

import java.util.ArrayList;

/**
 * {@code GridDemo} class.
 */
public class GridDemo
{
    public static void main(String[] args)
    {
        int gridRows = 3;
        int gridColumns = 3;

        Grid grid = new Grid(gridRows, gridColumns);

        grid.add(0, 0, "");
        grid.add(1, 1, "player 1");
        grid.add(2, 2, "player 2");

        ArrayList<Grid.Location> locations = grid.getDescribedLocations();

        for (Grid.Location l: locations)
        {
            System.out.println(l.getDescription());
        }

        for (int i = 0; i < gridRows; i++)
        {
            for (int j = 0; j < gridColumns; j++)
            {
                if (!grid.getDescription(i, j).equals("location is empty"))
                {
                    System.out.println(grid.getDescription(i, j));
                }
            }
        }
    }
}
