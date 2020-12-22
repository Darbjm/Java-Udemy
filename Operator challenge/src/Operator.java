public class Operator {

    public static void main(String[] args) {

        double first = 20.00d;

        double second = 80.00d;

        double third = 100.00d * (first + second);

        double remainder = third % 40.00;

        boolean four = remainder == 0 ? true : false;

        System.out.println(four);

        if (!four) {
            System.out.println("Got some remainder");
        }
    }
}
