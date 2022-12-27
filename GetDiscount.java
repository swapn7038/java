// A shop will give discount of 10% if the cost of purchased quantity is more than 1000. Ask user for quantity 

// Suppose, one unit will cost 100. 
// Judge and print total cost for user.

import java.util.Scanner;
class GetDiscount {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter quantity");
        
        int x = s.nextInt();
        if((x*100) > 1000){
            System.out.println("you get a discount of " + (.1 * 100) + "and your total cost is " + (x*100 - (.1*100)));
        } else {
            System.out.println("No discount");
        }
    }
}