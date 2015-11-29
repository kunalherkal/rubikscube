package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;

public final class Green extends SideAdapter {

	@Inject
	public Green() {
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.GREEN;
		}
	}

	@Override
	public void rotateClockwise() {
		System.out.println("Rotate Green face clockwise");
		super.rotateClockwise();

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = up.getColors()[6];
		tempSideColors[1] = up.getColors()[7];
		tempSideColors[2] = up.getColors()[8];
		
		up.getColors()[6] = left.getColors()[6];
		up.getColors()[7] = left.getColors()[7];
		up.getColors()[8] = left.getColors()[8];
		
		left.getColors()[6] = down.getColors()[6];
		left.getColors()[7] = down.getColors()[7];
		left.getColors()[8] = down.getColors()[8];
		
		down.getColors()[6] = right.getColors()[6];
		down.getColors()[7] = right.getColors()[7];
		down.getColors()[8] = right.getColors()[8];
		
		right.getColors()[6] = tempSideColors[0];
		right.getColors()[7] = tempSideColors[1];
		right.getColors()[8] = tempSideColors[2];
	}

	@Override
	public void rotateAntiClockwise() {
		System.out.println("Rotate Green face Ant-clockwise");
		super.rotateAntiClockwise();

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = up.getColors()[6];
		tempSideColors[1] = up.getColors()[7];
		tempSideColors[2] = up.getColors()[8];
		
		up.getColors()[6] = right.getColors()[6];
		up.getColors()[7] = right.getColors()[7];
		up.getColors()[8] = right.getColors()[8];
		
		right.getColors()[6] = down.getColors()[6];
		right.getColors()[7] = down.getColors()[7];
		right.getColors()[8] = down.getColors()[8];
		
		down.getColors()[6] = left.getColors()[6];
		down.getColors()[7] = left.getColors()[7];
		down.getColors()[8] = left.getColors()[8];
		
		left.getColors()[6] = tempSideColors[0];
		left.getColors()[7] = tempSideColors[1];
		left.getColors()[8] = tempSideColors[2];
	}

}
