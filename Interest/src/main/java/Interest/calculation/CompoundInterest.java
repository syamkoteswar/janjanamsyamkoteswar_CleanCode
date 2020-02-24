package Interest.calculation;

public class CompoundInterest implements calculation {
    @Override
    public double calculate(double principle, double rateInPercent, double timeInYears) {
        try {
            return principle * (Math.pow(1 + rateInPercent / 100, timeInYears) - 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
