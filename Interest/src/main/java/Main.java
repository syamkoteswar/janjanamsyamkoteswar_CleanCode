import Interest.Interestcalculation;
import Interest.InterestcalculationImp;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner scan=new Scanner(System.in);
        OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        Interestcalculation intrcal=new InterestcalculationImp();
        intrcal.readInput();
        streamWriter.write("\n1)Calculate simple interest.\n2)Calculate compound interest\nEnter your choice: ");
        streamWriter.flush();
        int c=scan.nextInt();
        String s;
        if(c==1) {
            s=String.valueOf(intrcal.calculateSimpleInterest());
            streamWriter.write("simple interest is ");
            streamWriter.write(s);
        }
        else if(c==2) {
            s=String.valueOf(intrcal.calculateCompoundInterest());
            streamWriter.write("compound interest is ");
            streamWriter.write(s);
        }
        else{
            streamWriter.write("Invalid choice");
        }
        streamWriter.flush();
        streamWriter.close();
    }
}
