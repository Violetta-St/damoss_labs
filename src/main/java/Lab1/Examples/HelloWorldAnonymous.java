package Lab1.Examples;

public class HelloWorldAnonymous {
    public static void main(String[] args) {
        HelloWorldAnonymous myApp = new HelloWorldAnonymous();
        myApp.sayHello();
    }
    public void sayHello() {
        HelloWorld englishGreeting = new HelloWorld() {
            public void greet() {greetSomeone("world");}
            public void greetSomeone(String someone) {System.out.println("Hello " + someone);}
        };
        HelloWorld frenchGreeting = new HelloWorld() {
            public void greet() {greetSomeone("tout le monde");}
            public void greetSomeone(String someone) {System.out.println("Salut " + someone);}
        };
        HelloWorld spanishGreeting = new HelloWorld() {
            public void greet() {greetSomeone("mundo");}
            public void greetSomeone(String someone) {System.out.println("Hola, " + someone);}
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }
}