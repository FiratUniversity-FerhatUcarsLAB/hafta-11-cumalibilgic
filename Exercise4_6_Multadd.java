public class Multadd {

    // a * b + c işlemı yapan metot
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // expSum ifadesi: x * e^(-x) + sqrt(1 - e^(-x))
    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }

    public static void main(String[] args) {

        // Basit test
        System.out.println("multadd(2, 3, 4) = " + multadd(2, 3, 4));

        // 1) sin(π/4) + cos(π/4)/2
        double expr1 = multadd(Math.sin(Math.PI / 4), 1, Math.cos(Math.PI / 4) / 2);
        System.out.println("sin(π/4) + cos(π/4)/2 = " + expr1);

        // 2) log(10) + log(20)
        double expr2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("log(10) + log(20) = " + expr2);

        // expSum(x) test
        System.out.println("expSum(2) = " + expSum(2));
    }
}
