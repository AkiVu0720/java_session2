package rikkei.academy;

import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.printf(" %d is: ", number);
        int units = number % 10;
        int dozens = (number / 10) % 10;
        int hundreds = number / 100;
        String unitsOut = "", dozensOut = "", hundredsOut = "", output = "";

        switch (units) {
            case 0:
                unitsOut = "Zero";
                break;
            case 1:
                unitsOut = "One";
                break;
            case 2:
                unitsOut = "Two";
                break;
            case 3:
                unitsOut = "Three";
                break;
            case 4:
                unitsOut = "Four";
                break;
            case 5:
                unitsOut = "Five";
                break;
            case 6:
                unitsOut = "Six";
                break;
            case 7:
                unitsOut = "Seven";
                break;
            case 8:
                unitsOut = "Eight";
                break;
            default:
                unitsOut = "Nine";
        }

        switch (dozens) {
            case 1:
                switch (units) {
                    case 0:
                        dozensOut = "Ten";
                        break;
                    case 1:
                        dozensOut = "Eleven";
                        break;
                    case 2:
                        dozensOut = "Twelve";
                        break;
                    case 5:
                        dozensOut = "Fifteen";
                        break;
                    default:
                        dozensOut = unitsOut + "teen";

                }
                break;
            case 2:
                dozensOut = "Twenty";
                break;
            case 3:
                dozensOut = "Thirty";
                break;
            case 4:
                dozensOut = "Forty";
                break;
            case 5:
                dozensOut = "Fifty";
                break;
            case 6:
                dozensOut = "Sixty";
                break;
            case 7:
                dozensOut = "Seventy";
                break;
            case 8:
                dozensOut = "Eighty";
                break;
            case 9:
                dozensOut = "Ninety";
                break;

        }

        if (number < 10) {
                output = unitsOut;
        } else if (number < 20) {
            output = dozensOut;
        } else if (number < 100) {
            if (units == 0) {
                output = dozensOut;
            } else {
                output = dozensOut + " " + unitsOut;
            }
        }else if (number < 1000) {
            switch (hundreds) {
                case 1:
                    hundredsOut = "One";
                    break;
                case 2:
                    hundredsOut = "Two";
                    break;
                case 3:
                    hundredsOut = "Three";
                    break;
                case 4:
                    hundredsOut = "Four";
                    break;
                case 5:
                    hundredsOut = "Five";
                    break;
                case 6:
                    hundredsOut = "Six";
                    break;
                case 7:
                    hundredsOut = "Seven";
                    break;
                case 8:
                    hundredsOut = "Eight";
                    break;
                case 9:
                    hundredsOut = "Nine";
                    break;
            }

            hundredsOut += " hundred";
            if (dozens == 0) {
                if (units == 0) {
                    output = hundredsOut;
                } else {
                    output = hundredsOut + " " + unitsOut;
                }
            } else if (dozens == 1) {
                output = hundredsOut + " " + dozensOut;
            } else {
                if (units==0){
                    output = hundredsOut + " " + dozensOut;
                }else {
                    output = hundredsOut + " and " + dozensOut + "  " + unitsOut;
                }
            }
        }
        System.out.println(output);
    }
}