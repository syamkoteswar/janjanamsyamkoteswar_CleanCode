package Interest;

import Interest.calculation.CompoundInterest;
import Interest.calculation.SimpleInterest;
import Interest.calculation.calculation;

public class InterestcalculationImp implements Interestcalculation {
    private InterestComponents val;
    private calculation cal;

    public InterestcalculationImp(double principal, double rateInPercent, double timeInYears) {
        val = new InterestComponents(principal, rateInPercent, timeInYears);
    }

    @Override
    public double calculateSimpleInterest() {
        cal = new SimpleInterest();
        return cal.calculate(this.val);
    }

    @Override
    public double calculateCompoundInterest() {
        cal = new CompoundInterest();
        return cal.calculate(this.val);
    }
}
