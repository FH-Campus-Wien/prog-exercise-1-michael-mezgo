package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        String robot = "0123456789012345678901" + System.lineSeparator();
        robot += "         __" + System.lineSeparator();
        robot += " _(\\    |@@|" + System.lineSeparator();
        robot += "(__/\\__ \\--/ __" + System.lineSeparator();
        robot += "   \\___|----|  |   __" + System.lineSeparator();
        robot += "       \\ }{ /\\ )_ / _\\" + System.lineSeparator();
        robot += "       /\\__/\\ \\__O (__" + System.lineSeparator();
        robot += "      (--/\\--)    \\__/" + System.lineSeparator();
        robot += "      _)(  )(_" + System.lineSeparator();
        robot += "     `---''---`";

        System.out.println(robot);
    }

    //todo Task 3
    public void sumOfLiterals() {
        // https://de.wikibooks.org/wiki/Zertifizierung_für_Java_2_Plattform_1.4:_Literale
        int sum = 0;

        char characterLiteral = 'Z';
        sum += characterLiteral; //Character is an INT

        int hexNumber = 0xface; //Hexadecimal number
        sum += hexNumber;

        int octNumber = 012; //Octal number
        sum += octNumber;

        int longNumber = (int)80L; //Cast from long to int
        sum += longNumber;

        int scientificNotation = (int)44e-1f; //Cast from scientific notation to int
        sum += scientificNotation;

        int floatingNumber = (int)5.5f; //Cast from float to int
        sum += floatingNumber;

        int longScientficNumber = (int)8.88e1; //Cast from long scientific notation to int
        sum += longScientficNumber;

        int doubleNumber = (int)99.9; //Cast from double to int
        sum += doubleNumber;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers() {
        Scanner inputScanner = new Scanner(System.in);

        int numberOne = inputScanner.nextInt();
        int numberTwo = inputScanner.nextInt();

        int sum = numberOne + numberTwo;

        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = inputScanner.nextInt();
        System.out.print("y: ");
        int y = inputScanner.nextInt();

        /**
         * The following 3 lines of Code have been taken from the Internet | https://www.w3resource.com/java-exercises/basic/java-basic-exercise-15.php, last visit: 27.09.2022
         */
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("n1: ");
        int n1 = inputScanner.nextInt();
        System.out.print("n2: ");
        int n2 = inputScanner.nextInt();

        if(n1 == n2)
        {
            System.out.println("n1 == n2");
        }
        else if (n1 > n2)
        {
            System.out.println("n1 > n2");
        }
        else
        {
            System.out.println("n2 > n1");
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int revenue = inputScanner.nextInt();

        if (revenue < 0 || revenue >= 100000)
        {
            System.out.println("Invalid Revenue");
        }
        else if (revenue  < 20000)
        {
            System.out.println("Poor Sales Revenue");
        }
        else if (revenue < 50000)
        {
            System.out.println("Average Sales Revenue");
        }
        else if (revenue < 80000)
        {
            System.out.println("Good Sales Revenue");
        }
        else
        {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate() {
        float commissionClass;
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int input = inputScanner.nextInt();

        switch (input)
        {
            case 1:
                commissionClass = 0.01f;
                break;
            case 2:
                commissionClass = 0.02f;
                break;
            case 3:
                commissionClass = 0.03f;
                break;
            case 4:
                commissionClass = 0.04f;
                break;
            default:
                commissionClass= 0.00f;
                break;
        }

        System.out.println("Your Commission Rate was set to " + commissionClass);
    }

    //todo Task 9
    public void leapyear() {
        System.out.print("Year: ");
        Scanner inputScanner = new Scanner(System.in);

        int year = inputScanner.nextInt();

        if (year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("Leapyear");
                }
                else
                {
                    System.out.println("Not a Leapyear");
                }
            }
            else
            {
                System.out.println("Leapyear");
            }
        }
        else
        {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers() {
        System.out.print("Number: ");

        Scanner inputScanner = new Scanner(System.in);
        String number = inputScanner.next();

        for(int i = number.length() - 1; i >= 0; i--)
        {
            System.out.print(number.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}