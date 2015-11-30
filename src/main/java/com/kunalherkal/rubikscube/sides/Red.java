package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;

public final class Red extends SideAdapter {

	@Inject
	public Red() {
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.RED;
		}
	}

	@Override
	public void rotateClockwise() {
		System.out.println("Rotate Red face clockwise");
		super.rotateClockwise();

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getYellow().getColors()[6];
		tempSideColors[1] = cube.getYellow().getColors()[7];
		tempSideColors[2] = cube.getYellow().getColors()[8];
		
		cube.getYellow().getColors()[6] = cube.getBlue().getColors()[8];
		cube.getYellow().getColors()[7] = cube.getBlue().getColors()[5];
		cube.getYellow().getColors()[8] = cube.getBlue().getColors()[2];
		
		cube.getBlue().getColors()[2] = cube.getWhite().getColors()[0];
		cube.getBlue().getColors()[5] = cube.getWhite().getColors()[1];
		cube.getBlue().getColors()[8] = cube.getWhite().getColors()[2];
		
		cube.getWhite().getColors()[0] = cube.getGreen().getColors()[6];
		cube.getWhite().getColors()[1] = cube.getGreen().getColors()[3];
		cube.getWhite().getColors()[2] = cube.getGreen().getColors()[0];
		
		cube.getGreen().getColors()[0] = tempSideColors[0];
		cube.getGreen().getColors()[3] = tempSideColors[1];
		cube.getGreen().getColors()[6] = tempSideColors[2];
		

	}

	@Override
	public void rotateAntiClockwise() {
		System.out.println("Rotate Red face Ant-clockwise");
		super.rotateAntiClockwise();

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getYellow().getColors()[6];
		tempSideColors[1] = cube.getYellow().getColors()[7];
		tempSideColors[2] = cube.getYellow().getColors()[8];
		
		cube.getYellow().getColors()[6] = cube.getGreen().getColors()[0];
		cube.getYellow().getColors()[7] = cube.getGreen().getColors()[3];
		cube.getYellow().getColors()[8] = cube.getGreen().getColors()[6];
		
		cube.getGreen().getColors()[0] = cube.getWhite().getColors()[2];
		cube.getGreen().getColors()[3] = cube.getWhite().getColors()[1];
		cube.getGreen().getColors()[6] = cube.getWhite().getColors()[0];
		
		cube.getWhite().getColors()[0] = cube.getBlue().getColors()[2];
		cube.getWhite().getColors()[1] = cube.getBlue().getColors()[5];
		cube.getWhite().getColors()[2] = cube.getBlue().getColors()[8];
		
		cube.getBlue().getColors()[2] = tempSideColors[2];
		cube.getBlue().getColors()[5] = tempSideColors[1];
		cube.getBlue().getColors()[8] = tempSideColors[0];

	}

}
