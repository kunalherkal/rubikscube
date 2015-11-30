package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;

public final class Red extends SideAdapter {

	@Inject
	public Red() {
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.RED;
		}
	}

	@Override
	public void rotateClockwise(Cube cube) {
		System.out.println("Rotate Red face clockwise");
		super.rotateClockwise(cube);

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getBlue().getColors()[2];
		tempSideColors[1] = cube.getBlue().getColors()[5];
		tempSideColors[2] = cube.getBlue().getColors()[8];

		cube.getBlue().getColors()[2] = cube.getWhite().getColors()[2];
		cube.getBlue().getColors()[5] = cube.getWhite().getColors()[5];
		cube.getBlue().getColors()[8] = cube.getWhite().getColors()[8];

		cube.getWhite().getColors()[2] = cube.getGreen().getColors()[2];
		cube.getWhite().getColors()[5] = cube.getGreen().getColors()[5];
		cube.getWhite().getColors()[8] = cube.getGreen().getColors()[8];

		cube.getGreen().getColors()[2] = cube.getYellow().getColors()[6];
		cube.getGreen().getColors()[5] = cube.getYellow().getColors()[3];
		cube.getGreen().getColors()[8] = cube.getYellow().getColors()[0];

		cube.getYellow().getColors()[0] = tempSideColors[2];
		cube.getYellow().getColors()[3] = tempSideColors[1];
		cube.getYellow().getColors()[6] = tempSideColors[0];

	}

	@Override
	public void rotateAntiClockwise(Cube cube) {
		System.out.println("Rotate Red face Ant-clockwise");
		super.rotateAntiClockwise(cube);

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getBlue().getColors()[2];
		tempSideColors[1] = cube.getBlue().getColors()[5];
		tempSideColors[2] = cube.getBlue().getColors()[8];

		cube.getBlue().getColors()[2] = cube.getYellow().getColors()[6];
		cube.getBlue().getColors()[5] = cube.getYellow().getColors()[3];
		cube.getBlue().getColors()[8] = cube.getYellow().getColors()[0];

		cube.getYellow().getColors()[0] = cube.getGreen().getColors()[8];
		cube.getYellow().getColors()[3] = cube.getGreen().getColors()[5];
		cube.getYellow().getColors()[6] = cube.getGreen().getColors()[2];

		cube.getGreen().getColors()[2] = cube.getWhite().getColors()[2];
		cube.getGreen().getColors()[5] = cube.getWhite().getColors()[5];
		cube.getGreen().getColors()[8] = cube.getWhite().getColors()[8];

		cube.getWhite().getColors()[2] = tempSideColors[0];
		cube.getWhite().getColors()[5] = tempSideColors[1];
		cube.getWhite().getColors()[8] = tempSideColors[2];

	}

}
