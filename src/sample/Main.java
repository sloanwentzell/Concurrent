package sample;

public class Main {

    public static void main(String[] args) {

        int repeat = (int)(Math.random() * 10);
        int repeatCalculator = repeat;
        System.out.println();
        System.out.println("There will be " + repeat + " Sequences.");
        System.out.println();

        for (int i = 1; i <= repeat; i++) {
            System.out.println("This is Fibonacci Sequence number " + repeatCalculator + ".");
            repeatCalculator = repeatCalculator - 1;
            sample.Rocket rocket = new sample.Rocket(String.valueOf(i));
            rocket.run();
        }

        if (repeat > 1) {
            System.out.println("ALL SEQUENCES COMPLETE");
        } else {
            System.out.println("SEQUENCE COMPLETE");
        }
    }
}