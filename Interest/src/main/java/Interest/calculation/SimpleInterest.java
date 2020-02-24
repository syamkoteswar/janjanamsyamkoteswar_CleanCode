package Interest.calculation;

public class SimpleInterest implements calculation {
    @Override
    public double calculate(double principle, double rateInPercent, double timeInYears) {
        try {
            return (principle * rateInPercent * timeInYears) / 100;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
