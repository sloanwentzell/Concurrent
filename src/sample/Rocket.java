package sample;

public class Rocket implements Runnable {
    String name;
    int startOne = (int)(Math.random() * 99);
    int startTwo = (int)(Math.random() * 99);
    int num = startOne + startTwo;
    int numTwo = num + startTwo;
    int amount = (int)(Math.random() * 16);

    Rocket(String number) {
        System.out.println("The sequence starts with " + startOne + " and " + startTwo + ".");
        System.out.println("It will last for " + (amount * 2 + 4) + " steps.");
        System.out.println();
        name = number;
    }

    private void fibonacci() {
        System.out.println(startOne);
        System.out.println(startTwo);
        System.out.println(num);
        System.out.println(numTwo);
        for (int i = amount; i >= 1; i--) {
            num = numTwo + num;
            System.out.println(num);
            numTwo = numTwo + num;
            System.out.println(numTwo);
        }
    }

    private void complete() {
        System.out.println();
        System.out.println("COMPLETE");
        System.out.println();
    }

    public void run() {
        fibonacci();
        complete();
    }
}
