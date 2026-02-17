interface B {
    int add(int a, int b);
}

public class lambdaexp2 {
    public static void main(String[] args) {
        B b = (x, y) -> {
            return x + y;
        };
        int sum = b.add(10, 20);
        System.out.println(sum);
    }
}
