package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;
import com.kunalherkal.rubikscube.cube.Cube;

public final class Yellow extends SideAdapter {
	
	@Inject
	public Yellow(){
		
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.YELLOW;
		}
	}

	@Override
	public void rotateClockwise(Cube cube) {
		System.out.println("Rotate Yellow face clockwise");
		super.rotateClockwise(cube);
		
		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getBlue().getColors()[0];
		tempSideColors[1] = cube.getBlue().getColors()[1];
		tempSideColors[2] = cube.getBlue().getColors()[2];
		
		cube.getBlue().getColors()[0] = cube.getRed().getColors()[2];
		cube.getBlue().getColors()[1] = cube.getRed().getColors()[5];
		cube.getBlue().getColors()[2] = cube.getRed().getColors()[8];
		
		cube.getRed().getColors()[2] = cube.getGreen().getColors()[8];
		cube.getRed().getColors()[5] = cube.getGreen().getColors()[7];
		cube.getRed().getColors()[8] = cube.getGreen().getColors()[6];
		
		cube.getGreen().getColors()[8] = cube.getOrange().getColors()[6];
		cube.getGreen().getColors()[7] = cube.getOrange().getColors()[3];
		cube.getGreen().getColors()[6] = cube.getOrange().getColors()[0];
		
		cube.getOrange().getColors()[0] = tempSideColors[2];
		cube.getOrange().getColors()[3] = tempSideColors[1];
		cube.getOrange().getColors()[6] = tempSideColors[0];

	}

	@Override
	public void rotateAntiClockwise(Cube cube) {
		System.out.println("Rotate Yellow face Ant-clockwise");
		super.rotateAntiClockwise(cube);

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getBlue().getColors()[0];
		tempSideColors[1] = cube.getBlue().getColors()[1];
		tempSideColors[2] = cube.getBlue().getColors()[2];
		
		cube.getBlue().getColors()[0] = cube.getOrange().getColors()[6];
		cube.getBlue().getColors()[1] = cube.getOrange().getColors()[3];
		cube.getBlue().getColors()[2] = cube.getOrange().getColors()[0];
		
		cube.getOrange().getColors()[0] = cube.getGreen().getColors()[6];
		cube.getOrange().getColors()[3] = cube.getGreen().getColors()[7];
		cube.getOrange().getColors()[6] = cube.getGreen().getColors()[8];
		
		cube.getGreen().getColors()[6] = cube.getRed().getColors()[8];
		cube.getGreen().getColors()[7] = cube.getRed().getColors()[5];
		cube.getGreen().getColors()[8] = cube.getRed().getColors()[2];
		
		cube.getRed().getColors()[2] = tempSideColors[0];
		cube.getRed().getColors()[5] = tempSideColors[1];
		cube.getRed().getColors()[8] = tempSideColors[2];
	}

}
