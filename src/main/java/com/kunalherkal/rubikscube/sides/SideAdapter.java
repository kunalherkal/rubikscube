package com.kunalherkal.rubikscube.sides;

import java.util.Arrays;

import com.kunalherkal.rubikscube.colors.Color;

public abstract class SideAdapter implements Side {
	Side left;
	Side right;
	Side up;
	Side down;
	Side opposite;
	final Color[] colors = new Color[9];

	public void setTileColor(int index, Color color) {
		if (index != 4)
			colors[index] = color;
	}

	public Color[] getColors() {
		return colors;
	}

	public Side getLeft() {
		return left;
	}

	public void setLeft(Side left) {
		this.left = left;
	}

	public Side getRight() {
		return right;
	}

	public void setRight(Side right) {
		this.right = right;
	}

	public Side getUp() {
		return up;
	}

	public void setUp(Side up) {
		this.up = up;
	}

	public Side getDown() {
		return down;
	}

	public void setDown(Side down) {
		this.down = down;
	}

	public Side getOpposite() {
		return opposite;
	}

	public void setOpposite(Side opposite) {
		this.opposite = opposite;
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
