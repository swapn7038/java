/* Java no-args constructor program */

class Main{
    private int number;
    
    // constructor 
    Main(){
        number = 12;
        System.out.println("Constructor callled");
    }
    
    public static void main(String[] args){
        
        // creating an object 
        Main object_one = new Main();
        
        System.out.println("Main method called");
        System.out.println("Number is : " + object_one.number);
    }
}



