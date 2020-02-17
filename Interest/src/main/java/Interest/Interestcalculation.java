package Interest;

import java.io.IOException;

public interface Interestcalculation {
    public double calculateSimpleInterest();

    public void readInput() throws IOException;
    public double calculateCompoundInterest();
}
