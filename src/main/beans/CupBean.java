package main.beans;

public class CupBean {

    private DiceBean d1;
    private DiceBean d2 = new DiceBean();

    public CupBean() {
        d1 = new DiceBean();
    }

    public void roll() {
        d1.roll();
        d2.roll();
    }

    public int getScoreDices() {
        return d1.getValue() + d2.getValue();
    }

    public DiceBean getD1() {
        return d1;
    }

    public void setD1(DiceBean d1) {
        this.d1 = d1;
    }

    public DiceBean getD2() {
        return d2;
    }

    public void setD2(DiceBean d2) {
        this.d2 = d2;
    }
}
