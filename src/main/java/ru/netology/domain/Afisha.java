package ru.netology.domain;

public class Afisha {
    private Movie[] films = new Movie[0];
    private int limitFilms = 10 ;
    public int getLimit() {
        return limitFilms;
    }

    public Movie[] getFilms() {
        return films;
    }

    public Afisha() {
        this.limitFilms = 10;
    }

    public Afisha(int limit) {
        if (limit <= 0) {
            this.limitFilms = 10;
        } else {
            this.limitFilms = limit;
        }
    }


    public Movie[] lastFilm() {
        int resultLength;
        if (this.limitFilms > films.length) {
            resultLength = films.length;
        } else {
            resultLength = this.limitFilms;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public void addFilm(Movie newMovie) {
        int newLength = films.length + 1;
        Movie[] resultAdd = new Movie[newLength];
        for (int i = 0; i < films.length; i++) {
            resultAdd[i] = films[i];
        }
        resultAdd[newLength  - 1] = newMovie;
         films = resultAdd ;
    }

}

