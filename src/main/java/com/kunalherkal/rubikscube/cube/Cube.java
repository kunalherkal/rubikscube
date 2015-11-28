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
	private final Side white;
	private final Side yellow;
	private final Side blue;
	private final Side red;
	private final Side green;
	private final Side orange;

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

	public Side getWhite() {
		return white;
	}

	public Side getYellow() {
		return yellow;
	}

	public Side getBlue() {
		return blue;
	}

	public Side getRed() {
		return red;
	}

	public Side getGreen() {
		return green;
	}

	public Side getOrange() {
		return orange;
	}

	@Override
	public String toString() {
		return "Cube [white=" + white + ", yellow=" + yellow + ", blue=" + blue
				+ ", red=" + red + ", green=" + green + ", orange=" + orange
				+ "]";
	}
}
