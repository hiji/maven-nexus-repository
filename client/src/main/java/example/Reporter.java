package example;

public class Reporter {
    
    public String report() {
        Greeter greeter = new Greeter();
        return greeter.sayHello() + "World!";
    }
}
