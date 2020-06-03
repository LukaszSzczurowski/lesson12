public class Country {
    private String code;
    private String name;
    private String numberOfPeople;

    public Country(String code, String name, String numberOfPeople) {
        this.code = code;
        this.name = name;
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return name + " (" + code + ") ma " + numberOfPeople + " ludności.";
    }
}

//Polska (PL) ma 38000000 ludności.