package construction_cost;

import java.io.IOException;
import java.util.Map;

public interface CostCalculation {
    Map<String, Integer> MY_MAP = Map.of(
            "normal standard materials no", 1200,
            "above standard materials no", 1500,
            "high standard materials no", 1800,
            "high standard materials fully", 2500
    );

    double calculateCost(double area, String choiceMaterial, String choiceAutomation) throws IOException;

    boolean read() throws IOException;

    void displayResultCost() throws IOException;
}
