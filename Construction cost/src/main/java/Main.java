import construction_cost.CostCalculation;
import construction_cost.CostCalculationimpl;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Main {
    public static void main(String args[]) throws IOException {
        double area;
        String sMaterial;
        String auto;
        CostCalculation cal = new CostCalculationimpl();
        Scanner scan = new Scanner(System.in);
        OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        try {
            streamWriter.write("Enter Material (normal or above or high ):\t");
            streamWriter.flush();
            sMaterial = scan.nextLine();
            streamWriter.write("Enter automatic ( fully or no ) :\t");
            streamWriter.flush();
            auto = scan.nextLine();
            streamWriter.write("Enter area :\t");
            streamWriter.flush();
            area = scan.nextDouble();
            streamWriter.write("Total cost :\t");
            streamWriter.write(String.valueOf(cal.calculateCost(area, sMaterial, auto)) + "INR");
            streamWriter.flush();
        } catch (Exception e) {
            streamWriter.write("Invalid input\n");
            streamWriter.flush();
        }
    }
}
