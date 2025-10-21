package main.beans;

public class Submarine {

    //Attributs
    private int depth;
    private String name;

    public static void main(String[] args) {
          Submarine squall = new Submarine();
          squall.setName("squall");
          squall.dive();
          squall.dive();
          squall.rise();
          squall.rise();
          squall.rise();
        System.out.println(squall.getName() + " : " + squall.getDepth());
    }

    public void dive(){
        depth -= 50;
    }

    public void rise(){
        depth += 50;
        if(depth > 0){
            depth = 0;
        }
    }

    //GET /SET

    public int getDepth() {
        return depth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
