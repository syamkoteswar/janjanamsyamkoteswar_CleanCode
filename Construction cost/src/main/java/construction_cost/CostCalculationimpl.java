package construction_cost;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class CostCalculationimpl implements CostCalculation {

    private OutputStreamWriter streamWriter;

    public CostCalculationimpl() {
        streamWriter = new OutputStreamWriter(System.out);
    }

    @Override
    public double calculateCost(double area, String choiceMaterial, String choiceAutomation) throws IOException {
        String s = "";
        s = s + choiceMaterial + " standard materials " + choiceAutomation;
        double val = 0;
        try {

            val = MY_MAP.get(s) * area;
        } catch (Exception e) {
            throw e;
        }
        return val;
    }

}
