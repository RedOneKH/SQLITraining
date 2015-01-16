package com.nespresso.sofa.interview.parking;

public class PedestrianExit extends Surface {

	
	private static final char PEDESTRIAN_EXIT_DISPLAY = '=';
	
	public PedestrianExit() {
		super(PEDESTRIAN_EXIT_DISPLAY);
	}

	@Override
	public boolean canAccept(Surface surface) {
		return surface instanceof PedestrianExit;
	}

}
