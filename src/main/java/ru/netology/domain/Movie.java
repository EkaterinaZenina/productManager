package ru.netology.domain;

public class Movie {
    private Movie[] films = new Movie[0];
    private int limitFilms = 10;
    private Movie newMovie;

    public static void movie(String[] args) {
        Movie first = new Movie();
        Movie second = new Movie();
        Movie third = new Movie();
        Movie fourth = new Movie();
        Movie fifth = new Movie();
        Movie sixth = new Movie();
        Movie seventh = new Movie();
        Movie eighth = new Movie();
        Movie ninth = new Movie();
        Movie tenth = new Movie();
        Movie eleventh = new Movie();
    }


    public Movie[] lastFilm() {
        int resultLength;
        if (limitFilms > films.length) {
            resultLength = films.length;
        } else {
            resultLength = limitFilms;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public Movie[] addFilm(Movie newMovie) {
        int length = films.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[films.length - 1] = newMovie;
        tmp = films;
        return tmp;
    }

    public Movie[] addFilm() {
        int length = films.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[films.length - 1] = newMovie;
        tmp = films;
        return tmp;
    }
}
