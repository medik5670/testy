package com.company;

public class BonusMilesService {
    public int price;
    public int ruble = 20;
    public int miles1 = 1;
    public int miles;

    public int calculate(int price) {
        return price * miles1 / ruble;
    }
}
