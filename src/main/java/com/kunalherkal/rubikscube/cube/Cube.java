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
		
		initializeCube();
	}

	private void initializeCube() {
		this.white.setOpposite(this.yellow);
		this.white.setUp(this.blue);
		this.white.setDown(this.green);
		this.white.setLeft(this.orange);
		this.white.setRight(this.red);
		
		this.red.setOpposite(this.orange);
		this.red.setUp(this.blue);
		this.red.setDown(this.green);
		this.red.setLeft(this.white);
		this.red.setRight(this.yellow);
		
		this.blue.setOpposite(this.green);
		this.blue.setUp(this.white);
		this.blue.setDown(this.yellow);
		this.blue.setLeft(this.red);
		this.blue.setRight(this.orange);
		
		this.green.setOpposite(this.blue);
		this.green.setUp(this.white);
		this.green.setDown(this.yellow);
		this.green.setLeft(this.orange);
		this.green.setRight(this.red);
		
		this.orange.setOpposite(this.red);
		this.orange.setUp(this.blue);
		this.orange.setDown(this.green);
		this.orange.setLeft(this.yellow);
		this.orange.setRight(this.white);
		
		this.yellow.setOpposite(this.white);
		this.yellow.setUp(this.blue);
		this.yellow.setDown(this.green);
		this.yellow.setLeft(this.red);
		this.yellow.setRight(this.orange);
		
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
