package jtm.activity05;

import jtm.activity04.Road;

public class WaterRoad extends Road {

	public WaterRoad() {
		super();
	}

	public WaterRoad(String from, String to, int distance) {
		super(from, to, distance);
	}

	protected final String getType() {
		// TODO return required value
		Class c = this.getClass();
		return c.getSimpleName();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getType() + " " + getFrom() + " — " + getTo() + ", " + getDistance() + "km";
	}

}
