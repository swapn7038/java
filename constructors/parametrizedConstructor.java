/* Java parameterized constructor program */

class Main{
    String languages;
    
    // constructor accepting single value 
    Main(String lang){
        languages = lang;
        System.out.println(languages + "Programming language");
    }
    
    public static void main(String[] args) {
        
        
        // call constructor by passing a single value 
        Main obj1 = new Main("Java");
        Main obj2 = new Main("Python");
        Main obj3 = new Main("cpp");
    }
}