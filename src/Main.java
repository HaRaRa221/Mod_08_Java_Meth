import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        /*
        sayHello();

        sayHello(13);

        sayMsg("Damn Raymond!", 35);

        int favNum = 7;

        int doubledInt = doubleIt(favNum);

        System.out.println("Doubled is:" + doubledInt);

         */
        int favNum = SafeInput.getRangedInt(in, "Enter your favorite number", 1, 100);

        //System.out.println("You said your fav num is " + getRangedInt(in, "Enter your favorite number", 1, 100));
    }

    // User define static methods go here - after the main
    public static void sayHello()
    {
        System.out.println("Hello!");
    }

    public static void sayHello(int times) {
        for (int i = 0; i <= times; i++)
            System.out.println("Hello!");
    }

    public static void sayMsg(String msg, int times) {
        for (int i = 0; i <= times; i++)
            System.out.println(msg);
    }

    public static int doubleIt(int num) {
        int retVal = 0;

        retVal = num * 2;

        return retVal;

    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {

            System.out.println(prompt + "[" + low + " - " + high +"]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear the newline form the buffer
                if (retVal >= 1 && retVal <= 10) {
                    System.out.println("\nYou said your ret val is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said your ret val is " + retVal + " but that is out of range [" + low + " - " + high +"]: ");
                }
            } else // don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        } while (!done);


        return retVal;
    }



}

