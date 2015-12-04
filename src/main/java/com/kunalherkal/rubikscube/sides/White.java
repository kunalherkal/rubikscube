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
		tempSideColors[0] = cube.getBlue().getColors()[6];
		tempSideColors[1] = cube.getBlue().getColors()[7];
		tempSideColors[2] = cube.getBlue().getColors()[8];
		
		cube.getBlue().getColors()[6] = cube.getOrange().getColors()[6];
		cube.getBlue().getColors()[7] = cube.getOrange().getColors()[7];
		cube.getBlue().getColors()[8] = cube.getOrange().getColors()[8];
		
		cube.getOrange().getColors()[6] = cube.getGreen().getColors()[6];
		cube.getOrange().getColors()[7] = cube.getGreen().getColors()[7];
		cube.getOrange().getColors()[8] = cube.getGreen().getColors()[8];
		
		cube.getGreen().getColors()[6] = cube.getRed().getColors()[6];
		cube.getGreen().getColors()[7] = cube.getRed().getColors()[7];
		cube.getGreen().getColors()[8] = cube.getRed().getColors()[8];
		
		cube.getRed().getColors()[6] = tempSideColors[0];
		cube.getRed().getColors()[7] = tempSideColors[1];
		cube.getRed().getColors()[8] = tempSideColors[2];

	}

	@Override
	public void rotateAntiClockwise() {
		System.out.println("Rotate white face Ant-clockwise");
		super.rotateAntiClockwise();
		
		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getBlue().getColors()[6];
		tempSideColors[1] = cube.getBlue().getColors()[7];
		tempSideColors[2] = cube.getBlue().getColors()[8];
		
		cube.getBlue().getColors()[6] = cube.getRed().getColors()[6];
		cube.getBlue().getColors()[7] = cube.getRed().getColors()[7];
		cube.getBlue().getColors()[8] = cube.getRed().getColors()[8];
		
		cube.getRed().getColors()[6] = cube.getGreen().getColors()[6];
		cube.getRed().getColors()[7] = cube.getGreen().getColors()[7];
		cube.getRed().getColors()[8] = cube.getGreen().getColors()[8];
		
		cube.getGreen().getColors()[6] = cube.getOrange().getColors()[6];
		cube.getGreen().getColors()[7] = cube.getOrange().getColors()[7];
		cube.getGreen().getColors()[8] = cube.getOrange().getColors()[8];
		
		cube.getOrange().getColors()[6] = tempSideColors[0];
		cube.getOrange().getColors()[7] = tempSideColors[1];
		cube.getOrange().getColors()[8] = tempSideColors[2];
	}

}
