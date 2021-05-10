package java8features;

interface sayable{  
    void say(String msg);  
}  
public class Functionalinterface2 implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        Functionalinterface2 fie = new Functionalinterface2();  
        fie.say("Hello there");  
    }  
}  