package Opps;

public class overl {
    public static void main(String[] args) {
        calculator s = new calculator();
        System.out.println(s.sum(1, 2));
        System.out.println(s.sum(1, 2, 3));
        System.out.println(s.sum((float) 1.1, (float) 2.2, (float) 5.5));
    }

}

class calculator {
    int sum(int a, int b) {
        return a + b;

    }

    float sum(float a, float b, float c) {
        return a + b + c;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}
