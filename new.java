class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }


    class new{
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int sum1 = math.add(5, 10);
        System.out.println("Sum of integers: " + sum1);

        double sum2 = math.add(3.5, 2.7);
        System.out.println("Sum of doubles: " + sum2);

        int sum3 = math.add(1, 2, 3);
        System.out.println("Sum of three integers: " + sum3);

        String concatenated = math.add("Hello, ", "world!");
        System.out.println("Concatenated strings: " + concatenated);
    }
}

