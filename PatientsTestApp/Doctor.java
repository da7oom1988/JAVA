public class Doctor {

    private String id, name;
    private char gender;

    public Doctor(String id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "ID: " + id + "\nDr. " + name + "\nGender: " + gender;
    }


}

