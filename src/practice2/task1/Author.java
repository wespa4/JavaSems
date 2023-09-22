package practice2.task1;
public class Author {
    private final String name; // по рекоммендации ide стоит модификатор final = пер-ная константа
    private String email;
    private final char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    public String getName() { return name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public char getGender() { return gender; }

    @Override
    public String toString() {
        return this.name +" e-mail is " + this.email+" gender: "+" " + this.gender;
    }
}
