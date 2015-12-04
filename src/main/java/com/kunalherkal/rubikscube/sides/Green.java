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
		tempSideColors[0] = cube.getYellow().getColors()[2];
		tempSideColors[1] = cube.getYellow().getColors()[5];
		tempSideColors[2] = cube.getYellow().getColors()[8];
		
		cube.getYellow().getColors()[2] = cube.getRed().getColors()[2];
		cube.getYellow().getColors()[5] = cube.getRed().getColors()[5];
		cube.getYellow().getColors()[8] = cube.getRed().getColors()[8];
		
		cube.getRed().getColors()[2] = cube.getWhite().getColors()[2];
		cube.getRed().getColors()[5] = cube.getWhite().getColors()[5];
		cube.getRed().getColors()[8] = cube.getWhite().getColors()[8];
		
		cube.getWhite().getColors()[2] = cube.getOrange().getColors()[6];
		cube.getWhite().getColors()[5] = cube.getOrange().getColors()[3];
		cube.getWhite().getColors()[8] = cube.getOrange().getColors()[0];
		
		cube.getOrange().getColors()[0] = tempSideColors[2];
		cube.getOrange().getColors()[3] = tempSideColors[1];
		cube.getOrange().getColors()[6] = tempSideColors[0];
		
		
		
		
	}

	@Override
	public void rotateAntiClockwise() {
		System.out.println("Rotate Green face Ant-clockwise");
		super.rotateAntiClockwise();

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = cube.getYellow().getColors()[2];
		tempSideColors[1] = cube.getYellow().getColors()[5];
		tempSideColors[2] = cube.getYellow().getColors()[8];
		
		cube.getYellow().getColors()[2] = cube.getOrange().getColors()[6];
		cube.getYellow().getColors()[5] = cube.getOrange().getColors()[3];
		cube.getYellow().getColors()[8] = cube.getOrange().getColors()[0];
		
		cube.getOrange().getColors()[0] = cube.getWhite().getColors()[8];
		cube.getOrange().getColors()[3] = cube.getWhite().getColors()[5];
		cube.getOrange().getColors()[6] = cube.getWhite().getColors()[2];
		
		cube.getWhite().getColors()[2] = cube.getRed().getColors()[2];
		cube.getWhite().getColors()[5] = cube.getRed().getColors()[5];
		cube.getWhite().getColors()[8] = cube.getRed().getColors()[8];
		
		cube.getRed().getColors()[2] = tempSideColors[0];
		cube.getRed().getColors()[5] = tempSideColors[1];
		cube.getRed().getColors()[8] = tempSideColors[2];
	}

}
