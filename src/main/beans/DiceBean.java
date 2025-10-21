package main.beans;

import java.util.Random;

public class DiceBean {

    private int value;

    public void roll(){
        value = new Random().nextInt(5)+1 ;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
