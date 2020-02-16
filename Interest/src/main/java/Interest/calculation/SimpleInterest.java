package Interest.calculation;

import Interest.InterestComponents;

public class SimpleInterest implements calculation {
    @Override
    public double calculate(InterestComponents val) {
        try {
            return (val.getPrincipal() * val.getRateInPercent() * val.getTimeInYears()) / 100;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
