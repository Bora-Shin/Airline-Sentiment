import java.io.Serializable;
public class Geonames implements Serializable{

    private String name;
    private String ascii_name;
    private String alternate_names;
    private String country_code;
    private String country_code_2;
    private String timezone;
    private String coordinates;

    // constructor
    public Geonames(){

    }

    // getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAscii_name() {
        return ascii_name;
    }

    public void setAscii_name(String ascii_name) {
        this.ascii_name = ascii_name;
    }

    public String getAlternate_names() {
        return alternate_names;
    }

    public void setAlternate_names(String alternate_names) {
        this.alternate_names = alternate_names;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_code_2() {
        return country_code_2;
    }

    public void setCountry_code_2(String country_code_2) {
        this.country_code_2 = country_code_2;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
}