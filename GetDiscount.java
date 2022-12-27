// A school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 45 - E
// c. 45 to 50 - D
// d. 50 to 60 - C
// e. 60 to 80 - B
// f. Above 80 - A
// Ask user to enter marks and print the corresponding grade.

import java.util.Scanner;

class Ans {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int x = s.nextInt();
        if(x < 25){
            System.out.println("F");
        }
        else if ((x>=25) && (x<45)){
            System.out.println("E");
        }
        else if ((x>=45) && (x<50)){
            System.out.println("D");
        }
        else if ((x>=50) && (x<60)){
            System.out.println("C");
        }
        else if ((x>=60) && (x<80)){
            System.out.println("B");
        }