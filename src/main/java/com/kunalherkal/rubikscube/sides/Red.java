package com.kunalherkal.rubikscube.sides;

import com.google.inject.Inject;
import com.kunalherkal.rubikscube.colors.Color;

public final class Red extends SideAdapter {
	
	@Inject
	public Red(){
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.RED;
		}
	}

	@Override
	public void rotateClockwise() {
		System.out.println("Rotate Red face clockwise");
		super.rotateClockwise();
		
		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = up.getColors()[2];
		tempSideColors[1] = up.getColors()[5];
		tempSideColors[2] = up.getColors()[8];
		
		up.getColors()[2] = left.getColors()[2];
		up.getColors()[5] = left.getColors()[5];
		up.getColors()[8] = left.getColors()[8];
		
		left.getColors()[2] = down.getColors()[2];
		left.getColors()[5] = down.getColors()[5];
		left.getColors()[8] = down.getColors()[8];
		
		down.getColors()[2] = right.getColors()[6];
		down.getColors()[5] = right.getColors()[3];
		down.getColors()[8] = right.getColors()[0];
		
		right.getColors()[0] = tempSideColors[2];
		right.getColors()[3] = tempSideColors[1];
		right.getColors()[6] = tempSideColors[0];

	}

	@Override
	public void rotateAntiClockwise() {
		System.out.println("Rotate Red face Ant-clockwise");
		super.rotateAntiClockwise();
		
		Color[] tempSideColors = new Color[3];
		tempSideColors[0] = up.getColors()[2];
		tempSideColors[1] = up.getColors()[5];
		tempSideColors[2] = up.getColors()[8];
		
		up.getColors()[2] = right.getColors()[6];
		up.getColors()[5] = right.getColors()[3];
		up.getColors()[8] = right.getColors()[0];
		
		right.getColors()[0] = down.getColors()[8];
		right.getColors()[3] = down.getColors()[5];
		right.getColors()[6] = down.getColors()[2];
		
		down.getColors()[2] = left.getColors()[2];
		down.getColors()[5] = left.getColors()[5];
		down.getColors()[8] = left.getColors()[8];
		
		left.getColors()[2] = tempSideColors[0];
		left.getColors()[5] = tempSideColors[1];
		left.getColors()[8] = tempSideColors[2];

	}

}
