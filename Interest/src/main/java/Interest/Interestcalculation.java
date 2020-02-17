package Interest;

import java.io.IOException;

public interface Interestcalculation {
    public double calculateSimpleInterest(InterestComponents val);

    public void displayResult(int x) throws IOException;

    public void readInput() throws IOException;

    public double calculateCompoundInterest(InterestComponents val);
}
