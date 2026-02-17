interface A {
    void displayName();
}

public class lambdaexp {
    public static void main(String[] args) {
        A a = () -> System.out.println("My name is sakshi");
        a.displayName();
    }
}
