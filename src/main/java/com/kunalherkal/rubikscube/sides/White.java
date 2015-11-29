package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;

public final class White extends SideAdapter {

	@Inject
	public White() {
		
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.WHITE;
		}
	}

	@Override
	public void rotateClockwise() {
		System.out.println("Rotate white face clockwise");
		super.rotateClockwise();
		
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

	@Override
	public void rotateAntiClockwise() {
		System.out.println("Rotate white face Ant-clockwise");
		super.rotateAntiClockwise();
		
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

}
