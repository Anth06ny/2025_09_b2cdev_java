package main.beans;

public class PlayerBean {

    private String name;
    private CupBean cupBean = new CupBean();
    private int score = 0;

    public PlayerBean(String name) {
        this.name = name;
    }

    public void add1point(){
        score++;
    }

    public void roll(){
        cupBean.roll();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CupBean getCupBean() {
        return cupBean;
    }

    public void setCupBean(CupBean cupBean) {
        this.cupBean = cupBean;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
