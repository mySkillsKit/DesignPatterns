package DesignPatternsFacade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String a = "1100100";
        String b = "0110";
        System.out.println("a = " + a + " (Двоичная запись) / "
                + Integer.parseInt(a,2) + " (Десятичная запись)");
        System.out.println("b = " + b + " (Двоичная запись) / "
                + Integer.parseInt(b,2) + " (Десятичная запись)");

        String sum = bins.sum(a,b);
        String mult = bins.mult(a,b);

        System.out.println("a+b = " + sum + " (Двоичная запись) / "
                + Integer.parseInt(sum,2) + " (Десятичная запись)");
        System.out.println("a*b = " + mult + " (Двоичная запись) / "
                + Integer.parseInt(mult,2) + " (Десятичная запись)");

    }
}
