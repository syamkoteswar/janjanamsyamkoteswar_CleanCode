package Interest;

import Interest.calculation.CompoundInterest;
import Interest.calculation.SimpleInterest;
import Interest.calculation.calculation;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InterestcalculationImp implements Interestcalculation {
    private InterestComponents val;
    private calculation cal;
    private OutputStreamWriter streamWriter;

    public InterestcalculationImp() {
        streamWriter = new OutputStreamWriter(System.out);
    }

    @Override
    public double calculateSimpleInterest(InterestComponents val) {
        cal = new SimpleInterest();
        return cal.calculate(this.val);
    }

    @Override
    public void displayResult(int c) throws IOException {

        if (c == 1) {
            streamWriter.write("simple interest is ");

            streamWriter.write(String.valueOf(calculateSimpleInterest(this.val)));
        } else if (c == 2) {
            streamWriter.write("compound interest is ");
            streamWriter.write(String.valueOf(calculateCompoundInterest(this.val)));
        } else {
            streamWriter.write("Invalid choice");
        }
        streamWriter.flush();
        streamWriter.close();
    }

    @Override
    public void readInput() throws IOException {
        streamWriter.write("Enter principle value :\t");
        streamWriter.flush();
        Scanner scan = new Scanner(System.in);
        try {
            double principle = scan.nextDouble();
            streamWriter.write("Enter rateInPercent value :\t");
            streamWriter.flush();
            double rateInPercent = scan.nextDouble();
            streamWriter.write("Enter timeInYears value :\t");
            streamWriter.flush();
            double timeInYears = scan.nextDouble();
            this.val = new InterestComponents(principle, rateInPercent, timeInYears);
        } catch (InputMismatchException e) {
            streamWriter.write("Invalid input type");
            streamWriter.flush();
            throw e;
        }
    }

    @Override
    public double calculateCompoundInterest(InterestComponents val) {
        cal = new CompoundInterest();
        return cal.calculate(this.val);
    }
}
