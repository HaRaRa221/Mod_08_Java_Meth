import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

   /*
        sayHello();

        sayHello(13);

        sayMsg("Life sucks!", 35);

        int favNum = 7;

        int doubledInt = doubleIt(favNum);

        System.out.println("Doubled is:" + doubledInt);


        int favNum = SafeInput.getRangedInt(in, "Enter your favorite number", 1, 100);
        int myFavDoubled = doubleIt(favNum);
        System.out.println("Doubled is : " + myFavDoubled);

        int year = getInt(console, "Enter an year of birth.");
        System.out.println("You said the year is: " + year);

        int year = SafeInput.getInt(console, "Enter an year of birth.");
        System.out.println("You said the year is: " + year);

        double salary = getDouble(console, "Enter your salary.");
        System.out.println("Your salary is " + salary);

        String fName = getNonZeroLengthString(console, "Enter a non zero lengeth string like your name");
   */

        String ssn = getRegExString(console)

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

    /**
     *
     * @param pipe
     * @param prompt
     * @return
     */

    public static int getInt(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do {

            System.out.println(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the newline form the buffer
                done = false;
                } else {
                    System.out.println("You said your ret val is " + retVal + " but that is out of range [" + low + " - " + high +"]: ");
                }
            }else // don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        }while (!done);


        return retVal;
    }
    public static String getNonZeroLengthString(Scanner pipe, String prompt, String pattern)

    {
        String retVal = "";
        boolean done = false;

        do {
            // favorite number 1-10
            System.out.println(prompt + ": ");
            if (retVal.matches(pattern))
            {
                done = true;
            }
            else // don't have a zero length string
            {
                System.out.println("You must enter at least one character");
            }
        } while (!done);
        return retVal;
    }
}


}

