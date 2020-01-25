package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {

	protected byte numberOfSails;

	public Ship(String id, byte numberOfSails) {
		super(id, 0, 0);
		this.numberOfSails = numberOfSails;
		// TODO Auto-generated constructor stub
	}

	public byte getNumberOfSails() {
		return numberOfSails;
	}

	@Override
	public String move(Road road) {
		// TODO Auto-generated method stub

		if (road instanceof WaterRoad) {
			return getId() + " Ship is sailing on " + road.toString() + " with " + getNumberOfSails() + " sails";
		} else
			return "Cannot sail on " + road.toString();
	}

}
