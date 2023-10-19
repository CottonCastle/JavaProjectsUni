public class Phone {
    /*
    Has four attributes:
    Country code,
    Code,
    Number,
    Type,
     */

    private String countryCode;
    private String code;
    private int number;
    private String type;

    //The constructor with all attributes
    Phone(String countryCode, String code, int number, String type) {
        setCountryCode(countryCode);
        setCode(code);
        setNumber(number);
        setType(type);
    }

    // The constructor with phone codes missing
    Phone(int number, String type) {
        setCountryCode("TR");
        setCode("+90");
        setNumber(number);
        setType(type);
    }

    void display() {
        System.out.println(String.format("%s Phone: %s %s %d", type, countryCode, code, number));
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
