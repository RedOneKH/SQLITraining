package ma.java.scjp.test;


public  class test {
    
    char k = (char)70000;
    byte b = (byte)128;

    public test(String s) {
        System.out.println(" Top "+b);
    }
    
    public void printNumberType(int i){
        System.out.println("Inside Integer...");
    }
    
    public void printNumberType(short s){
        System.out.println("Inside Short...");
    }
    
    public static void main(String[] args){
        byte b = 1;
        new test("").printNumberType(b);
        
        
        
        System.out.println("A##B#C".split("\0").length);
        
    }
}

class testo extends test{
    public testo(String s){
        super("");
        System.out.println("Down");
    }
    
}
