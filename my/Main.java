public class Main {

    public static void main(String[] args) {

        double a, b;

        a = 1;
        b = 11;

        double count;

        if (a > b) System.out.println("a > b. a равно = " + a);
        if (a < b)
            for (count = 1; count <= 6; count = count+1)
                System.out.println("a < b. (a + b) * +1 = " + (a + b) * count);
        System.out.println("DONE");

    }
}
