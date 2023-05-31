import jdk.jfr.Unsigned;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Select Measurement");
        System.out.println("1. Length" + "\n" + "2. Mass" + "\n" + "3. Area" + "\n" + "4. Volume" + "\n");
        int k = input.nextInt();
        switch (k) {
            case 1:
                conversionLength unitLength = new conversionLength();
                System.out.println("Select Which unit You Want To convert");
                System.out.println("1. mile" + "\n" + "2. meter" + "\n" + "3. inch" + "\n" + "4. feet" + "\n" + "5. yard" + "\n");

                int k1 = input.nextInt();
                switch (k1) {
                    case 1:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("mile: ");
                        double mile = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. meter" + "\n" + "2. inch" + "\n" + "3. feet" +
                                "\n" + "4. yard" + "\n");
                        int l1 = input.nextInt();
                        switch (l1) {
                            case 1:
                                conversionLength.meter(mile);
                                break;
                            case 2:
                                conversionLength.inch(mile);
                                break;
                            case 3:
                                conversionLength.ft(mile);
                                break;
                            case 4:
                                conversionLength.yard(mile);
                                break;

                        }
                        break;
                    case 2:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("meter: ");
                        double meter = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. mile" + "\n" + "2. inch" + "\n" + "3. feet" +
                                "\n" + "4. yard" + "\n");
                        int l2 = input.nextInt();
                        switch (l2) {
                            case 1:
                                conversionLength.mile(meter);
                                break;
                            case 2:
                                conversionLength.inch1(meter);
                                break;
                            case 3:
                                conversionLength.ft1(meter);
                                break;
                            case 4:
                                conversionLength.yard1(meter);
                                break;

                        }
                        break;
                    case 3:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("inch: ");
                        double inch = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. mile" + "\n" + "2. meter" + "\n" + "3. feet" +
                                "\n" + "4. yard");
                        int l3 = input.nextInt();
                        switch (l3) {
                            case 1:
                                conversionLength.mile1(inch);
                                break;
                            case 2:
                                conversionLength.meter2(inch);
                                break;
                            case 3:
                                conversionLength.ft2(inch);
                                break;
                            case 4:
                                conversionLength.yard2(inch);
                                break;

                        }
                        break;
                    case 4:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("feet: ");
                        double ft = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. mile" + "\n" + "2. meter" + "\n" + "3. inch" +
                                "\n" + "4. yard");
                        int l4 = input.nextInt();
                        switch (l4) {
                            case 1:
                                conversionLength.mile2(ft);
                                break;
                            case 2:
                                conversionLength.meter3(ft);
                                break;
                            case 3:
                                conversionLength.inch3(ft);
                                break;
                            case 4:
                                conversionLength.yard3(ft);
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("yard: ");
                        double yard = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. mile" + "\n" + "2. meter" + "\n" + "3. inch" +
                                "\n" + "4. feet");
                        int l5 = input.nextInt();
                        switch (l5) {
                            case 1:
                                conversionLength.mile3(yard);
                                break;
                            case 2:
                                conversionLength.meter4(yard);
                                break;
                            case 3:
                                conversionLength.inch4(yard);
                                break;
                            case 4:
                                conversionLength.ft4(yard);
                                break;
                        }
                        break;


                }
                break;
            case 2:
                conversionMass unitMass = new conversionMass();
                System.out.println("Select Which unit You Want To convert");
                System.out.println("1. kilogram" + "\n" + "2. ounce" + "\n" + "3. pound" + "\n" + "4. tonne" + "\n");

                int k2 = input.nextInt();
                switch (k2) {
                    case 1:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("kilogram: ");
                        double kilogram = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. ounce" + "\n" + "2. pound" + "\n" + "3. tonne" +
                                "\n");
                        int m1 = input.nextInt();
                        switch (m1) {
                            case 1:
                                conversionMass.ounce(kilogram);
                                break;
                            case 2:
                                conversionMass.pound(kilogram);
                                break;
                            case 3:
                                conversionMass.tonne(kilogram);
                                break;

                        }
                        break;
                    case 2:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("ounce: ");
                        double ounce = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. kilogram" + "\n" + "2. pound" + "\n" + "3. tonne" +
                                "\n");
                        int m2 = input.nextInt();
                        switch (m2) {
                            case 1:
                                conversionMass.kilogram(ounce);
                                break;
                            case 2:
                                conversionMass.pound1(ounce);
                                break;
                            case 3:
                                conversionMass.tonne1(ounce);
                                break;

                        }
                        break;
                    case 3:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("pound: ");
                        double pound = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. kilogram" + "\n" + "2. ounce" + "\n" + "3. tonne" +
                                "\n");
                        int m3 = input.nextInt();
                        switch (m3) {
                            case 1:
                                conversionMass.kilogram1(pound);
                                break;
                            case 2:
                                conversionMass.ounce2(pound);
                                break;
                            case 3:
                                conversionMass.tonne2(pound);
                                break;

                        }
                        break;
                    case 4:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("tonne: ");
                        double tonne = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. kilogram" + "\n" + "2. ounce" + "\n" + "3. pound" +
                                "\n");
                        int m4 = input.nextInt();
                        switch (m4) {
                            case 1:
                                conversionMass.kilogram2(tonne);
                                break;
                            case 2:
                                conversionMass.ounce3(tonne);
                                break;
                            case 3:
                                conversionMass.pound3(tonne);
                                break;
                        }
                        break;
                }
                break;

            case 3:
                conversionArea unitArea = new conversionArea();
                System.out.println("Select Which unit You Want To convert");
                System.out.println("1. sq km" + "\n" + "2. hectare" + "\n" + "3. acre" + "\n" + "4. sq feet" + "\n");

                int k3 = input.nextInt();
                switch (k3) {
                    case 1:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("sq meter: ");
                        double sqm = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. hectare" + "\n" + "2. acre" + "\n" + "3. sq feet" +
                                "\n");
                        int a1 = input.nextInt();
                        switch (a1) {
                            case 1:
                                conversionArea.hectare(sqm);
                                break;
                            case 2:
                                conversionArea.acre(sqm);
                                break;
                            case 3:
                                conversionArea.sqf(sqm);
                                break;

                        }
                        break;
                    case 2:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("hectare: ");
                        double hectare = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. sq meter" + "\n" + "2. acre" + "\n" + "3. sq feet" +
                                "\n");
                        int a2 = input.nextInt();
                        switch (a2) {
                            case 1:
                                conversionArea.sqm(hectare);
                                break;
                            case 2:
                                conversionArea.acre1(hectare);
                                break;
                            case 3:
                                conversionArea.sqf1(hectare);
                                break;

                        }
                        break;
                    case 3:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("acre: ");
                        double acre = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. sq meter" + "\n" + "2. hectare" + "\n" + "3. sq feet" +
                                "\n");
                        int a3 = input.nextInt();
                        switch (a3) {
                            case 1:
                                conversionArea.sqm1(acre);
                                break;
                            case 2:
                                conversionArea.hectare2(acre);
                                break;
                            case 3:
                                conversionArea.sqf2(acre);
                                break;

                        }
                        break;
                    case 4:
                        System.out.println("Enter Your Amount: ");
                        System.out.print("sq feet: ");
                        double sqf = (int) input.nextDouble();
                        System.out.println("Choose Your Desired unit");
                        System.out.println("1. sq meter" + "\n" + "2. hectare" + "\n" + "3. acre" +
                                "\n");
                        int a4 = input.nextInt();
                        switch (a4) {
                            case 1:
                                conversionArea.sqm2(sqf);
                                break;
                            case 2:
                                conversionArea.hectare3(sqf);
                                break;
                            case 3:
                                conversionArea.acre3(sqf);
                                break;
                        }
                        break;
                }break;
            case 4:


        }
    }
}
