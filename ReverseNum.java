// A 4 digit number is entered through keyboard. Write a program to print a new number with digits reverses as of oroginal one. 
// Input : 1234 Output : 4321
// Input : 8909 Output : 9097

import java.util.Scanner;

class ReverseNum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        
        int x = s.nextInt();
        int a = x % 10; 
        int b = ( x/10 ) % 10; 
        int c = ( x/100 ) % 10; 
        int d = ( x/1000 ) % 10; 
        
        int final_num = (a*1000) + (b*100) + (c*10) + (d*1);
        System.out.println(final_num);
    }
}