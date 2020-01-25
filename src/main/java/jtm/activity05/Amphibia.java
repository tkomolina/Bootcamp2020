package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Amphibia extends Vehicle {

  // private byte numberOfSails;
    Ship ship;

    public Amphibia(String id, float consumption, int tankSize, byte sails, int wheels) {
        super(id, consumption, tankSize, wheels);
        ship = new Ship(id, sails);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String move(Road road) {
        String result = "";
        if (road.getClass() == WaterRoad.class) {
           result= ship.move(road);
           result = result.replace("Ship","Amphibia");
        } else if (road.getClass() == Road.class) {
           result= super.move(road);
        }
        return result;
    }
}