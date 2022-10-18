import java.util.Scanner;
public class SafeInput
{
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
     * Return a user supplied int within the specified range
     *
     * @param pipe The Scanner instance to use for the console input
     * @param prompt A string that tells the user what to input
     * @param low   The lower bound for the range of the valid values
     * @param high  The upper bound for the ranger of valid values
     * @return  an integer within the range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = -1;
        String trash = "";
        boolean done = false;
        boolean don9e = false;

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

    /**
     * return a user supplied int of arbitrary value
     *
     * @param pipe the Scanner to use for the input
     * @param prompt the String prompt telling the user what to input
     * @return an arbitrary input for any value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean don9e = false;
        boolean done = false;

        do {

            System.out.println(prompt + ": ");
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

        public static int getInt(Scanner pipe, String prompt)
        {
            double retVal = 0;
            trash = "";
            done = false;
            do {
                // favorite number 1-10
                System.out.println(prompt + ": ");
                if (pipe.hasNextDouble()) {
                    retVal = pipe.nextDouble();
                    pipe.nextLine(); // clear the newline form the buffer
                    done = true;
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

    /**
     *
     * @param pipe  Scanner to read the console
     * @param prompt
     * @param low
     * @param high
     * @return
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = low - 1;
        String trash = "";
        boolean done = false;
        boolean don9e = false;

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

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        Boolean done = false;
        do {
            // favorite number 1-10
            System.out.println(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the newline form the buffer
                done = true;
            }
            else // don't have an int
            {
            trash = pipe.nextLine();
            System.out.println("You must enter an integer not " + trash);
             }
    }while(!done);

    public static String getNonZeroLength(Scanner pipe, String prompt)
    {
        String retVal = "";
        trash = "";
        done = false;
        do {
            // favorite number 1-10
            System.out.println(prompt + ": ");
            if (retVal.length() !=0){
                done = true;
            }
            else // don't have an string
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        }while(!done);




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
                    trash = pipe.nextLine();
                    System.out.println("You must enter at least one character");
                }
            } while (!done);

        }