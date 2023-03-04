/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;
public class Lab006 {
    private int n;
    private int m;

    public Lab006(int n, int m) {
        /*

        The "Lab006" constructor initializes the variables "n" and "m" with the values specified by the parameters.

        @param n is the integer for a dividend.
        @param m is the integer for "n" to be divided by.

         */
        this.n = n;
        this.m = m;

    }

    public boolean isDivisible(){
        /*

        Checks the variables to see if "n" is divisible by "m".

        @return true if n is evenly divisible by m, otherwise false.

         */
        return this.n % this.m ==0;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a dividend: ");
        int n = in.nextInt();
        System.out.println("Enter a divisor: ");
        int m = in.nextInt();

        Lab006 divide = new Lab006(n,m);
        boolean output = divide.isDivisible();

        System.out.println("Is "+n+" divisible by "+m+"?");
        System.out.println("Output: "+output);
        System.out.println();
        System.out.println(n+" divided by "+m+" is "+(n/m));


        int remainder = n % m;

        if (!output){
            System.out.println("Your remainder is: "+remainder);
        }
    }
}
