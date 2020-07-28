package seasons;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj nazwe pory roku");
        for (Season s : Season.values()) {
            System.out.println(s.getDescription());
        }
        String choice = sc.nextLine();
        System.out.println("Wybrano pore roku:");
        System.out.println(Season.fromDescription(choice));

    }
}
