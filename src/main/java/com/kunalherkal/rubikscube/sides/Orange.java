package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;

public final class Orange extends SideAdapter {

	@Inject
	public Orange() {
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.ORANGE;
		}
	}

	@Override
	public void rotateClockwise() {
		System.out.println("Rotate Orange face clockwise");
		super.rotateClockwise();

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getYellow().getColors()[0];
		tempSideColors[1] = cube.getYellow().getColors()[1];
		tempSideColors[2] = cube.getYellow().getColors()[2];
		
		cube.getYellow().getColors()[0] = cube.getGreen().getColors()[2];
		cube.getYellow().getColors()[1] = cube.getGreen().getColors()[5];
		cube.getYellow().getColors()[2] = cube.getGreen().getColors()[8];
		
		cube.getGreen().getColors()[2] = cube.getWhite().getColors()[8];
		cube.getGreen().getColors()[5] = cube.getWhite().getColors()[7];
		cube.getGreen().getColors()[8] = cube.getWhite().getColors()[6];
		
		cube.getWhite().getColors()[6] = cube.getBlue().getColors()[0];
		cube.getWhite().getColors()[7] = cube.getBlue().getColors()[3];
		cube.getWhite().getColors()[8] = cube.getBlue().getColors()[6];

		cube.getBlue().getColors()[0] = tempSideColors[2];
		cube.getBlue().getColors()[6] = tempSideColors[1];
		cube.getBlue().getColors()[3] = tempSideColors[0];

	}

	@Override
	public void rotateAntiClockwise() {
		System.out.println("Rotate Orange face Ant-clockwise");
		super.rotateAntiClockwise();

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getBlue().getColors()[6];
		tempSideColors[1] = cube.getBlue().getColors()[3];
		tempSideColors[2] = cube.getBlue().getColors()[0];

		cube.getBlue().getColors()[6] = cube.getWhite().getColors()[6];
		cube.getBlue().getColors()[3] = cube.getWhite().getColors()[3];
		cube.getBlue().getColors()[0] = cube.getWhite().getColors()[0];

		cube.getWhite().getColors()[0] = cube.getGreen().getColors()[0];
		cube.getWhite().getColors()[3] = cube.getGreen().getColors()[3];
		cube.getWhite().getColors()[6] = cube.getGreen().getColors()[6];

		cube.getGreen().getColors()[0] = cube.getYellow().getColors()[8];
		cube.getGreen().getColors()[3] = cube.getYellow().getColors()[5];
		cube.getGreen().getColors()[6] = cube.getYellow().getColors()[2];

		cube.getYellow().getColors()[2] = tempSideColors[0];
		cube.getYellow().getColors()[5] = tempSideColors[1];
		cube.getYellow().getColors()[8] = tempSideColors[2];
	}

}
