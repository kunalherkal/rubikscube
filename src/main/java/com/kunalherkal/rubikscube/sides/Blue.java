package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;

public final class Blue extends SideAdapter {
	
	@Inject
	public Blue(){
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.BLUE;
		}
	}

	@Override
	public void rotateClockwise() {
		System.out.println("Rotate Blue face clockwise");
		super.rotateClockwise();

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getYellow().getColors()[0];
		tempSideColors[1] = cube.getYellow().getColors()[1];
		tempSideColors[2] = cube.getYellow().getColors()[2];
		
		cube.getYellow().getColors()[0] = cube.getOrange().getColors()[0];
		cube.getYellow().getColors()[1] = cube.getOrange().getColors()[1];
		cube.getYellow().getColors()[2] = cube.getOrange().getColors()[2];
		
		cube.getOrange().getColors()[0] = cube.getWhite().getColors()[0];
		cube.getOrange().getColors()[1] = cube.getWhite().getColors()[1];
		cube.getOrange().getColors()[2] = cube.getWhite().getColors()[2];
		
		cube.getWhite().getColors()[0] = cube.getRed().getColors()[0];
		cube.getWhite().getColors()[1] = cube.getRed().getColors()[1];
		cube.getWhite().getColors()[2] = cube.getRed().getColors()[2];
		
		cube.getRed().getColors()[0] = tempSideColors[0];
		cube.getRed().getColors()[1] = tempSideColors[1];
		cube.getRed().getColors()[2] = tempSideColors[2];
	}

	@Override
	public void rotateAntiClockwise() {
		System.out.println("Rotate Blue face Ant-clockwise");
		super.rotateAntiClockwise();

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getYellow().getColors()[0];
		tempSideColors[1] = cube.getYellow().getColors()[1];
		tempSideColors[2] = cube.getYellow().getColors()[2];
		
		cube.getYellow().getColors()[0] = cube.getRed().getColors()[0];
		cube.getYellow().getColors()[1] = cube.getRed().getColors()[1];
		cube.getYellow().getColors()[2] = cube.getRed().getColors()[2];
		
		cube.getRed().getColors()[0] = cube.getWhite().getColors()[0];
		cube.getRed().getColors()[1] = cube.getWhite().getColors()[1];
		cube.getRed().getColors()[2] = cube.getWhite().getColors()[2];
		
		cube.getWhite().getColors()[0] = cube.getOrange().getColors()[0];
		cube.getWhite().getColors()[1] = cube.getOrange().getColors()[1];
		cube.getWhite().getColors()[2] = cube.getOrange().getColors()[2];
		
		cube.getOrange().getColors()[0] = tempSideColors[0];
		cube.getOrange().getColors()[1] = tempSideColors[1];
		cube.getOrange().getColors()[2] = tempSideColors[2];
	}

}
