package Interest;

import Interest.calculation.CompoundInterest;
import Interest.calculation.SimpleInterest;
import Interest.calculation.calculation;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class InterestcalculationImp implements Interestcalculation {
    private InterestComponents val;
    private calculation cal;

    @Override
    public double calculateSimpleInterest() {
        cal = new SimpleInterest();
        return cal.calculate(this.val);
    }

    @Override
    public void readInput() throws IOException {
        OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        streamWriter.write("Enter principle value");
        streamWriter.flush();
        Scanner scan=new Scanner(System.in);
        double principle=scan.nextDouble();
        streamWriter.write("Enter rateInPercent value");
        streamWriter.flush();
        double rateInPercent=scan.nextDouble();
        streamWriter.write("Enter timeInYears value");
        streamWriter.flush();
        double timeInYears=scan.nextDouble();
        this.val = new InterestComponents(principle, rateInPercent, timeInYears);
    }

    @Override
    public double calculateCompoundInterest() {
        cal = new CompoundInterest();
        return cal.calculate(this.val);
    }
}
