package Statements;
import java.util.Scanner;
public class HoroscopeFinder {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Month you were born: ");
        month = input.nextInt();
        System.out.println("Please enter the Day you were born: ");
        day = input.nextInt();

        if (month>=1 && month<=12){
            isError = false;
        }
        else
            isError = true;


        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day >= 21) {
                    horoscope = "Aries";
                } else {
                    horoscope = "Pisces";
                }

            } else isError = true;
        }

        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day >= 21) {
                    horoscope = "Taurus";
                } else {
                    horoscope = "Aries";
                }
            } else isError = true;
        }

        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day >= 22) {
                    horoscope = "Gemini";
                } else {
                    horoscope = "Taurus";
                }

            } else isError = true;
        }

        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day >= 23) {
                    horoscope = "Cancer";
                } else {
                    horoscope = "Gemini";
                }

            } else isError = true;
        }

        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day >= 23) {
                    horoscope = "Leo";
                } else {
                    horoscope = "Cancer";
                }

            } else isError = true;
        }

        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day >= 23) {
                    horoscope = "Virgo";
                } else {
                    horoscope = "Leo";
                }

            } else isError = true;
        }

        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day >= 23) {
                    horoscope = "Libra";
                } else {
                    horoscope = "Virgo";
                }

            } else isError = true;
        }

        if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day >= 23) {
                    horoscope = "Scorpio";
                } else {
                    horoscope = "Libra";
                }

            } else isError = true;
        }

        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day >= 22) {
                    horoscope = "Sagittarius";
                } else {
                    horoscope = "Scorpio";
                }

            } else isError = true;
        }

        if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day >= 22) {
                    horoscope = "Capricorn";
                } else {
                    horoscope = "Sagittarius";
                }

            } else isError = true;
        }

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day >= 22) {
                    horoscope = "Aquarius";
                } else {
                    horoscope = "Capricorn";
                }

            } else isError = true;
        }

        if (month == 2) {
            if (day >= 1 && day <= 29) {
                if (day >= 20) {
                    horoscope = "Pisces";
                } else {
                    horoscope = "Aquarius";
                }

            } else isError = true;
        }

        if (isError){
            System.out.println("You entered an incorrect day or month. please try again...");
        }
        else {
            System.out.println("Your Horoscope: " +horoscope);
        }

    }
}