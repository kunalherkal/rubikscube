package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;

public final class White extends SideAdapter {

	@Inject
	public White() {
		
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.WHITE;
		}
	}

	@Override
	public void rotateClockwise(Cube cube) {
		System.out.println("Rotate white face clockwise");
		super.rotateClockwise(cube);
		
		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getBlue().getColors()[6];
		tempSideColors[1] = cube.getBlue().getColors()[7];
		tempSideColors[2] = cube.getBlue().getColors()[8];
		
		cube.getBlue().getColors()[6] = cube.getOrange().getColors()[8];
		cube.getBlue().getColors()[7] = cube.getOrange().getColors()[5];
		cube.getBlue().getColors()[8] = cube.getOrange().getColors()[2];
		
		cube.getOrange().getColors()[2] = cube.getGreen().getColors()[0];
		cube.getOrange().getColors()[5] = cube.getGreen().getColors()[1];
		cube.getOrange().getColors()[8] = cube.getGreen().getColors()[2];
		
		cube.getGreen().getColors()[0] = cube.getRed().getColors()[6];
		cube.getGreen().getColors()[1] = cube.getRed().getColors()[3];
		cube.getGreen().getColors()[2] = cube.getRed().getColors()[0];
		
		cube.getRed().getColors()[0] = tempSideColors[0];
		cube.getRed().getColors()[3] = tempSideColors[1];
		cube.getRed().getColors()[6] = tempSideColors[2];

	}

	@Override
	public void rotateAntiClockwise(Cube cube) {
		System.out.println("Rotate white face Ant-clockwise");
		super.rotateAntiClockwise(cube);
		
		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getBlue().getColors()[6];
		tempSideColors[1] = cube.getBlue().getColors()[7];
		tempSideColors[2] = cube.getBlue().getColors()[8];
		
		cube.getBlue().getColors()[6] = cube.getRed().getColors()[0];
		cube.getBlue().getColors()[7] = cube.getRed().getColors()[3];
		cube.getBlue().getColors()[8] = cube.getRed().getColors()[6];
		
		cube.getRed().getColors()[0] = cube.getGreen().getColors()[0];
		cube.getRed().getColors()[3] = cube.getGreen().getColors()[1];
		cube.getRed().getColors()[6] = cube.getGreen().getColors()[2];
		
		cube.getGreen().getColors()[0] = cube.getOrange().getColors()[2];
		cube.getGreen().getColors()[1] = cube.getOrange().getColors()[5];
		cube.getGreen().getColors()[2] = cube.getOrange().getColors()[8];
		
		cube.getOrange().getColors()[2] = tempSideColors[2];
		cube.getOrange().getColors()[5] = tempSideColors[1];
		cube.getOrange().getColors()[8] = tempSideColors[0];
	}

}
