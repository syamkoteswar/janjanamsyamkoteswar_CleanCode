import construction_cost.CostCalculation;
import construction_cost.CostCalculationimpl;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        CostCalculation cal = new CostCalculationimpl();
        if (cal.read())
            cal.displayResultCost();
    }
}
