package com.sqli.model;

import com.sqli.utility.Satellite;

public class Canal {
	private String canalName;
	private Satellite canalSattelite;
	
	public Canal(String canalName, Satellite canalSatellite){
		this.canalName = canalName;
		this.canalSattelite = canalSatellite;
	}

	public Satellite getCanalSattelite() {
		return canalSattelite;
	}
	
	

}
