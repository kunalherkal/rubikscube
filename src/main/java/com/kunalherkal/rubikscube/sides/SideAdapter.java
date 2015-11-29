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
	
	public void rotateClockwise() {
		System.out.println("Rotating clockwise");
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
		
		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = up.getColors()[6];
		tempSideColors[1] = up.getColors()[7];
		tempSideColors[2] = up.getColors()[8];
		
		up.getColors()[6] = left.getColors()[8];
		up.getColors()[7] = left.getColors()[5];
		up.getColors()[8] = left.getColors()[2];
		
		left.getColors()[2] = down.getColors()[0];
		left.getColors()[5] = down.getColors()[1];
		left.getColors()[8] = down.getColors()[2];
		
		down.getColors()[0] = right.getColors()[6];
		down.getColors()[1] = right.getColors()[3];
		down.getColors()[2] = right.getColors()[0];
		
		right.getColors()[0] = tempSideColors[0];
		right.getColors()[3] = tempSideColors[1];
		right.getColors()[6] = tempSideColors[2];
		

	}
	
	public void rotateAntiClockwise() {
		System.out.println("Rotating Anti-clockwise");
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
		
		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = up.getColors()[6];
		tempSideColors[1] = up.getColors()[7];
		tempSideColors[2] = up.getColors()[8];
		
		up.getColors()[6] = right.getColors()[0];
		up.getColors()[7] = right.getColors()[3];
		up.getColors()[8] = right.getColors()[6];
		
		right.getColors()[0] = down.getColors()[0];
		right.getColors()[3] = down.getColors()[1];
		right.getColors()[6] = down.getColors()[2];
		
		down.getColors()[0] = left.getColors()[2];
		down.getColors()[1] = left.getColors()[5];
		down.getColors()[2] = left.getColors()[8];
		
		left.getColors()[2] = tempSideColors[2];
		left.getColors()[5] = tempSideColors[1];
		left.getColors()[8] = tempSideColors[0];

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
	public String toString() {
		return "SideAdapter [colors=" + Arrays.toString(colors) + "]";
	}

}
