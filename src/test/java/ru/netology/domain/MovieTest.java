package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {
    private Movie manager = new Movie();
    private Movie first = new Movie();
    private Movie second = new Movie();
    private Movie third = new Movie();
    private Movie fourth = new Movie();
    private Movie fifth = new Movie();
    private Movie sixth = new Movie();
    private Movie seventh = new Movie();
    private Movie eighth = new Movie();
    private Movie ninth = new Movie();
    private Movie tenth = new Movie();
    private Movie eleventh = new Movie();

    @Test
    void addFilm() {

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);

    }

    @Test
    void addOneFilm() {
        manager.addFilm(first);
        Movie [] actual = manager.addFilm();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }
}