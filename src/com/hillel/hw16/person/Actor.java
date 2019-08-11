package hw16.person;

public class Actor extends Person {

    private int starFilms;


    public Actor(String fullName) {
        super(fullName);
    }


    public Actor(int id, String fullName, int dateOfBirth, int starFilms) {
        super(id, fullName, dateOfBirth);
        this.starFilms = starFilms;
    }



    public int getStarFilms() {
        return starFilms;
    }

    public void setStarFilms(int starFilms) {
        this.starFilms = starFilms;
    }

}
