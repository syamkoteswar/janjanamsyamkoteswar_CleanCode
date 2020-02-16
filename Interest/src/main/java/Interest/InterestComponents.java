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

    /**
     * @return principal
     */
    public double getPrincipal() {
        return principal;
    }

    /**
     * @return rateInPercent
     */
    public double getRateInPercent() {
        return rateInPercent;
    }

    /**
     * @return timeInYears
     */
    public double getTimeInYears() {
        return timeInYears;
    }

}
