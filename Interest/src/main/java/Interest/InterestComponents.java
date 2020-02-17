package Interest;

public class InterestComponents {
    private double principal;
    private double rateInPercent;
    private double timeInYears;

    public InterestComponents(double principal, double rateInPercent, double timeInYears) {
        this.principal = principal;
        this.rateInPercent = rateInPercent;
        this.timeInYears = timeInYears;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRateInPercent() {
        return rateInPercent;
    }

    public double getTimeInYears() {
        return timeInYears;
    }

}
