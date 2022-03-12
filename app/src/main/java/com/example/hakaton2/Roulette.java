package com.example.hakaton2;

public class Roulette {
    public static int random_value;
    public static String[] gifts = new String[100];

    public void rouletteMechanism(){
        for (int x = 0; x < 100; x++) {
            if (x < 30) { gifts[x] = "1 ИКТИБалл"; }
            if (x >= 30 & x < 50) { gifts[x] = "2 ИКТИБалла"; }
            if (x >= 50 & x < 60) { gifts[x] = "5 ИКТИБаллов"; }
            if (x >= 60 & x < 65) { gifts[x] = "Вторая прокрутка"; }
            if (x >= 65 & x < 70) { gifts[x] = "10 ИКТИБаллов"; }
            if (x >= 70 & x < 74) { gifts[x] = "Футболка ИКТИБ"; }
            if (x >= 74 & x < 77) { gifts[x] = "Курс подготовки"; }
            if (x >= 77 & x < 83) { gifts[x] = "Наклейки ИКТИБ"; }
            if (x >= 83 & x < 87) { gifts[x] = "Бутылка ИКТИБ"; }
            if (x >= 87 & x < 92) { gifts[x] = "Блокнот с ручкой ИКТИБ"; }
            if (x >= 92 & x < 93) { gifts[x] = "Повышенная стипендия"; }
            if (x >= 93 & x < 100) { gifts[x] = "Абонемент в столовую"; }

        }
    }
}
