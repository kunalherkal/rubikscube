package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;

public final class Yellow extends SideAdapter {
	
	@Inject
	public Yellow(){
		
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.YELLOW;
		}
	}

	@Override
	public void rotateClockwise() {
		System.out.println("Rotate Yellow face clockwise");
		super.rotateClockwise();
		
		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getBlue().getColors()[0];
		tempSideColors[1] = cube.getBlue().getColors()[1];
		tempSideColors[2] = cube.getBlue().getColors()[2];
		
		cube.getBlue().getColors()[0] = cube.getRed().getColors()[0];
		cube.getBlue().getColors()[1] = cube.getRed().getColors()[1];
		cube.getBlue().getColors()[2] = cube.getRed().getColors()[2];
		
		cube.getRed().getColors()[0] = cube.getGreen().getColors()[0];
		cube.getRed().getColors()[1] = cube.getGreen().getColors()[1];
		cube.getRed().getColors()[2] = cube.getGreen().getColors()[2];
		
		cube.getGreen().getColors()[0] = cube.getOrange().getColors()[0];
		cube.getGreen().getColors()[1] = cube.getOrange().getColors()[1];
		cube.getGreen().getColors()[2] = cube.getOrange().getColors()[2];
		
		cube.getOrange().getColors()[0] = tempSideColors[0];
		cube.getOrange().getColors()[1] = tempSideColors[1];
		cube.getOrange().getColors()[2] = tempSideColors[2];

	}

	@Override
	public void rotateAntiClockwise() {
		System.out.println("Rotate Yellow face Ant-clockwise");
		super.rotateAntiClockwise();

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getBlue().getColors()[0];
		tempSideColors[1] = cube.getBlue().getColors()[1];
		tempSideColors[2] = cube.getBlue().getColors()[2];
		
		cube.getBlue().getColors()[0] = cube.getOrange().getColors()[0];
		cube.getBlue().getColors()[1] = cube.getOrange().getColors()[1];
		cube.getBlue().getColors()[2] = cube.getOrange().getColors()[2];
		
		cube.getOrange().getColors()[0] = cube.getGreen().getColors()[0];
		cube.getOrange().getColors()[1] = cube.getGreen().getColors()[1];
		cube.getOrange().getColors()[2] = cube.getGreen().getColors()[2];
		
		cube.getGreen().getColors()[0] = cube.getRed().getColors()[0];
		cube.getGreen().getColors()[1] = cube.getRed().getColors()[1];
		cube.getGreen().getColors()[2] = cube.getRed().getColors()[2];
		
		cube.getRed().getColors()[0] = tempSideColors[0];
		cube.getRed().getColors()[1] = tempSideColors[1];
		cube.getRed().getColors()[2] = tempSideColors[2];
	}

}
