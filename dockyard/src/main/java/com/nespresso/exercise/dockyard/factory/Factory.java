package com.nespresso.exercise.dockyard.factory;

import com.nespresso.exercise.dockyard.Ship;

public class Factory {

	public Ship getSourceShip(int payload){
		return new Ship(payload, payload);
	}

	public Ship getDestinationShip(int cargoCapacity){
		return new Ship(cargoCapacity, 0);
	}

}
