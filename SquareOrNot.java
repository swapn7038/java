import java.util.Scanner;

class SquareOrNot {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of x (length) : ");
        int x = s.nextInt();
        
         System.out.println("Enter value of y (breadth) : ");
         int y = s.nextInt();
         
         if(x == y){
             System.out.println("It's a square");
         } else {
              System.out.println("It's a reactngle");
         }
    }
}