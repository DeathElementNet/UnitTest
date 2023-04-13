package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MagicBoxTest {


    @org.junit.jupiter.api.Test
    void add() {
        //Проверка добавления элемента:
        MagicBox<String> magicBox = new MagicBox<>(3);
        assertTrue(magicBox.add("новый"));
        assertTrue(magicBox.add("код"));
        assertTrue(magicBox.add("на"));
        assertFalse(magicBox.add("тест"));
    }

    @org.junit.jupiter.api.Test
    void pick() {
        //Проверка того, что метод pick() выбирает случайный элемент из коробки
        MagicBox<String> magicBox = new MagicBox<>(3);
        magicBox.add("новый");
        magicBox.add("юнит");
        magicBox.add("тест");
        String picked = magicBox.pick();
        assertTrue(picked.equals("новый") || picked.equals("юнит") || picked.equals("тест"));
    }



}