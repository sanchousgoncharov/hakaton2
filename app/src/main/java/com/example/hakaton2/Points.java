package com.example.hakaton2;

public class Points {
    //Класс в котором хранятся и производятся действия с баллами
    public int points = 5;

    public int getPoints() { return points;} //возращает кол-во баллов

    public void eventReg(){ points += 3; } //увеличивает кол-во баллов за участие в мероприятии

    public void rouletteRoll(){ points -= 5; }
}
