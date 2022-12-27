/* Java constructor Programs */

class Main{
    // main class
    private String name;
    
    Main(){
        // Constructor 
    System.out.println("constructor called");
    name = "Swapnil";
    }
    
    public static void main(String[] args){
        Main obj1 = new Main();
        
        System.out.println("This is " + obj1.name);
    }
}
