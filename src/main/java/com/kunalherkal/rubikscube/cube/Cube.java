package com.kunalherkal.rubikscube.cube;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.sides.Blue;
import com.kunalherkal.rubikscube.sides.Green;
import com.kunalherkal.rubikscube.sides.Orange;
import com.kunalherkal.rubikscube.sides.Red;
import com.kunalherkal.rubikscube.sides.Side;
import com.kunalherkal.rubikscube.sides.White;
import com.kunalherkal.rubikscube.sides.Yellow;

public final class Cube {
	private Side white;
	private Side yellow;
	private Side blue;
	private Side red;
	private Side green;
	private Side orange;

	@Inject
	public Cube(White white, Yellow yellow, Blue blue, Red red, Green green,
			Orange orange) {
		this.white = white;
		this.yellow = yellow;
		this.blue = blue;
		this.red = red;
		this.green = green;
		this.orange = orange;
	}

	@Override
	public String toString() {
		return "Cube [white=" + white + ", yellow=" + yellow + ", blue=" + blue
				+ ", red=" + red + ", green=" + green + ", orange=" + orange
				+ "]";
	}
}
