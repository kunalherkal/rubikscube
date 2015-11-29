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

	public void rotateClockwise() {
		System.out.println("Rotate Blue face clockwise");
		super.rotateClockwise();

	}

	public void rotateAntiClockwise() {
		System.out.println("Rotate Blue face Ant-clockwise");
		super.rotateAntiClockwise();

	}

}
