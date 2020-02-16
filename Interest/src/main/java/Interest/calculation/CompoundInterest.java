package Interest.calculation;

import Interest.InterestComponents;

public class CompoundInterest implements calculation {
    @Override
    public double calculate(InterestComponents val) {
        try {
            return val.getPrincipal() * (Math.pow(1 + val.getRateInPercent() / 100, val.getTimeInYears()) - 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
