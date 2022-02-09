package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AfishaTest {
    private Afisha manager = new Afisha(10);
    private Movie first = new Movie(1, "Падение Луны", "боевик");
    private Movie second = new Movie(2, "Непослушник", "комедия");
    private Movie third = new Movie(3, "Мы - монстры", "мультфильм");
    private Movie fourth = new Movie(4, "King's man:Начало", "боевик");
    private Movie fifth = new Movie(5, "Вальдо", "криминал");
    private Movie sixth = new Movie(6, "Зверопой 2", "мультфильм");
    private Movie seventh = new Movie(7, "Гоу,Феликс", "мультфильм");
    private Movie eighth = new Movie(8, "Паранормальные", "драма");
    private Movie ninth = new Movie(9, "Чемпион мира", "драма");
    private Movie tenth = new Movie(10, "Тихая ночь", "комедия");
    private Movie eleventh = new Movie(11, "Параллельные матери", "драма");


    @Test
    public void addFilm() {
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

        int actual = manager.lastFilm().length;
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void addOneFilm(){
        Afisha manager = new Afisha(10);
        manager.addFilm(first);
        int actual = manager.lastFilm().length;
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void lastFilms() {
        Afisha manager = new Afisha(10);
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
        Movie[] actual = manager.lastFilm();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void filmsOverLimit() {
        Afisha manager = new Afisha(10);
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
        manager.addFilm(eleventh);
        Movie[] actual = manager.lastFilm();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void filmsInLimit() {
        Afisha manager = new Afisha(10);
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
        Movie[] actual = manager.lastFilm();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void filmsUnderLimit() {
        Afisha manager = new Afisha(-5);
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
        Movie[] actual = manager.lastFilm();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void filmsLimit0() {
        Afisha manager = new Afisha(0);
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
        Movie[] actual = manager.lastFilm();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void lastFilmsWithLimit30() {
        Afisha manager = new Afisha(30);
        manager.addFilm(fifth);
        Movie[] actual = manager.lastFilm();
        Movie[] expected = new Movie[]{fifth};
        assertArrayEquals(expected, actual);
    }
}