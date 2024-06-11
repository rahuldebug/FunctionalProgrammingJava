package Java8to14.deprecationVar;
//the warning will be generated in logs
public class Calculator {
    @Deprecated
    public float calculate(int a, int b, char c) {
        if (c == '+') return a + b;
        if (c == '-') return a - b;
        return 0;
    }

    public float calculate(int a, int b, int c, char d) {
        if (c == '+') return a + b + c;
        if (c == '-') return a - b - c;
        var sum =a+b+c;
        return 0;
    }
}
