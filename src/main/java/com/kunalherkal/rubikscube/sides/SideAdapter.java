package com.kunalherkal.rubikscube.sides;

import java.util.Arrays;

import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;

public abstract class SideAdapter implements Side {
	Cube cube;
	final Color[] colors = new Color[9];

	public void setTileColor(int index, Color color) {
		if (index != 4)
			colors[index] = color;
	}

	public Color[] getColors() {
		return colors;
	}
	
	@Override
	public Cube getCube() {
		return cube;
	}

	@Override
	public void setCube(Cube cube) {
		this.cube = cube;
	}

	@Override
	public void rotateClockwise() {
		Color[] tempColors = new Color[9];
		tempColors[0] = colors[0];
		tempColors[1] = colors[1];
		tempColors[2] = colors[2];
		tempColors[3] = colors[3];
		tempColors[4] = colors[4];
		tempColors[5] = colors[5];
		tempColors[6] = colors[6];
		tempColors[7] = colors[7];
		tempColors[8] = colors[8];

		colors[0] = tempColors[6];
		colors[1] = tempColors[3];
		colors[2] = tempColors[0];
		colors[3] = tempColors[7];
		colors[4] = tempColors[4];
		colors[5] = tempColors[1];
		colors[6] = tempColors[8];
		colors[7] = tempColors[5];
		colors[8] = tempColors[2];
	}

	@Override
	public void rotateAntiClockwise() {
		Color[] tempColors = new Color[9];
		tempColors[0] = colors[0];
		tempColors[1] = colors[1];
		tempColors[2] = colors[2];
		tempColors[3] = colors[3];
		tempColors[4] = colors[4];
		tempColors[5] = colors[5];
		tempColors[6] = colors[6];
		tempColors[7] = colors[7];
		tempColors[8] = colors[8];
		
		colors[0] = tempColors[2];
		colors[1] = tempColors[5];
		colors[2] = tempColors[8];
		colors[3] = tempColors[1];
		colors[4] = tempColors[4];
		colors[5] = tempColors[7];
		colors[6] = tempColors[0];
		colors[7] = tempColors[3];
		colors[8] = tempColors[6];

	}

	@Override
	public String toString() {
		return "SideAdapter [colors=" + Arrays.toString(colors) + "]";
	}

}
