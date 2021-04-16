package com.lec206.ex07_final;

public class Earth {

	static final double EARTH_AREA = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI*EARTH_AREA * EARTH_AREA;
	}
}
