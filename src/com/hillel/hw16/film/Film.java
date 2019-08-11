package hw16.film;

import hw16.person.Entity;

import java.util.List;

public class Film extends Entity {
    private String titleOfFilm;
    private int releaseDate;
    private String releaseCountry;
    private List<String> actorList;


    public Film(int id, String titleOfFilm, List<String> actorList, int releaseDate, String releaseCountry) {
        super(id);
        this.titleOfFilm = titleOfFilm;
        this.releaseDate = releaseDate;
        this.releaseCountry = releaseCountry;
        this.actorList = actorList;

    }

    public String getTitleOfFilm() {
        return titleOfFilm;
    }

    public void setTitleOfFilm(String titleOfFilm) {
        this.titleOfFilm = titleOfFilm;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseCountry() {
        return releaseCountry;
    }

    public void setReleaseCountry(String releaseCountry) {
        this.releaseCountry = releaseCountry;
    }

    @Override
    public String toString() {
        return "hw16.runner.film.Film{" +
                "titlesOfFilms='" + titleOfFilm + '\'' +
                ", releaseDate=" + releaseDate +
                ", releaseCountry='" + releaseCountry + '\'' +
                '}';
    }
}

