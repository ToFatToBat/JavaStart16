package seasons;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

import static seasons.Season.fromDescription;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj nazwe pory roku");
        String choice = getStringFromUser(sc);
        System.out.println("Wybrano pore roku:");


        System.out.println(String.valueOf(fromDescription(choice)));
       System.out.println(Months.monthsInSeason(fromDescription(choice)));

    }

    private static String getStringFromUser(Scanner sc) {
        for (Season s : Season.values()) {
            System.out.println(s.getDescription());
        }
        return sc.nextLine();
    }
}
