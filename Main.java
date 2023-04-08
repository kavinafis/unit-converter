import jdk.jfr.Unsigned;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        System.out.println("Enter the user name: ");
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        System.out.println("Enter the password: ");
        String pass = sc.next();
        conversion b = new conversion();
        b.setUsername("kavi");
        b.setPass("1234");
        String x = b.getUsername();
        String y = b.getPass();
        int a = x.compareTo(user);
        int c = y.compareTo(pass);
        if (a == 0 && c == 0) {
            b.logindisplay();

            conversion unit = new conversion();
            System.out.println("Select Which unit You Want To convert");
            System.out.println("1. mile" + "\n" + "2. meter" + "\n" + "3. inch" + "\n" + "4. ft" +
                    "\n" + "5. yard" + "\n");
            Scanner input = new Scanner(System.in);
            int k = input.nextInt();
            switch (k) {
                case 1:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("mile: ");
                    double mile = (int) input.nextDouble();
                    System.out.println("Choose Your Desired unit");
                    System.out.println("1. meter" + "\n" + "2. inch" + "\n" + "3. ft" +
                            "\n" + "4. yard" + "\n");
                    int m = input.nextInt();
                    switch (m) {
                        case 1:
                            conversion.meter(mile);
                            break;
                        case 2:
                            conversion.inch(mile);
                            break;
                        case 3:
                            conversion.ft(mile);
                            break;
                        case 4:
                            conversion.yard(mile);
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("meter: ");
                    double meter = (int) input.nextDouble();
                    System.out.println("Choose Your Desired unit");
                    System.out.println("1. mile" + "\n" + "2. inch" + "\n" + "3. ft" +
                            "\n" + "4. yard" + "\n");
                    int d = input.nextInt();
                    switch (d) {
                        case 1:
                            conversion.mile(meter);
                            break;
                        case 2:
                            conversion.inch1(meter);
                            break;
                        case 3:
                            conversion.ft1(meter);
                            break;
                        case 4:
                            conversion.yard1(meter);
                            break;

                    }
                    break;
                case 3:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("inch: ");
                    double inch = (int) input.nextDouble();
                    System.out.println("Choose Your Desired unit");
                    System.out.println("1. mile" + "\n" + "2. meter" + "\n" + "3. ft" +
                            "\n" + "4. yard");
                    int e = input.nextInt();
                    switch (e) {
                        case 1:
                            conversion.mile1(inch);
                            break;
                        case 2:
                            conversion.meter2(inch);
                            break;
                        case 3:
                            conversion.ft2(inch);
                            break;
                        case 4:
                            conversion.yard2(inch);
                            break;

                    }
                    break;
                case 4:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("ft: ");
                    double ft = (int) input.nextDouble();
                    System.out.println("Choose Your Desired unit");
                    System.out.println("1. mile" + "\n" + "2. meter" + "\n" + "3. inch" +
                            "\n" + "4. yard");
                    int f = input.nextInt();
                    switch (f) {
                        case 1:
                            conversion.mile2(ft);
                            break;
                        case 2:
                            conversion.meter3(ft);
                            break;
                        case 3:
                            conversion.inch3(ft);
                            break;
                        case 4:
                            conversion.yard3(ft);
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Enter Your Amount: ");
                    System.out.print("yard: ");
                    double yard = (int) input.nextDouble();
                    System.out.println("Choose Your Desired unit");
                    System.out.println("1. mile" + "\n" + "2. meter" + "\n" + "3. inch" +
                            "\n" + "4. ft");
                    int g = input.nextInt();
                    switch (g) {
                        case 1:
                            conversion.mile3(yard);
                            break;
                        case 2:
                            conversion.meter4(yard);
                            break;
                        case 3:
                            conversion.inch4(yard);
                            break;
                        case 4:
                            conversion.ft4(yard);
                            break;
                    }
                    break;


            }

        }
        else
        {
            Login l2 = new Login();
            l2.logindisplay();
        }
    }
}