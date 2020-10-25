package ru.job4j.condition;

public class ChessBoard {
    // Ладья
    public static int wayRook(int x1, int y1, int x2, int y2) {
        int rslRook = 0;
        if (x1 == x2 || y1 == y2) {
            rslRook = Math.abs(x2 - x1);
            rslRook = rslRook == 0 ? Math.abs(y2 - y1) : rslRook;
        }
        return rslRook;
    }

    // Слон
    public static int wayBishop(int x1, int y1, int x2, int y2) {
        int rslBishop = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rslBishop = Math.abs(x2 - x1);
        }
        return rslBishop;
    }
}
