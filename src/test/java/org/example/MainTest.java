package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void prinField() // Тест на проверку заполненности вводимых ячеек:
     {
        char[][] field = new char[Main.SIZE][Main.SIZE];
        field[0][1] = Main.CROSS;
        field[2][2] = Main.ZERO;

        assertFalse(Main.isWin(field, Main.CROSS));
        assertFalse(Main.isWin(field, Main.ZERO));
    }


    @Test
    void isWin()//Тест на проверку выигрышной комбинации для ноликов:
     {

            char[][] field = new char[Main.SIZE][Main.SIZE];
            field[0][1] = Main.ZERO;
            field[1][1] = Main.ZERO;
            field[2][1] = Main.ZERO;

            assertFalse(Main.isWin(field, Main.CROSS));
            assertTrue(Main.isWin(field, Main.ZERO));
        }


    @Test
    void main() // Тест на проверку выигрышной комбинации для крестиков:
     {
        char[][] field = new char[Main.SIZE][Main.SIZE];
        field[0][0] = Main.CROSS;
        field[1][1] = Main.CROSS;
        field[2][2] = Main.CROSS;

        assertTrue(Main.isWin(field, Main.CROSS));
        assertFalse(Main.isWin(field, Main.ZERO));
    }
    }

