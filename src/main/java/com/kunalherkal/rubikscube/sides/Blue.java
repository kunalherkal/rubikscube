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
		tempSideColors[0] = up.getColors()[0];
		tempSideColors[1] = up.getColors()[1];
		tempSideColors[2] = up.getColors()[2];
		
		up.getColors()[0] = left.getColors()[0];
		up.getColors()[1] = left.getColors()[1];
		up.getColors()[2] = left.getColors()[2];
		
		left.getColors()[0] = down.getColors()[0];
		left.getColors()[1] = down.getColors()[1];
		left.getColors()[2] = down.getColors()[2];
		
		down.getColors()[0] = right.getColors()[0];
		down.getColors()[1] = right.getColors()[1];
		down.getColors()[2] = right.getColors()[2];
		
		right.getColors()[0] = tempSideColors[0];
		right.getColors()[1] = tempSideColors[1];
		right.getColors()[2] = tempSideColors[2];
	}

	@Override
	public void rotateAntiClockwise() {
		System.out.println("Rotate Blue face Ant-clockwise");
		super.rotateAntiClockwise();

		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = up.getColors()[0];
		tempSideColors[1] = up.getColors()[1];
		tempSideColors[2] = up.getColors()[2];
		
		up.getColors()[0] = right.getColors()[0];
		up.getColors()[1] = right.getColors()[1];
		up.getColors()[2] = right.getColors()[2];
		
		right.getColors()[0] = down.getColors()[0];
		right.getColors()[1] = down.getColors()[1];
		right.getColors()[2] = down.getColors()[2];
		
		down.getColors()[0] = left.getColors()[0];
		down.getColors()[1] = left.getColors()[1];
		down.getColors()[2] = left.getColors()[2];
		
		left.getColors()[0] = tempSideColors[0];
		left.getColors()[1] = tempSideColors[1];
		left.getColors()[2] = tempSideColors[2];
	}

}
