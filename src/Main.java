import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static double divisionTwonumbers(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    public static void getCurrentDateTime () {
        Date date = new Date ();
        System.out.println (date.getTime());
    }
    public static void main(String[] args) {

        double sum =  divisionTwonumbers ( 3, 5);
        double sum2 =  divisionTwonumbers (  7, 9);
        double sum3 =  divisionTwonumbers (  8, 10 );
        System.out.println (sum);
        System.out.println (getCurrentDateTime (););
        }
    }
