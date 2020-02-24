import Interest.calculation.CompoundInterest;
import Interest.calculation.SimpleInterest;
import Interest.calculation.calculation;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        calculation cal[]={new SimpleInterest(),new CompoundInterest()};
        double timeInYears=0;
        double principle = 0;
        double rateInPercent=0;
        try {
            streamWriter.write("Enter principle value :\t");
            streamWriter.flush();
            try {
                 principle = scan.nextDouble();
                streamWriter.write("Enter rateInPercent value :\t");
                streamWriter.flush();
                rateInPercent = scan.nextDouble();
                streamWriter.write("Enter timeInYears value :\t");
                streamWriter.flush();
                timeInYears = scan.nextDouble();
            } catch (InputMismatchException e) {
                streamWriter.write("Invalid input type");
                streamWriter.flush();
            }
            streamWriter.write("\n1)Calculate simple interest.\n2)Calculate compound interest\nEnter your choice: ");
            streamWriter.flush();
            int c = scan.nextInt();
            if (c == 1 || c==2) {
                if(c==1)
                streamWriter.write("simple interest is ");
                else
                streamWriter.write("compound interest is ");


                streamWriter.write(String.valueOf(cal[c-1].calculate(principle, rateInPercent, timeInYears)));
            } else {
                streamWriter.write("Invalid choice");
            }
            streamWriter.flush();
            streamWriter.close();
        } catch (Exception e) {
            streamWriter.write("\nInvalid Input ");
            streamWriter.flush();
        }
    }
}
