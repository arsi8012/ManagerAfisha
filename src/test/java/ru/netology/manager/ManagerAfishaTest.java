package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.ListFilm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerAfishaTest {
    private ListFilm first = new ListFilm(1, "Bladshort", "action");
    private ListFilm second = new ListFilm(2, "Forward", "cartoon");
    private ListFilm third = new ListFilm(3, "Hotel Belgrad", "comedy");
    private ListFilm fourth = new ListFilm(4, "Gentlemen", "action");
    private ListFilm fifth = new ListFilm(5, "The Invisible Man", "horrors");
    private ListFilm sixth = new ListFilm(6, "Trolls. World Tour", "cartoon");
    private ListFilm seventh = new ListFilm(7, "Number One", "comedy");
    private ListFilm eighth = new ListFilm(8, "Patriot", "serial");

    @Test
    public void allFilms() {
        ManagerAfisha manager = new ManagerAfisha(); //Показать все фильмы
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        ListFilm[] actual = manager.getAll();
        ListFilm[] expected = new ListFilm[]{eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void firstThreeFilms() {
        ManagerAfisha manager = new ManagerAfisha(3); // Показать первые три фильма
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        ListFilm[] actual = manager.getAll();
        ListFilm[] expected = new ListFilm[]{eighth, seventh, sixth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void negativeQuantityFilms() {         // Запрос отрицательного количества
        ManagerAfisha manager = new ManagerAfisha(-2);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        ListFilm[] actual = manager.getAll();
        ListFilm[] expected = new ListFilm[]{eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsLessThanRequested() {         // Если фильмов меньше в списке
        ManagerAfisha manager = new ManagerAfisha(10);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        ListFilm[] actual = manager.getAll();
        ListFilm[] expected = new ListFilm[]{eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
}

