//----------------------------------------------------------------------
// BlobApp.java          by Dale/Joyce/Weems                   Chapter 4
//
// Instantiates a Grid based on a percentage probability provided by the 
// user and reports the number of blobs in the Grid.
//----------------------------------------------------------------------

import java.util.Scanner;

public class BlobApp {

    public static void main(String[] args) {
        Scanner conIn = new Scanner(System.in);

        final int GRIDR = 10;   // number of grid rows
        final int GRIDC = 40;   // number of grid columns

        // Get percentage probability of blob characters
        // int percentage;
        /*System.out.print("Input percentage probability (0 to 100): ");
        if (conIn.hasNextInt()) {
            percentage = conIn.nextInt();
        } else {
            System.out.println("Error: you must enter an integer.");
            System.out.println("Terminating program.");
            return;
        }
        System.out.println(); */
        // display grid and blob count
        //System.out.println(grid);
        int percentage = 0;
        while (percentage <= 100) {
            int count = 0;
            int blobCount = 0;
            int blobAvg;

            while (count <= 100) {
                // create grid
                Grid grid = new Grid(GRIDR, GRIDC, percentage);
                blobCount += grid.blobCount();
                count++;
            }

            blobAvg = blobCount / 100;
            System.out.println("Avg # of blobs for " + percentage + "% is: "
                    + blobAvg);
            percentage++;
        }
    }
}
