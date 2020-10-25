package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {
    // Проверка хода ладьи
    @Test
    public void wayRookIs6() {
        int way = ChessBoard.wayRook(0, 0, 0, 6);
        assertThat(way, is(6));
    }

    @Test
    public void wayRookIs5() {
        int way = ChessBoard.wayRook(0, 0, 5, 0);
        assertThat(way, is(5));
    }

    @Test
    public void wayRookIs0() {
        int way = ChessBoard.wayRook(0, 0, 5, 6);
        assertThat(way, is(0));
    }

    // Проверка хода слона
    @Test
    public void wayBishopIs5() {
        int way = ChessBoard.wayBishop(0, 0, 5, 5);
        assertThat(way, is(5));
    }

    @Test
    public void wayBishopIs3() {
        int way = ChessBoard.wayBishop(1, 0, 4, 3);
        assertThat(way, is(3));
    }

    @Test
    public void wayBishopIs0() {
        int way = ChessBoard.wayBishop(1, 1, 4, 7);
        assertThat(way, is(0));
    }
}