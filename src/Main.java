import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        String formated = simpleDateFormat.format(today);
        System.out.println("Berúgtál tegnap este?");
        System.out.println("Ma van: " + formated);
        // A main nap (date) értéke mondja meg hogy másnaposság van vagy sem...

        hangover(formated);

    }

    public static boolean hangover(String str) {
        if (str.equals("Sunday")) {
            System.out.println("TRUE!");
            return true;
        } else if (str.equals("Saturday")){
            System.out.println("TRUE!");
            return true;
        } else {
            System.out.println("FALSE...");
            return false;
        }


    }
}
