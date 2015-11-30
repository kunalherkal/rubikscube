package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;

public final class Green extends SideAdapter {

	@Inject
	public Green() {
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.GREEN;
		}
	}

	@Override
	public void rotateClockwise(Cube cube) {
		System.out.println("Rotate Green face clockwise");
		super.rotateClockwise(cube);

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getWhite().getColors()[6];
		tempSideColors[1] = cube.getWhite().getColors()[7];
		tempSideColors[2] = cube.getWhite().getColors()[8];
		
		cube.getWhite().getColors()[6] = cube.getOrange().getColors()[6];
		cube.getWhite().getColors()[7] = cube.getOrange().getColors()[7];
		cube.getWhite().getColors()[8] = cube.getOrange().getColors()[8];
		
		cube.getOrange().getColors()[6] = cube.getYellow().getColors()[6];
		cube.getOrange().getColors()[7] = cube.getYellow().getColors()[7];
		cube.getOrange().getColors()[8] = cube.getYellow().getColors()[8];
		
		cube.getYellow().getColors()[6] = cube.getRed().getColors()[6];
		cube.getYellow().getColors()[7] = cube.getRed().getColors()[7];
		cube.getYellow().getColors()[8] = cube.getRed().getColors()[8];
		
		cube.getRed().getColors()[6] = tempSideColors[0];
		cube.getRed().getColors()[7] = tempSideColors[1];
		cube.getRed().getColors()[8] = tempSideColors[2];
	}

	@Override
	public void rotateAntiClockwise(Cube cube) {
		System.out.println("Rotate Green face Ant-clockwise");
		super.rotateAntiClockwise(cube);

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getWhite().getColors()[6];
		tempSideColors[1] = cube.getWhite().getColors()[7];
		tempSideColors[2] = cube.getWhite().getColors()[8];
		
		cube.getWhite().getColors()[6] = cube.getRed().getColors()[6];
		cube.getWhite().getColors()[7] = cube.getRed().getColors()[7];
		cube.getWhite().getColors()[8] = cube.getRed().getColors()[8];
		
		cube.getRed().getColors()[6] = cube.getYellow().getColors()[6];
		cube.getRed().getColors()[7] = cube.getYellow().getColors()[7];
		cube.getRed().getColors()[8] = cube.getYellow().getColors()[8];
		
		cube.getYellow().getColors()[6] = cube.getOrange().getColors()[6];
		cube.getYellow().getColors()[7] = cube.getOrange().getColors()[7];
		cube.getYellow().getColors()[8] = cube.getOrange().getColors()[8];
		
		cube.getOrange().getColors()[6] = tempSideColors[0];
		cube.getOrange().getColors()[7] = tempSideColors[1];
		cube.getOrange().getColors()[8] = tempSideColors[2];
	}

}
