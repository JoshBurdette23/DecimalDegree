import java.util.Scanner;
import java.lang.Math;

public class DecimalDegree {

    public static void main(String[] args) {

        System.out.println("type out if you have degree or decimal");
        String degreeOrDecimal;
        Scanner input = new Scanner(System.in);
        degreeOrDecimal = input.nextLine();


        if(degreeOrDecimal.equals("degree")) {
            //type degree or decimal here
            System.out.println("Type out degree");
            double degree;
            Scanner deg = new Scanner(System.in);
            degree = deg.nextInt();

            System.out.println("Type out minutes");
            double minute;
            Scanner min = new Scanner(System.in);
            minute = min.nextInt();
            System.out.println("The minutes are: " + minute);

            //type seconds here
            System.out.println("Type out seconds");
            double second;
            Scanner sec = new Scanner(System.in);
            second = sec.nextInt();
            System.out.println("The seconds are: " + second);

            //minutes being converted
            double minutesConverted;
            minutesConverted = minute / 60;

            //seconds being converted
            double secondsConverted;
            secondsConverted = second / 3600;

            //final conversion
            double finalConversion;
            finalConversion = degree + minutesConverted + secondsConverted;
            System.out.println("The final conversion is: " + finalConversion);
        }
        else if (degreeOrDecimal.equals("decimal")){
            System.out.println("type out the decimal");
            double decimal;
            Scanner dec = new Scanner(System.in);
            decimal = dec.nextDouble();

            double degrees;
            degrees = Math.floor(decimal);
            System.out.println("Degree: " + degrees);

            double minutes;
            minutes = decimal - degrees;

            double minutesConverted;
            minutesConverted = minutes * 60;
            System.out.println("Minutes: " + Math.floor(minutesConverted));

            double seconds;
            seconds = minutesConverted - Math.floor(minutesConverted);

            double secondsConverted;
            secondsConverted = seconds * 60;
            System.out.println("Seconds: " + Math.round(secondsConverted));
        }
        }
    }


