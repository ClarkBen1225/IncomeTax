/*
 Benjamin Clark
September 11th 2019
This program will take you salary/income and calculate the amount of income tax owed 
 */

package incometax;
import java.util.Scanner;
/**
 *
 * @author becla2307
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        //All varibles used are declared below
       final double TAXRATE = 0.15;
       final double TAXRATE2 = 0.205;
       final double TAXRATE3 = 0.26;
       final double TAXRATE4 = 0.29;
       final double TAXRATE5 = 0.33;
        double salary;
        double incomeAmount = 0;
       
        
         

        System.out.println("Please enter your annual salary.");
        salary = keyedInput.nextDouble();
        //All statments are to calculate dthe amount owed compared to how much you make
        if (salary<47629){
          incomeAmount = 0;
                }
        if (salary>47629){
            incomeAmount = (TAXRATE * 47629) + (TAXRATE2 * (salary - 47629));
        }
       if (salary>52408 ){
            incomeAmount = (TAXRATE * 47629 ) + (TAXRATE2 * 95259) + (TAXRATE3 *(salary - 147667)) ;
        }
       if (salary>62704){
            incomeAmount = (TAXRATE * 47629 ) + (TAXRATE2 * 95259) + (TAXRATE3 * 147667) + (TAXRATE4 *(salary - 210371)) ;
        }
        if (salary>210371){
            incomeAmount = (TAXRATE * 47629 ) + (TAXRATE2 * 95259) + (TAXRATE3 * 147667) + (TAXRATE4 * 210371) * (TAXRATE5 *(salary - 210371)) ;
        }
        
        System.out.println("The amount of income tax you owe is " + incomeAmount);
    }
    
}
