package weekTwo;

import java.util.Scanner;

//Scanner
public class ActivityOne {
    public static void main(String[] args) {
        //P-principal
        //r - annual intrest rate
        //n number of times per year intrest is compounded
        //t - number of years
        //A - amount of of money in account after intrest is added
        double P,r,A;
        int n,t;

        //prompt user
        System.out.println("Please enter principal amount: ");

        //scanner object
        //create instance of scanner class
        Scanner scn = new Scanner(System.in);
        //scn.nexLine() or Double.parseDouble(scn.nextLine())
        //scn.nextInt() or Integer.parseInt(scn.nextLine())
        P = Double.parseDouble(scn.nextLine());
        System.out.println("Enter the annual Intrest rate: ");
        r = Double.parseDouble(scn.nextLine())/100;
        System.out.println("Enter the number of times compounded: ");
        n = Integer.parseInt(scn.nextLine());
        System.out.println("Enter the number of years: ");
        t = Integer.parseInt(scn.nextLine());

        // A = P(1 +r/n)^nt
        A = P * Math.pow((1+ r/n),n*t);
        //%s- string
        //%f- float
        //%d- integer
        //%c- charcter
        System.out.printf("After %d years you will have $ %.2f",t,A);;



    }
}
