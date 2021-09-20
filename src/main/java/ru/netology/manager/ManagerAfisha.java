package ru.netology.manager;

import ru.netology.domain.ListFilm;

public class ManagerAfisha {
    private ListFilm[] films = new ListFilm[0];
    private int maxFilms = 8;
    private int resultLength;

    public ManagerAfisha(int maxFilms) {
        if (maxFilms > 0) {
            this.maxFilms = maxFilms;
        }
    }

    public ManagerAfisha() {
    }

    public void add(ListFilm film) {
        int length = films.length + 1;
        ListFilm[] tmp = new ListFilm[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public ListFilm[] getAll() {
        if (maxFilms < films.length) {
            resultLength = maxFilms;
        } else {
            resultLength = films.length;
        }
        ListFilm[] result = new ListFilm[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}