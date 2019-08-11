package hw16.person;

public class Director extends Person {


    public Director(int id, String fullName, int dateOfBirth) {
        super(id, fullName, dateOfBirth);

    }


    @Override
    public String toString() {
        return "hw16.runner.person.Director{" + getId() + getFullName() + getDateOfBirth() +
                '}';
    }
}
