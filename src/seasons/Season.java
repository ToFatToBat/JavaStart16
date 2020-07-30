package seasons;



public enum Season {
    SPRING("wiosna"),
    SUMMER("lato"),
    AUTUMN("jesień"),
    WINTER("zima");

    private String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Season fromDescription(String description) throws IllegalArgumentException {


        Season[] seasons = values();
        for (Season s : seasons) {
            if (s.getDescription().equals(description))
                return s;
        }
        throw new  IllegalArgumentException("Podano niewlasciwa nazwe pory roku.");

    }
}

