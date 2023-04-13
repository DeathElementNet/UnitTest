package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class MainTest {

    @Test
    void main() {

        //Проверка что из коробки элемент вернёт не null
        MagicBox<String> magicBoxString = new MagicBox<>(2);
        magicBoxString.add("1. Юрий");
        magicBoxString.add("2. Елена");
        String box = magicBoxString.pick();
        assertNotNull(box);
    }

}

