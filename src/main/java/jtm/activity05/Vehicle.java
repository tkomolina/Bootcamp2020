package jtm.activity05;

import java.util.Locale;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Vehicle extends Transport {

	protected int numberOfWheels;

	public Vehicle(String id, float consumption, int tankSize, int numberOfWheels) {
		super(id, consumption, tankSize);
		this.numberOfWheels = numberOfWheels;
		// TODO Auto-generated constructor stub
	}

	protected final String getTypeOfClass() {
		// TODO return required value
		Class c = this.getClass();
		return c.getSimpleName();
	}

	@Override
	public String move(Road road) {

		if (road.getClass() == Road.class) {
			// TODO Auto-generated method stub
			if (getFuelInTank() >= road.getDistance() * getConsumption() / 100) {
				setFuelInTank(getFuelInTank() - road.getDistance() * getConsumption() / 100);
				return getId() + " " + getTypeOfClass() + " is driving on " + road.toString() + " with "
						+ this.numberOfWheels + " wheels";
			} else
				return "Cannot move on " + road.toString() + ". Necessary fuel:"
						+ String.format(Locale.US, "%.2f", road.getDistance() * getConsumption() / 100)
						+ "l, fuel in tank:" + String.format(Locale.US, "%.2f", getFuelInTank()) + "l";

		} else
			return "Cannot drive on " + road.toString();
	}
}
