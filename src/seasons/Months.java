package seasons;

public enum Months {
    SPRING("Marzec", "Kwiecien", "Maj"),
    SUMMER("Czerwiec", "Lipiec", "Sierpien"),
    AUTUMN("Wrzesien", "Pazdziernik", "Listopad"),
    WINTER("Grudzien", "Styczen", "Luty");


    private String month1;
    private String month2;
    private String month3;

    Months(String month1, String month2, String month3) {
        this.month1 = month1;
        this.month2 = month2;
        this.month3 = month3;
    }

    public static String monthsInSeason(Season season) throws IllegalArgumentException {
        Months[] months = values();
        for (Months m : months) {
            if (m.equals(season))
                return m.month1 + " " + m.month2 + " " + m.month3;

        }
        throw new IllegalArgumentException("Niewlasciwa pora roku");

    }


}
