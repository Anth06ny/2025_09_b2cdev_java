package main.beans;

public class AirportBean {

    private PlaneBean place1, place2;

    public static void main(String[] args) {
        AirportBean airportBean = new AirportBean();
        PlaneBean a1 = new PlaneBean();
        a1.setName("A1");
        PlaneBean a2 = new PlaneBean();
        a2.setName("A2");

        int nextPlace = airportBean.nextFreePlace();
        System.out.println(airportBean.park(a2, nextPlace));
        System.out.println(airportBean.park(a2, nextPlace));

        nextPlace = airportBean.nextFreePlace();
        System.out.println(airportBean.park(a1, nextPlace));

        airportBean.state();

        System.out.println(nextPlace = airportBean.nextFreePlace());

    }

    public void state() {
        System.out.print("Place1=");
        if (place1 == null) {
            System.out.println("null");
        } else {
            System.out.println(place1.getName());
        }
        System.out.print("Place2=");
        if (place2 == null) {
            System.out.println("null");
        } else {
            System.out.println(place2.getName());
        }
    }

    public String park(PlaneBean plane, int position) {
        if (position == 1) {
            if (place1 == null) {
                place1 = plane;
                return "ok";
            } else {
                return "La place 1 est occupée";
            }
        } else if (position == 2) {
            if (place2 == null) {
                place2 = plane;
                return "ok";
            } else {
                return "La place 2 est occupée";
            }
        } else {
            return "Position incorrecte";
        }
    }

    public int nextFreePlace() {
        if (place1 == null) {
            return 1;
        } else if (place2 == null) {
            return 2;
        }
        return -1;
    }
}
