package com.company;

public class Warrior extends  Player implements  SuperPower {
    @Override
    public String UltraPower(String SuperPower) {
        return "use Super Power"+ SuperPower ;
    }
}
