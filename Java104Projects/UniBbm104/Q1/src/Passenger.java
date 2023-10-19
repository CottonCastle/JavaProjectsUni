public class Passenger {
    /*
    Has four attributes:
    Name,
    Surname,
    Gender,
    Phone,
     */

    private String name;
    private String surname;
    private String gender;
    private Phone phone;

    Passenger(String name, String surname, String gender, Phone phone) {
        setName(name);
        setSurname(surname);
        setGender(gender);
        setPhone(phone);
    }

    void display() {
        String fullNameGender = this.getName() + " " + this.getSurname() +
                " (" + this.getGender() + ")";
        System.out.println(fullNameGender);
        this.getPhone().display();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
