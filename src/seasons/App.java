package seasons;

import javax.sound.midi.Soundbank;
import java.util.*;

import static seasons.Season.fromDescription;

public class App {
    public static void main(String[] args) {

        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("SPRING", "Marzec, Kwiecien, Maj");
        monthMap.put("SUMMER", "Czerwiec, Lipiec, Sierpien");
        monthMap.put("AUTUMN", "Wrzesien, Pazdziernik, Listopad");
        monthMap.put("WINTER", "Grudzien, Styczen, Luty");


        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj nazwe pory roku");
        String choice = getStringFromUser(sc);
        System.out.println("Wybrano pore roku:");

        String seasonChoice = String.valueOf(fromDescription(choice));
        System.out.println(seasonChoice);
        System.out.println(monthMap.get(seasonChoice));

    }

    private static String getStringFromUser(Scanner sc) {
        for (Season s : Season.values()) {
            System.out.println(s.getDescription());
        }
        return sc.nextLine();
    }
}
